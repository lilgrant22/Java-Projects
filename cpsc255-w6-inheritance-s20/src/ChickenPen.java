/**
 * ChickenPen - takes list of farm animals and returns a list of roosters;
 * return null if null list given
 *
 * @author student
 * @version 0
 */
public class ChickenPen
{

    /**
     * ChickenPen - takes list of farm animals and returns a list of roosters;
     * return null if null list given, but a valid empty ArrayList if no
     * roosters
     *
     * @param list
     *            - list of references to farm animals
     * @return list containing only references to roosters
     */
    public static Rooster[] getRoosters(FarmAnimal[] list)
    {
        if (list == null)
        {
            return null;
        }
        int count = 0;
        for (FarmAnimal f : list)
        {
            if (f instanceof Rooster)
            {
                count++;
            }
        }

        Rooster[] r = new Rooster[count];
        count = 0;
        for (FarmAnimal f : list)
        {
            if (f instanceof Rooster)
            {
                r[count] = (Rooster)f;
                count++;
            }
        }
        return r;

    }

}
