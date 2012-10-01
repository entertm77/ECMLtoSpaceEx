package spaceex;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.jdom.Element;

import sspaceex.SXSspaceex;
import sspaceex.SxComponent;
import sspaceex.SxComponentBase;
import sspaceex.SxLocation;
import sspaceex.SxParam;
import sspaceex.SxTransition;
import ecml.CPSBehavioralModel;
import ecml.CommonAttr;
import ecml.Connection;
import ecml.Phase;
import ecml.StateFormula;
import ecml.Variable;
import ecml.Variable.RateClass;

public class Translator {
	Logger log = Logger.getLogger(Translator.class);

	public Translator() {

	}

	/**
	 * translation for ecml into spaceEx
	 * 
	 * 
	 * @param cbm
	 * @return
	 */
	public SXSspaceex translation(CPSBehavioralModel cbm) {
		SXSspaceex ex = new SXSspaceex();
		
		SxComponentBase componentBase = ex.newComponentBase();
		
		
		ex.add(componentBase);
		componentBase.setId(cbm.getName());
		
		HashMap<Long, Integer> phase2loc = new HashMap<Long, Integer>();

		for (Variable var : cbm.get_variables()) {
			log.debug("New Parameter : " + var.getName());
			SxParam param = new SxParam(ex,
					SxParam.ATTRIBUTE_TYPE_DEFAULT_VALUE, var.getName());
			componentBase.add(param);

			param.setD1(1);
			param.setD2(1);
			param.setControlled(false);
			param.setName(var.getName());
			switch (var.getPort()) {
			case IN:
			case OUT:
				param.setLocal(false);
				break;
			case STATE:
				param.setLocal(true);
				break;
			}

			if (var.getValueType().equals(RateClass.CONSTANT)) {
				param.setDynamics("const");
			} else {
				param.setDynamics("any");
			}
		}
		
		

		for (Phase phase : cbm.getPhases()) {
			log.debug("New Parameter : " + phase.getName() + ", ID : "
					+ phase.getID());

			int id = componentBase.genNewLocationId();
			SxLocation location = new SxLocation(ex, id, componentBase);

			phase2loc.put(phase.getID(), id);

			location.setName(phase.getName());
			componentBase.add(location);

			String flow = "";
			for (StateFormula formula : phase.get_formulas()) {
				String form = formula.getName();
				if (form.contains("d(") && form.contains(")")) {
					String translated1 = form.replaceFirst("d\\(", "");
					translated1 = translated1.replaceFirst("\\)", "'");
					translated1 = translated1.replaceFirst("=", "==");
					flow += translated1;

				}
			}
			location.setFlow(flow);
		}
		
		SxLocation first_location = null;
		for(SxLocation location : componentBase.getLocations()){
			first_location = location;
			break;
		}
		componentBase.remove(first_location);

		for (Connection conn : cbm.get_connections()) {
			Long source = conn.getSource_id();
			Long target = conn.getTarget_id();
			log.debug("source : " + source + ", target : " + target);

			if (conn.getType() == CommonAttr.CONNECTION_OUT) {
				SxLocation source_location = componentBase
						.getSXLocation(phase2loc.get(source));
				SxLocation target_location = componentBase
						.getSXLocation(phase2loc.get(target));
				SxTransition transition = new SxTransition(ex, source_location,
						target_location);
				String middle_content = conn.getMiddle_content();
				String lable = middle_content.split("\\[")[0];
				middle_content = middle_content.split("\\[")[1];
				String[] temp = middle_content.split("\\]");
				String guard = middle_content.split("\\]")[0];
				temp = middle_content.split("\\/\\/");
				String assignment = null;
				if (temp.length > 1) {
					assignment = temp[1];
					transition.setAssignment(assignment);
				}

				transition.setGuard(guard);

				componentBase.add(transition);
			}

		}
		return ex;
	}

}
