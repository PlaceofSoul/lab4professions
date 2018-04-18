package Profession;

/*
 * @author Robson
 */

public class gasstationattendant extends Employee implements Comparable<gasstationattendant> {
    private final double OVERTIME_PAY_RATE = 1.5;

    private double numberOfDollarsStolenPerDay;

    /**
     * Constructor for GasStationAttendant
     * @param name
     * @param numberOfDollarsStolenPerDay
     */
    public gasstationattendant(String name, double numberOfDollarsStolenPerDay) {
        super(name);
        this.setNumberOfDollarsStolenPerDay(numberOfDollarsStolenPerDay);
    }

    /**
     * Kind of clothes that GasStationAttendant use
     * @return dressCode
     */
    @Override
    public dresscode getdresscode() {
        return dresscode.UNIFORM;
    }

    /**
     * For GasStationAttendants this will always return false
     * @return false
     */
    @Override
    public boolean isPaidSalary() {
        return false;
    }

    /**
     * For GasStationAttendants this will always return false
     * @return false
     */
    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    /**
     * For GasStationAttendants this will always return "Pump"
     * @return Pump
     */
    @Override
    public String getWorkVerb() {
        return "Pump";
    }

    /**
     * For GasStationAttendants this will always return 1.5
     * @return 1.5
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    /**
     * Number of dollars that are stolen per day
     * @return numberOfDollarsStolenPerDay
     */
    public double getNumberOfDollarsStolenPerDay() {
        return numberOfDollarsStolenPerDay;
    }

    /**
     * Set the number of dollars that are stolen per day
     * @param numberOfDollarsStolenPerDay
     */
    public void setNumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay) {
        this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;
    }

    /**
     * @param gasStationAttendant
     * @return <ul><li>1 - if this.numberOfDollarsStolenPerDay > gasStationAttendant.numberOfDollarsStolenPerDay</li>
     *             <li>0 - if this.numberOfDollarsStolenPerDay == gasStationAttendant.numberOfDollarsStolenPerDay</li>
     *             <li>-1 - if this.numberOfDollarsStolenPerDay < gasStationAttendant.numberOfDollarsStolenPerDay</li>
     *         </ul>
     */
    @Override
    public int compareTo(gasstationattendant gasStationAttendant) {
        if (this.getNumberOfDollarsStolenPerDay() > gasStationAttendant.getNumberOfDollarsStolenPerDay()){
            return 1;
        }else if(this.getNumberOfDollarsStolenPerDay() == gasStationAttendant.getNumberOfDollarsStolenPerDay()){
            return 0;
        }
        return -1;
    }

    /**
     * Generate a hashCode for GasStationAttendant
     * @return hashCode
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + this.getNumberOfDollarsStolenPerDay() +
                (this.getName() == null ? 0 : this.getName().hashCode()));
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
            if(!(o instanceof gasstationattendant)){
                return false;
            }

            gasstationattendant gasStationAttendant = (gasstationattendant) o;
            return this.getNumberOfDollarsStolenPerDay() == gasStationAttendant.getNumberOfDollarsStolenPerDay();
        }

        return false;
    }

    /**
     * All the information about GasStationAttendant
     * @return string
     */
    @Override
    public String toString() {
        return "Parent [name: "+getName()+", Dress Code: "+getdresscode().getValue()+", " +
                "Paid Salary: "+isPaidSalary()+",\n Post Secondary Education Required: "+postSecondaryEducationRequired()+
                ", Work Verb: "+getWorkVerb()+", Number of Dollars Stolen Per Day: "+getNumberOfDollarsStolenPerDay()+"]";
    }
}
