/**
 * Cow class
 * 
 * @author <student>
 * @version <date>
 */
public class Cow
    extends Ruminant
{
    /** default constructor */
    public Cow()
    {

    }


    @Override
    public void makeSound()
    {
        super.makeSound();
        System.out.println("Moo");
    }


    public static void main(String[] args)
    {
        FarmAnimal animal = new Cow();
        Ruminant rum = new Ruminant();

        animal.makeSound();
        rum.makeSound();
    }

    // add makeSound for Cows

}
