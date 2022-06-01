
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RuminantAnimalsTest {
    private final String EOL = System.getProperty("line.separator");

    private PrintStream console;
    private ByteArrayOutputStream buffer;

    @Before
    public void redirectOutputToStream() {
        // redirect output to a stream
        console = System.out;
        buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));
    }

    @After
    public void redirectOutputToConsole() {
        // return output to its rightful owner
        System.setOut(console);
    }

    @Test
    public void testRuminantsAreFarmAnimals() {
        FarmAnimal animal = new Ruminant();
        // should not print anything to console
        assertTrue(animal instanceof FarmAnimal);
    }

    @Test
    public void testRuminantsAreFarmAnimalsThatDontMakeAnySounds() {
        FarmAnimal animal = new Ruminant();
        // should not print anything to console
        animal.makeSound();
        final String expected = "";
        final String actual = buffer.toString();
        assertEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testGoatsAreRuminantsThatMakeBeEhSounds() {
        FarmAnimal animal = new Goat();
        assertTrue(animal instanceof Ruminant);
        // should print to console (using "println")
        animal.makeSound();
        final String expected = "Baah" + EOL;
        final String actual = buffer.toString();
        assertEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testCowsAreRuminantsThatMakeMooSounds() {
        FarmAnimal animal = new Cow();
        assertTrue(animal instanceof Ruminant);
        // should print to console (using "println")
        animal.makeSound();
        final String expected = "Moo" + EOL;
        final String actual = buffer.toString();
        assertEquals("Incorrect result", expected, actual);
    }
}
