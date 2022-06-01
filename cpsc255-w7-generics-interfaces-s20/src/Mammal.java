
/**
 * Mammal class
 * 
 * @author Andrew Little
 * @version 02/25/2020
 */

public class Mammal
{

    /** Name of animal */
    private String name;

    /** default constructor */
    public Mammal()
    {
        name = "Mammal";
    }


    /**
     * constructor with name
     * 
     * @param n
     *            - name of mammal
     */
    public Mammal(String n)
    {
        name = n;
    }


    /** @return name of animal */
    public String getName()
    {
        return name;
    }


    /**
     * set the name for mammal
     * 
     * @param n
     *            - name of mammal
     */
    public void setName(String n)
    {
        name = n;
    }

}
