/**
 * 
 * @author Andrew Little
 * @version 02/24/2020
 *
 */
public class Course {
    
    private String courseName; // name of Course
    private TimeOfDay start; // start time
    private TimeOfDay end; // end time
    private String meetDays; // days the course meets
    
    /**
     * Constructor
     * 
     * @param courseName
     *                      name of course
     * @param start
     *                      start of course
     * @param end
     *                      end of course
     * @param meetDays
     *                      meeting days of course
     */
    public Course(java.lang.String courseName, TimeOfDay start, 
            TimeOfDay end, java.lang.String meetDays)
    {
        this.courseName = courseName;
        this.start = start;
        this.end = end;
        this.meetDays = meetDays;
    }
    
    /**
     * Sets the name of the course
     * 
     * @return
     *          name of course
     */
    public java.lang.String getName()
    {
        return this.courseName;
    }
    
    /**
     * Sets the start time for the course
     * 
     * @return
     *          course start time
     */
    public TimeOfDay getStartTime()
    {
        return this.start;
    }
    
    /**
     * Sets the end time for the course
     * 
     * @return
     *          course end time
     */
    public TimeOfDay getEndTime()
    {
        return this.end;
    }
    
    /**
     * Sets the meeting days for the course
     * 
     * @return
     *          string of course meeting days
     */
    public java.lang.String getMeetDays()
    {
        return this.meetDays;
    }
    
    /**
     * String formatter
     * Sets courseName, meetDays, start, and end into proper string
     */
    @Override
    public java.lang.String toString()
    {
        return String.format("%8s %5s %s-%s", this.courseName, this.meetDays, 
                this.start.toString(), this.end.toString());
    }

}
