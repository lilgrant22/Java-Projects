/**
 * Class to hold two different types
 * 
 * @author Andrew Little
 * @version 02/25/2020
 * 
 * @param <T>
 *              holder T
 * @param <U>
 *              holder U
 */

public class Generic2Pair<T, U>
{
    /** hold first element */
    T one;

    /** hold the second element */
    U two;

    /** Constuctor for the pair 
     * 
     * @param first
     *              first
     * @param second
     *              second
     */
    public Generic2Pair(T first, U second)
    {
        one = first;
        two = second;
    }


    /**
     * Get the first element
     * 
     * @return one
     *                  first
     */
    public T getFirst()
    {
        return one;
    }


    /**
     * Get the second element
     * 
     * @return second
     *                  second
     */
    public U getSecond()
    {
        return two;
    }


    /**
     * This depends upon type having a valid toString
     * 
     * @return the formatted string
     */
    public String toString()
    {
        String toString = one.toString() + "\t" + two.toString();
        return toString;
    }

}
