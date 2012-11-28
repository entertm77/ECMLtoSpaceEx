package ecml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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
				+ ", get_var_set()=" + get_var_set_node() + ", get_disc_var_set()="
				+ get_disc_var_set_node() + ", get_cont_var_set()="
				+ get_cont_var_set_node() + ", get_initial()=" + get_initial()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	private String name = null;
	private String parent_name = null;

	private BasicComponent behavior_model = new BasicComponent();
	private BasicComponent inner_behavior_model = new BasicComponent();

		
	private Map<Long, Variable> var_map = new HashMap<>();

	private BasicComponent disc_var_set_node = new BasicComponent();
	private BasicComponent var_set_node = new BasicComponent();
	private BasicComponent cont_var_set_node = new BasicComponent();
	
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

	public BasicComponent get_var_set_node() {
		return var_set_node;
	}

	public BasicComponent get_disc_var_set_node() {
		return disc_var_set_node;
	}

	public void add_var(Variable var) {
		var_map.put(var.getID(), var);
	}
	public  Collection<Variable> get_variables(){
	    return var_map.values();
	}
	public Variable find_variable(String name){
		for(Variable var : var_map.values()){
			if(var.getName().equals(name)){
				return var;
			}
		}
		return null;
	}

	public BasicComponent get_cont_var_set_node() {
		return cont_var_set_node;
	}
	
	public void add_phase(Phase phase) {
		phase_map.put(phase.getID(), phase);
	}
	public Collection<Phase> getPhases(){
	    return phase_map.values();
	}
	public Phase getPhase(Object key){
	    return phase_map.get(key);
	}

	public Initial get_initial() {
		return initial;
	}
	
	public List<Connection> get_out_connections(Long phaseID){
		List<Connection> out_conns = new ArrayList<Connection>();
		for(Connection conn:this.get_connections()){
			if(conn.getSource_id()==phaseID)
				out_conns.add(conn);
		}
		return out_conns;
	}
	public List<Connection> get_in_connections(Long phaseID){
		List<Connection> in_conns = new ArrayList<Connection>();
		
		for(Connection conn:this.get_connections()){
			if(conn.getTarget_id()==phaseID)
				in_conns.add(conn);
		}
		return in_conns;
	}
	
	
	public void add_connection(Connection conn){
		connection_map.put(conn.getID(), conn);
	}
	public Collection<Connection> get_connections(){
	    return connection_map.values();
	}

}
