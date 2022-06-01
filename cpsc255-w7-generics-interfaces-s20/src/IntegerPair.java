/**
 * Class that holds references to two Integers
 * 
 * @author Andrew Little
 * @version 02/25/2020
 */
public class IntegerPair
{

    /** Hold the first */
    private Integer one;

    /** Hold the second */
    private Integer two;
    /**
     * Constructor
     * 
     * @param first
     *            integer
     * @param second
     *            integer
     */
    public IntegerPair(Integer first, Integer second)
    {
        one = first;
        two = second;
    }
    
    /**
     * Get the first element
     * 
     * @return one 
     *              first
     */
    public Integer getFirst()
    {
        return one;
    }
    
    /**
     * Get the second element
     * 
     * @return two
     *              second
     */
    public Integer getSecond()
    {
        return two;
    }
    
    /**
     * String formatter
     * 
     * @return the formatted string
     */
    public String toString()
    {
        String toString = one + "\t" + two;
        return toString;
    }
}
