
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FarmAnimalsTest {
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
    public void testFarmAnimalsDontMakeAnySounds() {
        FarmAnimal animal = new FarmAnimal();
        // should not print anything to console
        animal.makeSound();
        final String expected = "";
        final String actual = buffer.toString();
        assertEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testWingedAnimalsAreFarmAnimalsThatMakeFlapFlapSounds() {
        WingedAnimal animal = new WingedAnimal();
        assertTrue(animal instanceof FarmAnimal);
        // should print to console (using "println")
        animal.makeSound();
        final String expected = "Flap, Flap" + EOL;
        final String actual = buffer.toString();
        assertEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testRoostersAreWingedAnimalsThatMakeFlapFlapAndCockADoodleDoSounds() {
        FarmAnimal animal = new Rooster();
        assertTrue(animal instanceof WingedAnimal);
        // should print to console (using "println")
        animal.makeSound();
        final String expected = "Flap, Flap" + EOL + "Cock-a-doodle-do" + EOL;
        final String actual = buffer.toString();
        assertEquals("Incorrect result", expected, actual);
    }

    @Test
    public void testDucksAreWingedAnimalsThatMakeFlapFlapAndQuackSounds() {
        FarmAnimal animal = new Duck();
        assertTrue(animal instanceof WingedAnimal);
        // should print to console (using "println")
        animal.makeSound();
        final String expected = "Flap, Flap" + EOL + "Quack" + EOL;
        final String actual = buffer.toString();
        assertEquals("Incorrect result", expected, actual);
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
