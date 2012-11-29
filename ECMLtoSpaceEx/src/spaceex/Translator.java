package spaceex;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;

import parsers.ECMLFormulaLexer;
import parsers.ECMLFormulaParser;
import parsers.SxExpression;
import parsers.SxNegTree;

import sspaceex.SXSspaceex;
import sspaceex.SxBind;
import sspaceex.SxComponent;
import sspaceex.SxComponentBase;
import sspaceex.SxComponentNetwork;
import sspaceex.SxElement;
import sspaceex.SxLocation;
import sspaceex.SxParam;
import sspaceex.SxTransition;
import ecml.BehavioralModel;
import ecml.CommonAttr;
import ecml.Connection;
import ecml.Phase;
import ecml.StateFormula;
import ecml.Variable;
import ecml.Variable.PortClass;
import ecml.Variable.RateClass;

public class Translator {
	Logger log = Logger.getLogger(Translator.class);
	private int location_id = 1;

	public Translator() {

	}

	/**
	 * translation for ecml into spaceEx
	 * 
	 * 
	 * @param cbm
	 * @return
	 * @throws RecognitionException
	 */
	public SXSspaceex translation(BehavioralModel cbm)
			throws RecognitionException {
		SXSspaceex ex = new SXSspaceex();
		
		List<SxComponentBase> component_list = new ArrayList<SxComponentBase>();
		component_list.add(create_generated_automata(ex, cbm));
					
		SxComponentBase timing_automaton = create_timing_automaton(ex);
		SxComponentBase[] lists = component_list.toArray(new SxComponentBase[component_list.size()]);
		ex.add(create_composed_network(ex, timing_automaton, lists));
		
		return ex;
	}
	private SxComponentBase create_generated_automata(SXSspaceex ex, BehavioralModel cbm) throws RecognitionException{
		log.debug("create generated automata");
		SxComponentBase componentBase = ex.newComponentBase();
		
		componentBase.setId(cbm.getName());
		
		
		ex.add(componentBase);
		create_param(cbm, ex, componentBase);
		translation(cbm, ex, componentBase);
		componentBase.remove((SxLocation) componentBase.getLocations().toArray()[0]);
		return componentBase;
	}
	private SxComponentNetwork create_composed_network(SXSspaceex ex, SxComponentBase timing_automaton, SxComponentBase [] model_list ){
		SxComponentNetwork composed_network = ex.newComponentNetwork();
		
		composed_network.setId("overall_network1");
		
		SxBind bind_timing_automaton = new SxBind(ex, composed_network, timing_automaton, "timed_component");		
		composed_network.add(bind_timing_automaton);
		for(SxComponentBase sxc_base: model_list){
			SxBind bind_model = new SxBind(ex, composed_network, sxc_base, sxc_base.getId());
			composed_network.add(bind_model);
		}
		
		return composed_network;
	}
	
	
	
	

	private void create_param(BehavioralModel cbm, SXSspaceex ex,
			SxComponentBase cbase) {
		for (Variable var : cbm.get_variables()) {
			String name = var.getName();
			SxParam param = new SxParam(ex, name, "real");
			param.setControlled(true);

			switch (var.getRate()) {
			case CONSTANT:
				param.setDynamics("const");
				break;
			case ANALOG:
			case DISCRETE:
			case EVENT:
				param.setDynamics("any");
				break;
			}
			switch (var.getPort()) {
			case IN:
			case OUT:
				param.setLocal(false);
				break;
			case STATE:
				param.setLocal(true);
				break;
			}
			cbase.add(param);
		}
	}
	private SxComponentBase create_timing_automaton(SXSspaceex ex){
		log.debug("create timing_automaton");
		SxComponentBase base = new SxComponentBase(ex, "timing_automaton");
				
		log.debug("parameter add");
		SxParam param = new SxParam(ex,"t", "real");
		param.setControlled(true);
		param.setLocal(true);
		base.add(param);
		
		log.debug("location add");
		SxLocation loc = new SxLocation(ex, base);
		loc.setName("init");
		loc.setInvariant("t<=" + 600);
		loc.setFlow("t'==1");
		base.add(loc);
		
		ex.add(base);
		
		return base;
	}

	// Transition을 통해서 Location을 생성하고 Location의 Invarant를 설정한다.
	private void translation(BehavioralModel cbm, SXSspaceex ex,
			SxComponentBase cbase) throws RecognitionException {
		Collection<Connection> conns = cbm.get_connections();
		Map<Long, List<SxLocation>> location_groups = new HashMap<Long, List<SxLocation>>();

		// 각 Phase마다 대응되는 Location Group을 생성한다.

		for (Phase phase : cbm.getPhases()) {
			Long id = phase.getID();
			int phase_appendix = 1;
			log.debug("generate location from phase ID : " + id);
			List<SxLocation> loc_list = new ArrayList<SxLocation>();
			location_groups.put(id, loc_list);
			List<Connection> conn_list = cbm.get_out_connections(id);
			List<List<Tree>> neg_table = new ArrayList<List<Tree>>();

			for (Connection conn : conn_list) {
				if (conn.getMiddle_content() != null) {

					ECMLFormulaParser.connection_contents_return parsed_contents = conn
							.get_middle_content_tree();

					// 파싱된 contents에서 condition tree들을 추가한다.
					for (Tree cond : parsed_contents.conditions) {
						log.debug("condition tree : " + cond.toStringTree());
						CommonTreeNodeStream stream = new CommonTreeNodeStream(
								cond);
						SxNegTree sxNegTree = new SxNegTree(stream);
						SxNegTree.and_exp_return and_exp = sxNegTree.and_exp();

						List<Tree> neg_list = new ArrayList<Tree>();
						Tree root_tree = (Tree) and_exp.getTree();
						log.debug("generated negation tree : "
								+ root_tree.toStringTree());

						Stack<Tree> treeStack = new Stack<Tree>();
						treeStack.push(root_tree);
						while (!treeStack.empty()) {
							Tree current_tree = treeStack.pop();

							if (((CommonTree) current_tree).token.getType() == SxNegTree.SXOR) {
								for (int i = 0; i < current_tree
										.getChildIndex(); i++)
									treeStack.push(current_tree.getChild(0));
							} else if (((CommonTree) current_tree).token
									.getType() == SxNegTree.RELOP) {
								log.debug("tree add : "
										+ current_tree.toStringTree());
								neg_list.add(current_tree);
							}
						}
						neg_table.add(neg_list);
					}
				}
			}
			// 연결하기 전
			log.debug("before connection");
			List<Tree> neg_list = new ArrayList<Tree>();
			for (int i = 0; i < neg_table.size(); i++) {
				if (i == 0) {
					neg_list.addAll(neg_table.get(0));
				} else {
					// 연결할 Tree목록을 가져온다.
					List<Tree> next_trees = neg_table.get(i);
					// 연결한 Tree를 저장할 목록을 생성한다.
					List<Tree> extended = new ArrayList<Tree>();
					for (Tree next_tree : next_trees) {
						for (Tree neg_tree : neg_list) {
							CommonTree and_token_tree = new CommonTree();
							and_token_tree.token = new CommonToken(
									SxNegTree.SXAND, "&");
							and_token_tree.addChild(next_tree);
							and_token_tree.addChild(neg_tree);
							extended.add(and_token_tree);
						}
					}
					neg_list = extended;
				}
			}

			// Tree로부터 String을 얻어낸 뒤, Location의 Invariant로 설정한다.
			for (Tree neg_tree : neg_list) {
				CommonTreeNodeStream stream = new CommonTreeNodeStream(neg_tree);
				SxExpression sx_exp = new SxExpression(stream);
				SxExpression.cond_exp_return cond_exp = sx_exp.cond_exp();
				log.debug(cond_exp.st.toString());

				SxLocation location = new SxLocation(ex, cbase);
				location.setName(phase.getName() + "_" + phase_appendix++);
				location.setInvariant(cond_exp.st.toString());
				location.setId(++location_id);
				log.debug(location);
				
				List<String> flows = new ArrayList<String>();
				
				for (int i = 0; i < phase.get_formulas().length; i++) {
					StateFormula formula = phase.get_formulas()[i];
					ECMLFormulaParser.state_model_return state_ret = formula
							.get_formula_return();
					CommonTreeNodeStream token_stream = new CommonTreeNodeStream(
							state_ret.getTree());
					SxExpression expression = new SxExpression(token_stream);
					SxExpression.state_model_return state_model_return = expression
							.state_model();

					
					if (state_model_return.is_flow) {
						flows.add(state_model_return.st.toString());						
					}
				}
				
				String flow_str = "";
				for(int i=0;i<flows.size();i++){
					flow_str += flows.get(i);
					if(i<flows.size()-1){
						flow_str +="&";
					}
				}
				location.setFlow(flow_str);
				loc_list.add(location);
				cbase.add(location);
			}
			//각 location들 간에 transition을 추가한다.
			for(int i=0;i<loc_list.size()-1;i++){				
				for(int j=i;j<loc_list.size();j++){
					SxLocation loc1 = loc_list.get(i);
					SxLocation loc2 = loc_list.get(j);
					
					SxTransition transition1 = new SxTransition(ex, loc1, loc2);
					SxTransition transition2 = new SxTransition(ex, loc2, loc1);
					
					cbase.add(transition1);
					cbase.add(transition2);
				}
			}
			
		}// phase for문 종료

		// 각 Connection별로 transition을 생성한다.
		for (Connection conn : conns) {
			if (conn.getMiddle_content() != null) {
				ECMLFormulaParser.connection_contents_return parsed_contents = conn
						.get_middle_content_tree();

				String action_str = "";
				if (parsed_contents.actions != null) {
					log.debug(parsed_contents.actions.toStringTree());
					// Set action string
					CommonTreeNodeStream act_node = new CommonTreeNodeStream(
							parsed_contents.actions);

					SxExpression actParser = new SxExpression(act_node);

					SxExpression.action_exps_return actions_ret = actParser
							.action_exps();
					action_str = actions_ret.st.toString();
				}

				Phase tgt_phase = cbm.getPhase(conn.getTarget_id());

				StateFormula[] formulas = tgt_phase.get_formulas();
				
				List<String> disc_actions = new ArrayList<String>();

				for (int i = 0; i < formulas.length; i++) {
					StateFormula formula = formulas[i];
					Tree state_formula_tree = (Tree) formula
							.get_formula_return().getTree();
					CommonTreeNodeStream stream = new CommonTreeNodeStream(
							state_formula_tree);
					SxExpression expression = new SxExpression(stream);
					SxExpression.state_model_return state_model_ret = expression
							.state_model();

					if (!state_model_ret.is_flow) {
						disc_actions.add(state_model_ret.st.toString());
					}
				}

				String disc_action = "";
				
				for(int i=0;i<disc_actions.size();i++){
					disc_action += disc_actions.get(i);
					if(i<disc_actions.size()-1)
						disc_action +="&";
				}
				if (!disc_action.equals("") && !action_str.equals(""))
					action_str += "&" + disc_action;
				else action_str += disc_action;

				// Set condition string and create transition
				for (Tree condition : parsed_contents.conditions) {
					CommonTreeNodeStream cond_nodes = new CommonTreeNodeStream(
							condition);
					SxExpression condParser = new SxExpression(cond_nodes);
					SxExpression.cond_exp_return cond_return = condParser
							.cond_exp();
					String condition_str = cond_return.st.toString();

					List<SxLocation> src_loc_grp = location_groups.get(conn
							.getSource_id());
					List<SxLocation> tgt_loc_grp = location_groups.get(conn
							.getTarget_id());

					for (SxLocation src_loc : src_loc_grp) {
						for (SxLocation tgt_loc : tgt_loc_grp) {
							SxTransition transition = new SxTransition(ex,
									src_loc, tgt_loc);
							transition.setGuard(condition_str);
							transition.setAssignment(action_str);
							cbase.add(transition);
						}
					}
				}

			}
		}
	}
}
