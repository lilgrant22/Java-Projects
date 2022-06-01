
/**
 * SubClass of DirectoryEntry for Students
 * 
 * @author Andrew Little
 * @version 03/27/2020
 *
 */
public class StudentEntry
    extends DirectoryEntry
    implements java.lang.Comparable<DirectoryEntry>
    
{

    private String homeAddress; // home address of the student
    private String dorm; // dorm name of the student
    private String major; // major of the student

    /**
     * Constructor
     * 
     * @param name
     *              the name of the student
     */
    public StudentEntry(java.lang.String name)
    {
        super(name);
    }
    
    /**
     * Mutli-parameter Constructor
     * 
     * @param name
     *                      the name of the student
     * @param homeAddress
     *                      the home address of the student
     * @param dorm
     *                      the dorm the student lives in
     * @param major
     *                      the student's major
     */
    public StudentEntry(java.lang.String name, 
            java.lang.String homeAddress, 
            java.lang.String dorm, 
            java.lang.String major)
    {
        super(name);
        this.homeAddress = homeAddress;
        this.dorm = dorm;
        this.major = major;
    }
    
    /**
     * String formatter for Student directory entry
     * 
     * @return the formatted String
     */
    @Override
    public java.lang.String toString()
    {
        return String.format("/n/t/n/t/n/t", 
                this.homeAddress, 
                this.dorm, 
                this.major);
    }
}
