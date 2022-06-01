
/**
 * SubClass of DirectoryEntry for Faculty
 * 
 * @author Andrew Little
 * @version 03/27/2020
 *
 */
public class FacultyEntry
    extends DirectoryEntry
    implements java.lang.Comparable<DirectoryEntry>

{

    private String homeAddress; // home address of person
    private String office; // office number of the person
    private String department; // educational department of person
    private Object name; // name of person

    /**
     * Constructor
     * 
     * @param name
     *                      name of the person
     * @param homeAddress
     *                      home address of the person
     * @param office
     *                      office number of the person
     * @param department
     *                      department the person belongs to
     */
    public FacultyEntry(java.lang.String name,
            java.lang.String homeAddress,
            java.lang.String office,
            java.lang.String department)
    {
        super(name);
        this.homeAddress = homeAddress;
        this.office = office;
        this.department = department;
        hideAddress();
    }
    
    /**
     * String formatter for Faculty directory entry
     * 
     * @return formatted String
     */
    @Override
    public java.lang.String toString()
    {
        if (this.isLabelShown())
        {
            return String.format("Faculty:%8s/n/t/n/t/n/t", 
                    name,
                    this.homeAddress, 
                    this.office, 
                    this.department);
        }
        else
        {
            return String.format("%8s/n/t/n/t/n/t", 
                    name,
                    this.homeAddress, 
                    this.office, 
                    this.department);
        }
    }
}
