package ecml;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Jaeyeon
 *
 */
public class CPSBehavioralModel{

    static public class BMOuterModel extends CommonAttr{
	static public class Port extends CommonAttr{
	    private String hils;    
	    
	    public String getHils() {
		return hils;
	    }
	    public void setHils(String hils) {
		this.hils = hils;
	    }
	}
	private Map<Long, Port> ports = new HashMap<Long, Port>();
	
	public void addPort(Port port){
	    ports.put(port.getID(), port);
	}
	
	private BMOuterModel(){}		
    }
    
    static public class BMInnerModel extends CommonAttr{
	private BMInnerModel(){}
    }
    
    private final BMOuterModel outermodel = new BMOuterModel(); 
    private final BMInnerModel innermodel = new BMInnerModel();
    private String name = "";
    private String parent_name="";
    
    private HashMap<Long, Variable> variableMap = new HashMap<Long, Variable>();
    
    /**
     * CBM Name
     * @return CBM name
     */
    public String getName() {
        return name;
    }
    /**
     * CBM Name
     * @param CBM Name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * domain name or csm name
     * @return domain name or csm name
     */
    public String getParent_name() {
        return parent_name;
    }
    /**
     * 
     * @param domain name or csm name
     */
    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }
    /**
     * 
     * @param variable
     */
    public void addVariable(Variable variable){
	variableMap.put(variable.getID(), variable);
    }
    
    public void removeVariable(Variable variable){
	variableMap.remove(variable);
	
    }
    public BMOuterModel getOutermodel() {
	return outermodel;
    }
    
    public BMInnerModel getInnermodel() {
	return innermodel;
    }
    
}
