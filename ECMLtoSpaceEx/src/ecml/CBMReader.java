package ecml;

import java.io.IOException;

import org.antlr.runtime.RecognitionException;
import org.apache.log4j.Logger;
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
	private BehavioralModel cbm;
	private Document document;
	static private Logger log = Logger.getLogger(CBMReader.class);

	public CBMReader() {
	}

	public BehavioralModel parse(String filename)
			throws IllegalGrammarException, SAXException, IOException, RecognitionException {
		DOMParser parser = new DOMParser();
		parser.parse(filename);
		document = parser.getDocument();
		Node root = document.getFirstChild();
		NamedNodeMap rootattr = root.getAttributes();

		// Make CBM;
		// check it is cbm format
		int type = getType(root);
		log.debug("Current type : " + type);

		if (type != CommonAttr.CPS_BEHAVIORAL_MODEL) {
			System.err.println("This is not cbm root.");
			throw new IllegalGrammarException();
		} else {
			// Parse Root Node
			cbm = new BehavioralModel();
			cbm.setName(rootattr.getNamedItem("name").getNodeValue());
			cbm.setParent_name(rootattr.getNamedItem("parent_name")
					.getNodeValue());

			NodeList list = root.getChildNodes();
			log.debug("Current List number : " + list.getLength());

			for (int i = 0; i < list.getLength(); i++) {
				Node current = list.item(i);
				if (current.getNodeType() == Node.ELEMENT_NODE) {
					type = getType(current);
					log.debug("Current type : " + type);
					// input/output
					switch (type) {
					case CommonAttr.INPUT_VARIABLE:
					case CommonAttr.OUTPUT_VARIABLE:
						createVariable(current);
						break;
					case CommonAttr.BEHAVIORAL_MODEL:
						createBehavioralModel(current);
						break;
					case CommonAttr.CONNECTION_IN:
					case CommonAttr.CONNECTION_OUT:
						setConnection(current);
						break;
					}
				}
			}
		}
		return cbm;
	}

	public void createVariable(Node node) throws IllegalGrammarException, RecognitionException {
		int porttype = Integer.parseInt(getAttrValue(node, "type"));
		Variable var = new Variable();
		setBasicAttr(var, node);

		switch (porttype) {
		case CommonAttr.INPUT_VARIABLE:
			var.setPort(PortClass.IN);
			break;
		case CommonAttr.OUTPUT_VARIABLE:
			var.setPort(PortClass.OUT);
			break;
		case CommonAttr.STATE_DISCRETE_VAR:
		case CommonAttr.STATE_CONTINUOUS_VAR:
			var.setPort(PortClass.STATE);
			break;
		}

		String var_spec = getAttrValue(node, "name");

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
		cbm.add_var(var);

	}

	static private String getAttrValue(Node current, String attr_name) {
		return current.getAttributes().getNamedItem(attr_name).getNodeValue();
	}

	private void setConnection(Node varnode) throws RecognitionException {
		Connection connection = new Connection();

		connection.setID(Long.parseLong(getAttrValue(varnode, "id")));
		connection.setType(Integer.parseInt(getAttrValue(varnode, "type")));
		connection.setIs_middle_label(getAttrValue(varnode, "is_middle_label"));

		connection.setIs_source_label(getAttrValue(varnode, "is_source_label"));
		connection.setIs_source_point(getAttrValue(varnode, "is_source_point"));
		connection.setIs_target_label(getAttrValue(varnode, "is_target_label"));
		connection.setIs_target_point(getAttrValue(varnode, "is_target_point"));
		connection.setSource_id(Long.parseLong(getAttrValue(varnode,
				"source_id")));
		connection.setTarget_id(Long.parseLong(getAttrValue(varnode,
				"target_id")));
		if (connection.getType() == CommonAttr.CONNECTION_OUT)
			connection
					.setMiddle_content(getAttrValue(varnode, "middle_content"));

		cbm.add_connection(connection);
	}

	/**
	 * set output behaviormodel
	 * 
	 * @param bmnode
	 *            behavior model node.
	 * @throws IllegalGrammarException
	 * @throws RecognitionException 
	 */
	private void createBehavioralModel(Node bmnode)
			throws IllegalGrammarException, RecognitionException {
		setBasicAttr(cbm.get_behavior_model(), bmnode);

		NodeList nodelist = bmnode.getChildNodes();

		for (int i = 0; i < nodelist.getLength(); i++) {
			Node current = nodelist.item(i);
			if (current.getNodeType() == Node.ELEMENT_NODE) {
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
	}

	/**
	 * parsing entry node with type = 11
	 * 
	 * @param inbmnode
	 * @throws IllegalGrammarException
	 * @throws RecognitionException 
	 */
	private void createInnerBehavioralModel(Node inbmnode)
			throws IllegalGrammarException, RecognitionException {
		NodeList childs = inbmnode.getChildNodes();

		for (int i = 0; i < childs.getLength(); i++) {
			Node current = childs.item(i);

			if (current.getNodeType() == Node.ELEMENT_NODE) {

				int type = getType(current);
				log.debug("Current type : " + type);
				switch (type) {
				case CommonAttr.STATE_VAR_SET:
					setBasicAttr(cbm.get_var_set_node(), current);
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

	}

	/**
	 * create phase
	 * 
	 * @param phase_node
	 * @throws RecognitionException 
	 */
	private void create_phase(Node phase_node) throws RecognitionException {

		Phase phase = new Phase();
		setBasicAttr(phase, phase_node);

		phase.setIs_define_model(phase_node.getAttributes()
				.getNamedItem("is_define_model").getNodeValue());
		phase.setDefine_model_name(phase_node.getAttributes()
				.getNamedItem("define_model_name").getNodeValue());

		NodeList phase_node_childs = phase_node.getChildNodes();
		Node state_model_node = null;
		for (int i = 0; i < phase_node_childs.getLength(); i++) {
			Node current = phase_node_childs.item(i);
			if (current.getNodeType() == Node.ELEMENT_NODE) {
				state_model_node = current;
				break;
			}
		}

		setBasicAttr(phase.get_state_model(), state_model_node);

		NodeList state_models = state_model_node.getChildNodes();

		for (int i = 0; i < state_models.getLength(); i++) {
			Node current = state_models.item(i);
			if (current.getNodeType() == Node.ELEMENT_NODE) {
				StateFormula formula = new StateFormula();
				setBasicAttr(formula, current);
				phase.addFormula(formula);
			}
		}
		cbm.add_phase(phase);
	}

	private void create_initial_state(Node initial_node) throws RecognitionException {
		Initial initial = cbm.get_initial();
		setBasicAttr(initial, initial_node);
	}

	/**
	 * PARSING variable with type = 12
	 * 
	 * @param currentNode
	 * @throws IllegalGrammarException
	 * @throws RecognitionException 
	 */
	private void createStateVarSet(Node currentNode)
			throws IllegalGrammarException, RecognitionException {
		NodeList childs = currentNode.getChildNodes();

		for (int i = 0; i < childs.getLength(); i++) {
			Node current = childs.item(i);
			if (current.getNodeType() == Node.ELEMENT_NODE) {
				int type = getType(current);
				log.debug("Current type : " + type);
				switch (type) {
				// type=13
				case CommonAttr.STATE_CONTINUOUS_VAR_SET:
					setBasicAttr(cbm.get_cont_var_set_node(), current);
					break;
				// type=14
				case CommonAttr.STATE_DISCRETE_VAR_SET:
					setBasicAttr(cbm.get_disc_var_set_node(), current);
					break;
				default:
					throw new IllegalGrammarException();
				}

				NodeList variables = current.getChildNodes();

				for (int j = 0; j < variables.getLength(); j++) {
					Node state_variable = variables.item(j);

					if (state_variable.getNodeType() == Node.ELEMENT_NODE) {
						createVariable(state_variable);
					}
				}
			}
		}
	}

	static private int getType(Node current) {
		NamedNodeMap nodemap = current.getAttributes();
		return Integer.parseInt(nodemap.getNamedItem("type").getNodeValue());
	}

	/**
	 * Create common position
	 * 
	 * @param cee
	 * @param node
	 * @throws RecognitionException 
	 */
	static public void setBasicAttr(CommonAttr cee, Node node) throws RecognitionException {
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
