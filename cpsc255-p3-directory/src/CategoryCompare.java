
/**
 * Category Compare class
 * 
 * @author Andrew Little
 * @version 03/27/2020
 *
 */
public class CategoryCompare
    implements java.util.Comparator<DirectoryEntry>
{


    /**
     * Constructor
     */
    public CategoryCompare()
    {
        // not sure what's supposed to go here :(
    }
    
    /**
     * implements the compareTo method in DirectoryEntry
     * 
     * @param s1
     *              first instance of DirectoryEntry
     * @param s2
     *              second instance of DirectoryEntry
     *              
     * @return value of comparison
     */
    public int compare(DirectoryEntry s1, DirectoryEntry s2)
    {
        return (s1).compareTo(s2);
    }

}
