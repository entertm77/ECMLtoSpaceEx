package ecml;

public class Variable extends CommonAttr{
    public enum TypeClass {
	Double, Integer, Boolean, String
    }
    public enum RateClass{
	DISCRETE, EVENT, ANALOG, CONSTANT
    }
    public enum PortClass{
	IN, OUT, STATE
    }
    
    private RateClass rate;
    private TypeClass valueType;
    private boolean properties;
    private PortClass port;
    private Object initialValue;
       
    /**
     * @return the properties
     */
    public boolean isProperties() {
        return properties;
    }
    /**
     * @param properties the properties to set
     */
    public void setProperties(boolean properties) {
        this.properties = properties;
    }
    public RateClass getRate() {
	return rate;
    }
    public void setRate(RateClass rate) {
	this.rate = rate;
    }
    public void setInitialValue(Object value){
	initialValue = value;
    }

    public PortClass getPort() {
	return port;
    }
    public void setPort(PortClass port) {
	this.port = port;
    }
    
    public Object getInitialValue(){
	return initialValue;
    }
    public TypeClass getValueType() {
	return valueType;
    }
    public void setValueType(TypeClass valueType) {
	this.valueType = valueType;
    }
}
