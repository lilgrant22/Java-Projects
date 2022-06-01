import java.util.ArrayList;

/**
 * Drawer holds a bunch of stuff
 * 
 * @author Andrew Little
 * @version 02/25/2020
 * @param <T>
 */
public class Drawer<T>
{

    /** Field variable to hold instances of stuff in drawer */
    private ArrayList<T> stuff;

    /** Construct empty drawer */
    public Drawer()
    {
        stuff = new ArrayList<T>();
    }


    /**
     * Remove the first item from drawer and return
     * 
     * @return reference to the former first item
     */
    public T getItem()
    {
        if (hasStuff())
        {
            return null;
        }
        return stuff.remove(0);
    }


    /**
     * Add an item to the drawer
     * 
     * @param anItem
     *            - instance to be added to drawer
     */
    public void putItem(T anItem)
    {
        stuff.add(anItem);
    }


    /**
     * anything in our drawer?
     * 
     * @return true if something is there; false if empty
     */
    public boolean hasStuff()
    {
        if (stuff == null || stuff.size() == 0)
        {
            return false;
        }
        else
        {
        return true;
        }
    }
}
