
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for Movie class
 * 
 * @author PCSE CS250 instructors of yesteryear
 * @version 1
 *
 */
public class MovieTest {
    /** test constructor */
    @Test
    public void testNewMovie() {
        Movie movie = new Movie("Star Wars", 1977,
                "But I was going into Tosche Station "
                        + "to pick up some power converters!");
        String name = movie.getName();
        int year = movie.getYear();

        assertEquals("Incorrect result", "Star Wars", name);
        assertEquals("Incorrect result", 1977, year);
    }

    /** test Movie instances are equal */
    @Test
    public void testMovieEquals() {
        Object obj1;
        Object obj2; // Check it - Object is supertype of everything
        // same movie
        obj1 = new Movie(new String("Wizard of Oz"), 1939,
                new String("We're not in Kansas anymore."));
        obj2 = new Movie(new String("Wizard of Oz"), 1939,
                new String("We're not in Kansas anymore."));
        assertEquals("Incorrect result", obj1, obj2);
        assertEquals("Incorrect result", obj2, obj1); // test reflexive

        assertTrue("Incorrect result", obj1.equals(obj1)); // test same
        assertTrue("Incorrect result", obj1.equals(obj2)); // test usage
        assertTrue("Incorrect result", obj2.equals(obj1)); // test reflexive

        Object testObj = null;
        assertFalse("Incorrect result", obj1.equals(testObj)); // test null is
                                                               // false
    }

    /** test movie is not equal */
    @Test
    public void testMovieNotEquals() {
        Movie obj1;
        Movie obj2;

        // movie of different name
        obj1 = new Movie("Casino Royale", 2006,
                new String("The name's Bond... James Bond."));
        obj2 = new Movie("The Devil Wears Prada", 2006,
                new String("Don't make me feed you to one of the models."));
        assertFalse("Incorrect result", obj1.equals(obj2));

        // movie of different year
        obj1 = new Movie(new String("Star Wars"), 1977,
                new String("You can waste time with your friends "
                        + "when your chores are done."));
        obj2 = new Movie(new String("Star Wars"), 2008,
                new String("Great. Rolling death balls."));
        assertFalse("Incorrect result", obj1.equals(obj2));
        assertFalse("Incorrect result", obj2.equals(obj1));
    }

    /** Test that non-movie objects are not equal */
    @Test
    public void testMovieNotSameEquals() {
        Object obj1;
        Object obj2; // Check it - Object is supertype of everything

        // another kind of object
        obj1 = new Movie("Poltergeist", 1982, "Follow the light");
        obj2 = "Poltergeist (1982)"; // test against a String
        assertFalse("Incorrect result", obj1.equals(obj2));
        assertFalse("Incorrect result", obj2.equals(obj1)); // check reflexive

        // nothing
        obj1 = new Movie("2001: A Space Odyssey", 1968, "HAL, are you there?");
        obj2 = null;
        assertFalse("Incorrect result", obj1.equals(obj2));
    }

    /** a==b & b==c ==> a == c */
    @Test
    public void testMovieTransitiveEquals() {
        Movie obj1;
        Movie obj2;
        Movie obj3; // Check it - Object is supertype of everything
        // same movie
        obj1 = new Movie(new String("Wizard of Oz"), 1939,
                new String("We're not in Kansas anymore."));
        obj2 = new Movie(new String("Wizard of Oz"), 1939,
                new String("We're not in Kansas anymore."));
        obj3 = new Movie(new String("Wizard of Oz"), 1939,
                new String("If I only had a brain."));
        assertEquals("Incorrect result", obj1, obj2);
        assertEquals("Incorrect result", obj2, obj3);  // does not care about
                                                       // quote
        assertEquals("Incorrect result", obj1, obj3); // test transitive

        assertTrue("Incorrect result", obj3.equals(obj2));
        assertTrue("Incorrect result", obj2.equals(obj1));
        assertTrue("Incorrect result", obj3.equals(obj1)); // test transitive
    }

}
