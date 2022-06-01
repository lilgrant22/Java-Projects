
/**
 * SubClass of DirectoryEntry for Staff Members
 * 
 * @author Andrew Little
 * @version 03/27/2020
 *
 */
public class StaffEntry
    extends DirectoryEntry
    implements java.lang.Comparable<DirectoryEntry>
{

    private String homeAddress; // home address of the staff member
    private String title; // position the staff member holds
    private Object name; // name of the staff member

    /**
     * Constructor
     * 
     * @param name
     *                      name of the staff member
     * @param homeAddress
     *                      home address of the staff member
     * @param title
     *                      position the staff member holds
     */
    public StaffEntry(java.lang.String name,
            java.lang.String homeAddress,
            java.lang.String title)
    {
        super(name);
        this.homeAddress = homeAddress;
        this.title = title;
    }
    
    /**
     * String formatter for Staff directory entry
     * 
     * @return the formatted String
     */
    public java.lang.String toString()
    {
        return String.format("Name:%8s/n/t/n/t", 
                name,
                this.homeAddress, 
                this.title);
    }
}
