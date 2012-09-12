package ecml;

import java.util.HashMap;
import java.util.Map;

public class Phase extends CommonAttr {
    private String is_define_model;
    private String define_model_name;
    private BasicComponent state_model = new BasicComponent();
    private Map<Long, StateFormula> formulaMap  = new HashMap<>();
    
    
    public String getDefine_model_name() {
	return define_model_name;
    }
    public void setDefine_model_name(String define_model_name) {
	this.define_model_name = define_model_name;
    }
    public String getIs_define_model() {
	return is_define_model;
    }
    public void setIs_define_model(String is_define_model) {
	this.is_define_model = is_define_model;
    }
    
    public void addFormula(StateFormula formula){
	formulaMap.put(formula.getID(), formula);
    }
    public BasicComponent get_state_model(){
	return state_model;
    }
    
}
