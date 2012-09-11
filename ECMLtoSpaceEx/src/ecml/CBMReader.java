package ecml;

import java.io.IOException;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import ecml.CPSBehavioralModel.BMOuterModel;
import ecml.CPSBehavioralModel.BMOuterModel.Port;
import ecml.Variable.PortClass;
import ecml.Variable.RateClass;
import ecml.Variable.TypeClass;

public class CBMReader {
    private CPSBehavioralModel cbm;
    private Document document;

    public CBMReader() {
    }

    public CPSBehavioralModel getCPSBehavioalModel() {
	return cbm;
    }

    public void parse(String filename) throws IllegalGrammarException,
	    SAXException, IOException {
	DOMParser parser = new DOMParser();
	parser.parse(filename);
	document = parser.getDocument();
	Node root = document.getFirstChild();
	NamedNodeMap rootattr = root.getAttributes();

	// Make CBM;
	// check it is cbm format
	int typeVar = getType(root);

	if (typeVar != CommonAttr.CPS_BEHAVIORAL_MODEL) {
	    System.err.println("This is not cbm root.");
	    throw new IllegalGrammarException();
	} else {
	    // Parse Root Node
	    cbm = new CPSBehavioralModel();
	    cbm.setName(rootattr.getNamedItem("name").getNodeValue());
	    cbm.setParent_name(rootattr.getNamedItem("parent_name")
		    .getNodeValue());

	    NodeList list = document.getChildNodes();
	    for (int i = 0; i < list.getLength(); i++) {
		Node childnode = list.item(i);
		int type = getType(childnode);

		// input/output
		switch (type) {
		case CommonAttr.INPUT_VARIABLE:
		case CommonAttr.OUTPUT_VARIABLE:
		    setVariable(childnode, type);
		    break;
		case CommonAttr.BEHAVIORAL_MODEL:
		    createBehavioralModel(childnode);
		    break;
		}
	    }
	}
    }

    /**
     * Create variable structure
     * @param childnode
     * @param type
     */
    private void setVariable(Node varnode, int type) {
	Variable variable = new Variable();
	setBasicAttr(variable, varnode);

	if (type == CommonAttr.INPUT_VARIABLE)
	    variable.setPort(PortClass.IN);
	else if (type == CommonAttr.OUTPUT_VARIABLE)
	    variable.setPort(PortClass.OUT);

	String name = varnode.getAttributes().getNamedItem("name")
		.getNodeValue();	
	if (name != null) {
	    variable.setInitialValue(name);
	}
	cbm.addVariable(variable);
    }
    
    /**set output behaviormodel
     * 
     * @param bmnode behavior model node.
     */
    private void createBehavioralModel(Node bmnode){
	setBasicAttr(cbm.getOutermodel(), bmnode);
	BMOuterModel outmodel = cbm.getOutermodel();
	
	NodeList nodelist = bmnode.getChildNodes();
	
	for(int i=0;i<nodelist.getLength();i++){
	    Node current = nodelist.item(i);
	    int type = getType(current);
	    switch(type){
	    case CommonAttr.BEHAVIORAL_INNER_MODEL:
		createInnerBehavioralModel(current);
		break;
	    case CommonAttr.INNER_PORT:
		Port inner_port = new Port();
		setBasicAttr(inner_port, current);
		inner_port.setHils(current.getAttributes().getNamedItem("hils").getNodeValue());
		outmodel.addPort(inner_port);
		break;
	    case CommonAttr.OUTER_PORT:
		Port outer_port = new Port();
		setBasicAttr(outer_port, current);
		outer_port.setHils(current.getAttributes().getNamedItem("hils").getNodeValue());
		outmodel.addPort(outer_port);
		break;
		
	    }
	}
    }
    /**
     * parsing entry node with type = 11
     * @param inbmnode
     */
    private void createInnerBehavioralModel(Node inbmnode){
	setBasicAttr(cbm.getInnermodel(), inbmnode);
	NodeList childs = inbmnode.getChildNodes();
	for(int i=0;i<childs.getLength();i++){
	    Node current = childs.item(i);
	    int type = getType(current);
	    switch(type){
	    case CommonAttr.STATE_VAR_SET:
		createStateVarSet(current);
		break;	    
	    }
	    
	}
	
    }
    /**
     * PARSING variable with type = 12
     * @param currentNode
     */
    private void createStateVarSet(Node currentNode){
	NodeList childs = currentNode.getChildNodes();
	
    }

    static private int getType(Node current) {
	NamedNodeMap nodemap = current.getAttributes();
	return Integer.parseInt(nodemap.getNamedItem("type").getNodeValue());
    }

    static public void parseVariableStrTest(String var_spec, Variable var)
	    throws IllegalGrammarException {
	parseVariableStr(var_spec, var);
    }

    /**
     * 
     * @param var_spec
     * @param var
     * @throws IllegalGrammarException
     */
    static private void parseVariableStr(String var_spec, Variable var)
	    throws IllegalGrammarException {

	/**
	 * Input type [rate] name : type = number or [rate] name : type example)
	 * [C] Thrust1 : double [C] Thrust1 : double = 0.0
	 */
	String[] var_array = var_spec.split(":");

	// Parsing result : [C] Thrust1
	String rate_name = var_array[0];

	String[] rate_name_arr = rate_name.split(" ");

	// Parsing result : [C]
	String rate = rate_name_arr[0];

	switch (rate) {
	case "[C]":
	    var.setRate(RateClass.CONSTANT);
	    break;
	case "[A]":
	    var.setRate(RateClass.ANALOG);
	    break;
	case "[D]":
	    var.setRate(RateClass.DISCRETE);
	    break;
	case "[E]":
	    var.setRate(RateClass.EVENT);
	    break;
	default:
	    throw new IllegalGrammarException();
	}

	// Parsing result : Thrust
	String name = rate_name_arr[1];
	var.setName(name);

	// Parsing result : double = 0.0
	String type_value = var_array[1];
	String type = new String();
	String value_str = new String();

	if (type_value.contains("=")) {
	    String[] type_value_arr = type_value.split("=");

	    type = type_value_arr[0].trim();
	    value_str = type_value_arr[1].trim();

	    var.setInitialValue(value_str);
	} else {
	    type = type_value.trim();
	}
	switch (type) {
	case "double":
	    var.setValueType(TypeClass.Double);
	    break;
	case "boolean":
	    var.setValueType(TypeClass.Boolean);
	    break;
	case "String":
	    var.setValueType(TypeClass.String);
	    throw new IllegalGrammarException();
	}
    }

    /**
     * Create common position
     * @param cee
     * @param node
     */
    static public void setBasicAttr(CommonAttr cee, Node node) {
	NamedNodeMap nodemap = node.getAttributes();
	long id = Long.parseLong(nodemap.getNamedItem("id").getNodeValue());
	cee.setId(id);

	int x = Integer.parseInt(nodemap.getNamedItem("x").getNodeValue());
	cee.setX(x);

	int y = Integer.parseInt(nodemap.getNamedItem("y").getNodeValue());
	cee.setY(y);

	int width = Integer.parseInt(nodemap.getNamedItem("width")
		.getNodeValue());
	cee.setWidth(width);

	int height = Integer.parseInt(nodemap.getNamedItem("height")
		.getNodeValue());
	cee.setWidth(height);

	int type = Integer
		.parseInt(nodemap.getNamedItem("type").getNodeValue());
	cee.setType(type);
	
	String name = nodemap.getNamedItem("name").getNodeValue();
	cee.setName(name);
	
    }

}
