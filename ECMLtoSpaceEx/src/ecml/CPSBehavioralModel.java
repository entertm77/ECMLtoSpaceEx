package ecml;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Jaeyeon
 * 
 */
public class CPSBehavioralModel {
	@Override
	public String toString() {
		return "CPSBehavioralModel [getName()=" + getName()
				+ ", getParent_name()=" + getParent_name()
				+ ", get_behavior_model()=" + get_behavior_model()
				+ ", getInner_behavior_model()=" + getInner_behavior_model()
				+ ", get_var_set()=" + get_var_set() + ", get_disc_var_set()="
				+ get_disc_var_set() + ", get_cont_var_set()="
				+ get_cont_var_set() + ", get_initial()=" + get_initial()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	private String name = null;
	private String parent_name = null;

	private Map<Long, Variable> in_port = new HashMap<>();
	private Map<Long, Variable> out_port = new HashMap<>();

	private BasicComponent behavior_model = new BasicComponent();
	private BasicComponent inner_behavior_model = new BasicComponent();

	private BasicComponent var_set = new BasicComponent();

	private BasicComponent disc_var_set = new BasicComponent();
	private Map<Long, Variable> disc_var_map = new HashMap<>();

	private BasicComponent cont_var_set = new BasicComponent();
	private Map<Long, Variable> cont_var_map = new HashMap<>();

	private Map<Long, Phase> phase_map = new HashMap<>();

	private Initial initial = new Initial();

	private Map<Long, BasicComponent> port_map = new HashMap<>();

	private Map<Long, Connection> connection_map = new HashMap<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParent_name() {
		return parent_name;
	}

	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}

	public void add_in_var(Variable var) {
		in_port.put(var.getID(), var);
	}

	public void add_out_var(Variable var) {
		out_port.put(var.getID(), var);
	}

	public BasicComponent get_behavior_model() {
		return behavior_model;
	}

	public void add_port(BasicComponent port) {
		port_map.put(port.getID(), port);
	}

	/**
	 * @return the inner_behavior_model
	 */
	public BasicComponent getInner_behavior_model() {
		return inner_behavior_model;
	}

	public BasicComponent get_var_set() {
		return var_set;
	}

	public BasicComponent get_disc_var_set() {
		return disc_var_set;
	}

	public void add_disc_var(Variable var) {
		disc_var_map.put(var.getID(), var);

	}

	public BasicComponent get_cont_var_set() {
		return cont_var_set;
	}

	public void add_cont_var(Variable var) {
		cont_var_map.put(var.getID(), var);
	}

	public void add_phase(Phase phase) {
		phase_map.put(phase.getID(), phase);
	}

	public Initial get_initial() {
		return initial;
	}
	
	public void addConnection(Connection conn){
		connection_map.put(conn.getID(), conn);
	}

}
