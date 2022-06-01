import java.util.ArrayList;

/**
 * Class that holds refers to two objects of same type.
 * 
 * @author Andrew Little
 * @version 02/25/2020
 * 
 * @param <T>
 *              holder T
 */
public class GenericPair<T>
{
    /** hold first element */
    T one;

    /** hold the second element */
    T two;

    /** Constuctor for the pair 
     * 
     * @param first
     *              first holder
     * @param second
     *              second holder
     */
    public GenericPair(T first, T second)
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
     * @return two
     *                  second
     */
    public T getSecond()
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

    /**
     * main method for executing and testing
     * 
     * @param args
     *              argument
     */
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<String>();
        a.add("hello");
        a.add("hi");
        a.add("cheers");
        for (String s : a)
        {
            System.out.println("next string is " + s);
        }

        GenericPair<Integer> x = new GenericPair<Integer>(54, 76);
        System.out.println("My integer pair is " + x);
    }

}
