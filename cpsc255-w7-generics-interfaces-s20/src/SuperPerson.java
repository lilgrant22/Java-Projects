
/**
 * Super person
 * 
 * @author <student>
 * @version 0
 */
// @todo - this should sub-class from Person and SuperHero
// and do the proper stuff defined in JUNit

public class SuperPerson
    extends Person
    implements SuperHero
{
    private boolean canFly;

    /**
     * constructor
     */
    public SuperPerson()
    {
        super();
        canFly = true;
    }

    /**
     * naming and flying 
     * 
     * @param name
     *                  the name
     * @param doesFly
     *                  ability to fly
     */
    public SuperPerson(String name, boolean doesFly)
    {
        super(name);
        canFly = doesFly;
    }

    /**
     * ability to fly or not 
     * 
     * @return canFly
     *                  ability to fly
     */
    public boolean flies()
    {
        return canFly;
    }
}
