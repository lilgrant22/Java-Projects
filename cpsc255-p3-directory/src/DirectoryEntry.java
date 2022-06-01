
/**
 * Parent class for Directory entries
 * 
 * @author Andrew Little
 * @version 03/27/2020
 *
 */
public abstract class DirectoryEntry 
    implements java.lang.Comparable<DirectoryEntry>
{
    private java.lang.String anAddress; //home address of person
    private boolean addressShown; // if address is shown or not
    private boolean labelShown; // if label is shown or not
    private String first; // first name of person
    private String last; // last name of person
    
    /**
     * Constructor
     * 
     * @param name
     *              name of person
     */
    public DirectoryEntry(java.lang.String name)
    {
        String[] names = name.split(" ");
        this.first = names[0];
        this.last = names[1];
        addressShown = true;
        labelShown = true;
    }
    
    /**
     * Multi-parameter Constructor
     * 
     * @param name
     *                      name of the person
     * @param anAddress
     *                      the address of the person
     * @param showAddress
     *                      whether the address is shown or not
     * @param labelShown
     *                      whether the label is shown or not
     */
    public DirectoryEntry(java.lang.String name, 
            java.lang.String anAddress,
            boolean showAddress, 
            boolean labelShown)
    {
        super();
        String[] names = name.split(" ");
        this.first = names[0];
        this.last = names[1];
        this.anAddress = anAddress;
        this.addressShown = showAddress; 
        this.labelShown = true;
    }
    
    /**
     * Assigns false to labelShown
     */
    public void hideLabel()
    {
        labelShown = false;
    }
    
    /**
     * Assigns true to labelShown
     */
    public void showLabel()
    {
        labelShown = true;
    }
    
    /**
     * Getter for the first name
     * 
     * @return the persons first name
     */
    public java.lang.String getFirst()
    {
        return this.first;
    }
    
    /**
     * Getter for the last name
     * 
     * @return the persons last name
     */
    public java.lang.String getLast()
    {
        return this.last;
    }
    
    /**
     * Assigns false to addressShown
     */
    public void hideAddress()
    {
        addressShown = false;
    }
    
    /**
     * Assigns true to addressShown
     */
    public void showAddress()
    {
        addressShown = true;
    }
    
    /**
     * Returns labelShown, true or false
     * 
     * @return value of labelShown
     */
    public boolean isLabelShown()
    {
        return labelShown;
    }
    
    /**
     * Returns addressShown, true or false
     * 
     * @return value of addressShown
     */
    public boolean isAddressShown()
    {
        return addressShown;
    }
    
    /**
     * Returns true if the names are equal, false if they are not
     */
    @Override
    public boolean equals(java.lang.Object other)
    {
        if (other instanceof DirectoryEntry 
                && other.getClass() == this.getClass()) 
        {
            DirectoryEntry otherDirectoryEntry = (DirectoryEntry)other;
            
            String otherLast = otherDirectoryEntry.getLast();
            String otherFirst = otherDirectoryEntry.getFirst();
            
            if (first.equals(otherFirst) && last.equals(otherLast))
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Returns zero if the names are equal, 1 if they are not
     * 
     * @param other
     *                      other name
     * @return integer value
     */
    public int compareTo(DirectoryEntry other)
    {
        if (this.first.equals(other.first) && this.last.equals(other.last))
        {
            return 0;
        }
        
        else if (!this.first.equals(other.first) 
                && this.last.equals(other.last))
        {
            return 1;
        }
        
        else
        {
            return this.first.compareTo(other.first);
        }

    }
    
    /**
     * Formatter for the Directory String
     * 
     * @return formatted string
     */
    public java.lang.String toString()
    {
        if (addressShown)
        {
            return String.format("Name:%8s%s\n\t", 
                    this.first, this.last, this.anAddress);
        }
        else
        {
            return String.format("Name:%8s%s", 
                    this.first, this.last);
        }
    }
    
    /**
     * splits the name into first and last names
     * 
     * @param names
     *              String name
     */
    public void parseName(java.lang.String names)
    {
        // not used, this work was done in the constructor
    }
    
    /**
     * Main method
     * 
     * @param args
     *              argument
     */
    public static void main(java.lang.String[] args)
    {
        //nothing here yet
    }
}
