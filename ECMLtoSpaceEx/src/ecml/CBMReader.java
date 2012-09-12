package ecml;

import java.io.IOException;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
		Node current = list.item(i);
		int type = getType(current);

		// input/output
		switch (type) {
		case CommonAttr.INPUT_VARIABLE:
		case CommonAttr.OUTPUT_VARIABLE:
		    setVariable(current, type);
		    break;
		case CommonAttr.BEHAVIORAL_MODEL:
		    createBehavioralModel(current);
		    break;
		}
	    }
	}
    }

    /**
     * Create variable structure
     * 
     * @param childnode
     * @param type
     */
    private void setVariable(Node varnode, int type) {
	Variable variable = new Variable();
	setBasicAttr(variable, varnode);

	switch (type) {
	case CommonAttr.INPUT_VARIABLE:
	    variable.setPort(PortClass.IN);
	    cbm.add_in_var(variable);
	    break;
	case CommonAttr.OUTPUT_VARIABLE:
	    variable.setPort(PortClass.OUT);
	    cbm.add_out_var(variable);
	    break;
	case CommonAttr.STATE_CONTINUOUS_VAR:
	    break;
	}
	String name = varnode.getAttributes().getNamedItem("name")
		.getNodeValue();
	if (name != null) {
	    variable.setInitialValue(name);
	}
    }

    /**
     * set output behaviormodel
     * 
     * @param bmnode
     *            behavior model node.
     * @throws IllegalGrammarException 
     */
    private void createBehavioralModel(Node bmnode) throws IllegalGrammarException {
	setBasicAttr(cbm.get_behavior_model(), bmnode);

	NodeList nodelist = bmnode.getChildNodes();

	for (int i = 0; i < nodelist.getLength(); i++) {
	    Node current = nodelist.item(i);
	    int type = getType(current);
	    switch (type) {
	    case CommonAttr.BEHAVIORAL_INNER_MODEL:
		setBasicAttr(cbm.getInner_behavior_model(), current);
		createInnerBehavioralModel(current);
		break;
	    case CommonAttr.INNER_PORT:
	    case CommonAttr.OUTER_PORT:
		BasicComponent port = new BasicComponent();
		setBasicAttr(port, current);
		port.setHils(current.getAttributes().getNamedItem("hils")
			.getNodeValue());
		cbm.add_port(port);
		break;
	    }
	}
    }

    /**
     * parsing entry node with type = 11
     * 
     * @param inbmnode
     * @throws IllegalGrammarException 
     */
    private void createInnerBehavioralModel(Node inbmnode) throws IllegalGrammarException {
	NodeList childs = inbmnode.getChildNodes();

	for (int i = 0; i < childs.getLength(); i++) {
	    Node current = childs.item(i);
	    int type = getType(current);
	    switch (type) {
	    case CommonAttr.STATE_VAR_SET:
		setBasicAttr(cbm.get_var_set(), current);
		createStateVarSet(current);
		break;
	    case CommonAttr.PHASE:		
		create_phase(current);
		break;
	    case CommonAttr.INITIAL_STATE:
		create_initial_state(current);
		break;
	    }

	}

    }

    private void create_phase(Node phase_node) {
	Phase phase = new Phase();
	setBasicAttr(phase, phase_node);
	
	phase.setDefine_model_name(phase_node.getAttributes().getNamedItem("define_model_name").getNodeValue());
	
	Node state_model = phase_node.getFirstChild();
	setBasicAttr(phase.get_state_model(), state_model);
	
	NodeList state_models = state_model.getChildNodes();
	
	for(int i=0;i<state_models.getLength();i++){
	    Node current = state_models.item(i);
	    StateFormula formula = new StateFormula();
	    setBasicAttr(formula, current);
	    phase.addFormula(formula);
	}
	cbm.add_phase(phase);
    }

    private void create_initial_state(Node initial_node) {
	Initial initial = cbm.get_initial();
	setBasicAttr(initial, initial_node);	
    }

    /**
     * PARSING variable with type = 12
     * 
     * @param currentNode
     * @throws IllegalGrammarException 
     */
    private void createStateVarSet(Node currentNode) throws IllegalGrammarException {
	NodeList childs = currentNode.getChildNodes();

	for (int i = 0; i < childs.getLength(); i++) {
	    Node current = childs.item(i);
	    int type = getType(current);

	    switch (type) {
	    case CommonAttr.STATE_CONTINUOUS_VAR_SET:
		setBasicAttr(cbm.get_cont_var_set(), current);
		break;
	    case CommonAttr.STATE_DISCRETE_VAR_SET:
		setBasicAttr(cbm.get_disc_var_set(), current);
		break;
		default:
		    throw new IllegalGrammarException();
	    }
	    NodeList variables = current.getChildNodes();
	    for (int j = 0; j < childs.getLength(); j++) {
		Node variablenode = variables.item(i);
		int var_type = getType(variablenode);
		setVariable(variablenode, var_type);
	    }
	}

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
     * 
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
