package ecml;

/**
 * Attribute structure for common element 
 * @author Jaeyeon
 *
 */
public abstract class CommonAttr {
    @Override
	public String toString() {
		return "CommonAttr [getID()=" + getID() + ", getName()=" + getName()
				+ ", getType()=" + getType() + ", getWidth()=" + getWidth()
				+ ", getHeight()=" + getHeight() + ", getX()=" + getX()
				+ ", getY()=" + getY() + "]";
	}

	/**
     * type of Root node CBM 3
     */
    final public static int CPS_BEHAVIORAL_MODEL=3;
    
    /**
     * type of input variable 38
     */
    final public static int INPUT_VARIABLE=38;
    
    /**
     * type of output variable 39
     */    
    final public static int OUTPUT_VARIABLE=39;
    
    /**
     * type of behavioral model with port 10
     */
    final public static int BEHAVIORAL_MODEL_WITH_PORT=10;
    
    /**
     * type of behavioral model 10
     */
    final public static int BEHAVIORAL_MODEL=10;
    
    /**
     * type of inner behavioral model 11
     */
    final public static int BEHAVIORAL_INNER_MODEL=11;
    /**
     * 2
     */
    final public static int CONNECTION_OUT = 2;
    /**
     * 27
     */
    final public static int CONNECTION_IN = 27;
    /**
     * type of port 
     * 
     */
    final public static int INNER_PORT = 41; 
    /**
     * type of port 
     * 
     */
    final public static int OUTER_PORT = 40;
    /**
     * D/C Variable set 
     * 
     */
    final public static int STATE_VAR_SET = 12;
    
    /**
     * D Variable set
     */
    final public static int STATE_DISCRETE_VAR_SET = 13;
    /**
     * C Variable set 
     * 
     */
    final public static int STATE_CONTINUOUS_VAR_SET = 14;
    /**
     * State Discrete Variable 
     */
    final public static int STATE_DISCRETE_VAR = 15;
    /**
     * State Continuous Variable set 
     * 
     */
    final public static int STATE_CONTINUOUS_VAR = 16;
    
    /**
     * Phase
     */
    final public static int PHASE = 17;
    /**
     * StateModel : determine rates
     */
    final public static int STATE_MODEL = 18;
    /**
     * StateModel : determine rates
     */
    final public static int RATE = 19;
    /**
     * Initial State  
     */
    final public static int INITIAL_STATE = 3;
    /**
     * 
     */
    final public static int IN_CONNECTION = 27;
    /**
     * 
    */    
    final public static int OUT_CONNECTION = 2;
    
    
    private Long id;
    private String name;
    /**
     * @return the id
     */
    public Long getID() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    private int type;
    private int width;
    private int height;
    private int x;
    private int y;
    
    
    
}
