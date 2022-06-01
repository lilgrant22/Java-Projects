/**
 * Super dog class
 * 
 * @author <student>
 * @version 0
 */
// @todo - this should sub-class from Dog and SuperHero and do the proper stuff
public class SuperDog
    extends Dog
    implements SuperHero
{
    private boolean canFly; //auto to being able to fly

    /**
     * constructor for naming and flying ability
     * 
     * @param name
     *                  name of dog
     * @param doesFly
     *                  ability to fly
     */
    public SuperDog(String name, boolean doesFly)
    {
        super(name);
        canFly = doesFly;
    }

    /**
     * method for flying ability
     * 
     * @return canFly
     *                  ability to fly
     */
    public boolean flies()
    {
        return canFly;
    }
}
