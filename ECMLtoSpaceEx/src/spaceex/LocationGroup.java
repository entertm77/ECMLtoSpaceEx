package spaceex;

import java.util.ArrayList;
import java.util.List;

import sspaceex.SxLocation;
import sspaceex.SxTransition;

import ecml.Phase;

/**
 * 
 * @author Jaeyeon
 * This class is location group structure that is related to phase
 */
public class LocationGroup {

	private Phase phase;
	private List<SxLocation> negative_locations = new ArrayList<SxLocation>();
	private List<SxLocation> asap_locations = new ArrayList<SxLocation>();
	private List<SxLocation> main_locations = new ArrayList<SxLocation>();
	private List<SxTransition> internal_transitions = new ArrayList<SxTransition>();
	private Map<SxLocation, Tree> ingoing_trans_prefix = new ListMap<SxLocation, Tree>();
	
	public LocationGroup(Phase phase){
		this.phase = phase;
	}
	public Phase get_phase() {
		return phase;
	}
	
	public SxLocation[] get_negative_locations(){		
		return negative_locations.toArray(new SxLocation[negative_locations.size()]);		
	}
	
	public void add_negative_location(SxLocation negative_location){
		this.negative_locations.add(negative_location);
	}
	
	public SxLocation[] get_main_locations(){		
		return main_locations.toArray(new SxLocation[main_locations.size()]);		
	}
	
	public void add_main_location(SxLocation main_location){
		this.main_locations.add(main_location);
	}
	

}
