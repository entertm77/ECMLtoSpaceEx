package ecml;

public class BasicComponent extends CommonAttr {
    @Override
	public String toString() {
		return "BasicComponent [getHils()=" + getHils() + ", toString()="
				+ super.toString()  + "]";
	}

	private String hils;

    public BasicComponent() {
    }

    public String getHils() {
	return hils;
    }

    public void setHils(String hils) {
	this.hils = hils;
    }


}
