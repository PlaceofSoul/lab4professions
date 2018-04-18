package Profession;
/*
 * @author Robson
 */

public class employable {
	public interface Employable {
	    /**
	     * @return dresscode
	     */
	    dresscode getdresscode();

	    /**
	     * @return isPaidSalary
	     */
	    boolean isPaidSalary();

	    /**
	     * @return postSecondaryEducationRequired
	     */
	    boolean postSecondaryEducationRequired();

	    /**
	     * @return workVerb
	     */
	    String getWorkVerb();
	}


}
