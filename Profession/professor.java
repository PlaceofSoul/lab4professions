package Profession;
/*
 * @author Robson
 */
public class professor extends employee implements Comparable<professor> {
    private final double OVERTIME_PAY_RATE = 2.0;
    private final String TEACHING = "Computer Systems";

    private String teachingMajor;

    /**
     * Constructor for Professor
     * @param name
     * @param teachingMajor
     */
    public Professor(String name, String teachingMajor) {
        super(name);
        this.setTeachingMajor(teachingMajor);
    }

    /**
     * Professors uniform
     * @return dressCode
     */
    @Override
    public dresscode getdresscode() {
        return dresscode.FANCY;
    }

    /**
     * For Professors this will always return true
     * @return true
     */
    @Override
    public boolean isPaidSalary() {
        return true;
    }

    /**
     * For Professors this will always return true
     * @return true
     */
    @Override
    public boolean postSecondaryEducationRequired() {
        return true;
    }

    /**
     * For Professors this will always return "Teach"
     * @return Teach
     */
    @Override
    public String getWorkVerb() {
        return "Teach";
    }

    /**
     * For Professors this will always return 2.0
     * @return 2.0
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    /**
     * Name of the teaching major
     * @return teachingMajor
     */
    public String getTeachingMajor() {
        return teachingMajor;
    }

    /**
     * Set the name of the teaching major
     * @param teachingMajor
     */
    public void setTeachingMajor(String teachingMajor) {
        this.teachingMajor = teachingMajor;
    }

    /**
     * If one has 'teachingMajor' as 'Computer Systems' and the other not, than the professor who teaches
     * 'Computer Systems' is grater than the other, otherwise they are equals.
     *
     * @param professor
     * @return <ul><li>1 - if this.teachingMajor is 'Computer Systems'</li>
     *             <li>0 - if both is 'Computer Systems' or none of them</li>
     *             <li>-1 - if professor.teachingMajor is 'Computer Systems'</li>
     *         </ul>
     */
    @Override
    public int compareTo(Professor professor) {
        if(this.getTeachingMajor().equals(TEACHING) && !professor.getTeachingMajor().equals(TEACHING)){
            return 1;
        }else if(!this.getTeachingMajor().equals(TEACHING) && professor.getTeachingMajor().equals(TEACHING)){
            return -1;
        }
        return 0;
    }

    /**
     * Generate a hashCode for Professor
     * @return hashCode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.getTeachingMajor() == null ? 0 : this.getTeachingMajor().hashCode())
                + (this.getName() == null ? 0 : this.getName().hashCode());
        return result;
    }

    /**
     * Verify if the object passed is equals to this
     * @param o
     * @return true, if they are equals, and false if not
     */
    @Override
    public boolean equals(Object o) {
        if(o != null) {
            if(o == this){
                return true;
            }
            if(!(o instanceof Professor)){
                return false;
            }

            Professor professor = (Professor) o;
            return this.getTeachingMajor().equals(professor.getTeachingMajor());
        }

        return false;
    }

    /**
     * All the information about Professor
     * @return string
     */
    @Override
    public String toString() {
        return "Professor [name: "+getName()+", Dress Code: "+getdresscode().getValue()+", " +
                "Paid Salary: "+isPaidSalary()+",\n Post Secondary Education Required: "+postSecondaryEducationRequired()+
                ", Work Verb: "+getWorkVerb()+", Teaching Major: "+getTeachingMajor()+"]";
    }
}
