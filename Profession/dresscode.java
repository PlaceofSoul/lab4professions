package Profession;
/*
 * @author Robson
 */
public class dresscode {
	public enum dressCode {
	    JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");

	    private String value;

	    /**
	     * Constructor for dresscode
	     * @param value
	     */
	    dressCode(String value){
	        this.value = value;
	    }

	    /**
	     * Value of the enum
	     * @return value
	     */
	    public String getValue() {
	        return value;
	    }

	    /**
	     * Set the new value for enum
	     * @param value
	     */
	    public void setValue(String value) {
	        this.value = value;
	    }

	    /**
	     * dresscode Info
	     * @return string
	     */
	    
	    @Override
	    public String toString() {
	        return "DressCode [jersey, fancy, anything, uniform]";
	    }
	}


}
