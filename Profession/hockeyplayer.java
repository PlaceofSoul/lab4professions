package Profession;
/*
 * @author Robson
 */

public class hockeyplayer extends Employee implements Comparable<hockeyplayer> {
    private final double OVERTIME_PAY_RATE = 0.0;

    private int numberOfGoals;

    /**
     * Constructor for hockeyplayer
     * @param name
     * @param numberOfGoals
     */
    public hockeyplayer(String name, int numberOfGoals) {
        super(name);
        this.setNumberOfGoals(numberOfGoals);
    }

    /**
     *uniform hockeyplayers use
     * @return dressCode
     */
    @Override
    public DressCode getDressCode() {
        return DressCode.JERSEY;
    }

    /**
     * For HockeyPlayer this will always return true
     * @return true
     */
    @Override
    public boolean isPaidSalary() {
        return true;
    }

    /**
     * For HockeyPlayer this will always return false
     * @return false
     */
    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    /**
     * For HockeyPlayer this will always return "Play"
     * @return Play
     */
    @Override
    public String getWorkVerb() {
        return "Play";
    }

    /**
     * For HockeyPlayer this will always return 0.0
     * @return 0.0
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    /**
     * Number of goals made
     * @return numberOfGoals
     */
    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    /**
     * Set the number of goals made
     * @param numberOfGoals
     */
    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    /**
     *
     * @param player
     * @return <ul><li>1 - if this.numberOfGoals > player.numberOfGoals</li>
     *             <li>0 - if this.numberOfGoals == player.numberOfGoals</li>
     *             <li>-1 - if this.numberOfGoals < player.numberOfGoals</li>
     *         </ul>
     */
    @Override
    public int compareTo(HockeyPlayer player) {
        if (this.getNumberOfGoals() > player.getNumberOfGoals()){
            return 1;
        }else if(this.getNumberOfGoals() == player.getNumberOfGoals()){
            return 0;
        }
        return -1;
    }

    /**
     * Generate a hashCode for HockeyPlayer
     * @return hashCode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.getNumberOfGoals() + (this.getName() == null ? 0 : this.getName().hashCode());
        return result;
    }

    /**
     * Verify if the object passed is equals than this
     * @param o
     * @return true, if they are equals, and false if not
     */
    @Override
    public boolean equals(Object o) {
        if(o != null) {
            if(o == this){
                return true;
            }
            if(!(o instanceof HockeyPlayer)){
                return false;
            }

            HockeyPlayer player = (HockeyPlayer) o;
            return this.getNumberOfGoals() == player.getNumberOfGoals();
        }

        return false;
    }

    /**
     * All the information about HockeyPlayer
     * @return string
     */
    @Override
    public String toString() {
        return "HockeyPlayer [name: "+getName()+", Dress Code: "+getDressCode().getValue()+", " +
                "Paid Salary: "+isPaidSalary()+",\n Post Secondary Education Required: "+postSecondaryEducationRequired()+
                ", Work Verb: "+getWorkVerb()+", NumberOfGoals: "+getNumberOfGoals()+"]";
    }
}
