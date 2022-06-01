
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test for IMAXMovie class
 * 
 * @author PCSE CS250 instructors of yesteryear
 * @version 1
 *
 */
public class IMAXMovieTest {
    /** test constructor and gettors */
    @Test
    public void testNewMovie() {
        Movie movie = new IMAXMovie("Star Wars", 1980, "I'm your father");
        String name = movie.getName(); // Yes I know it wasn't IMAX back then
        int year = movie.getYear();

        assertEquals("Incorrect result", "Star Wars", name);
        assertEquals("Incorrect result", 1980, year);
    }

    /** test movie */
    @Test
    public void testIMAXMovie() {
        Object obj1;
        Object obj2;
        // same movie
        obj1 = new IMAXMovie(new String("Wizard of Oz"), 1939,
                "We're not in Kansas anymore");
        obj2 = new IMAXMovie(new String("Wizard of Oz"), 1939,
                "We're not in Kansas anymore");
        assertEquals("Incorrect result", obj1, obj2);
        // movie of different name
        obj1 = new IMAXMovie("Casino Royale", 2006, "God save the Queen");
        obj2 = new IMAXMovie("Quantum of Solace", 2006, "My name is Bond");
        assertFalse("Incorrect result", obj1.equals(obj2));
        // movie of different year
        obj1 = new IMAXMovie(new String("Star Wars"), 1977, "R2?");
        obj2 = new IMAXMovie(new String("Star Wars"), 2008, "Feel the anger");
        assertFalse("Incorrect result", obj1.equals(obj2));
        assertFalse("Incorrect result", obj2.equals(obj1)); // test reflexive

        // movie of different year
        obj1 = new IMAXMovie(new String("Star Wars"), 1977,
                "It's the princess");
        obj2 = new Movie(new String("Star Wars"), 1977, "It's the princess");
        assertFalse("Incorrect result", obj1.equals(obj2));
        // Leaving reflexive test out here as demonstration using separate test

        // another object
        obj1 = new IMAXMovie("Poltergeist", 1982, "Follow the light");
        obj2 = "Poltergeist (1982)";
        assertFalse("Incorrect result", obj1.equals(obj2));
        // nothing
        obj1 = new IMAXMovie("2001: A Space Odyssey", 1968,
                "Open the hantch, HAL");
        obj2 = null;
        assertFalse("Incorrect result", obj1.equals(obj2));
    }

    /** test movie */
    @Test
    public void testReflexiveEquals() {
        Object obj1;
        Object obj2;
        // movie of different year
        obj1 = new IMAXMovie(new String("Star Wars"), 1977,
                "It's the princess");
        obj2 = new Movie(new String("Star Wars"), 1977, "It's the princess");
        assertFalse("Incorrect result", obj1.equals(obj2));

        assertFalse("Incorrect result", obj2.equals(obj1)); // test reflexive
        // another object
    }

    /** test movie */
    @Test
    public void testTransitiveEquals() {
        Object obj1;
        Object obj2;
        Object obj3;
        // movie of different year
        obj1 = new IMAXMovie(new String("Star Wars"), 1977,
                "It's the princess");
        obj2 = new IMAXMovie(new String("Star Wars"), 1977,
                "It's the princess");
        obj3 = new Movie(new String("Star Wars"), 1977, "It's the princess");
        assertTrue("Incorrect result", obj1.equals(obj2));
        assertFalse("Incorrect result", obj2.equals(obj3));
        assertFalse("Incorrect result", obj1.equals(obj3));

        // Reflexive and transitive
        assertFalse("Incorrect result", obj3.equals(obj2));
        assertTrue("Incorrect result", obj2.equals(obj1));
        assertFalse("Incorrect result", obj3.equals(obj1));

    }

}
