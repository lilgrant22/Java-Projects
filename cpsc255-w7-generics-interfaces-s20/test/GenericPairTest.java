import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class GenericPairTest {

    @Test
    public void testIntegerPair() {

        GenericPair<Integer> a = new GenericPair<Integer>(1, 42);
        assertNotNull("failed to create", a);
        assertTrue(" One is not an Integer",
                a.getFirst().getClass() == Integer.class);
        assertTrue(" Two is not an Integer",
                a.getSecond().getClass() == Integer.class);
        assertEquals(" first==1", new Integer(1), a.getFirst());
        assertEquals(" second==42", new Integer(42), a.getSecond());
    }

    @Test
    public void testDoublePair() {

        GenericPair<Double> a = new GenericPair<Double>(1.0, 2.1);
        assertNotNull("failed to create", a);
        assertTrue(" First is not a Double",
                a.getFirst().getClass() == Double.class);
        assertTrue(" Second is not a Double",
                a.getSecond().getClass() == Double.class);
        assertEquals(" first==1.0", new Double(1), a.getFirst());
        assertEquals(" second==2.1", new Double(2.1), a.getSecond());
    }

    @Test
    public void testStringPair() {

        GenericPair<String> a = new GenericPair<String>("Joe", "Fred");
        assertNotNull("failed to create", a);
        assertTrue(" first is not a String",
                a.getFirst().getClass() == String.class);
        assertTrue(" second is not a String",
                a.getSecond().getClass() == String.class);
        assertEquals(" first==1.0", new String("Joe"), a.getFirst());
        assertEquals(" second==2.1", new String("Fred"), a.getSecond());
    }

    @Test
    public void testPolymorphism() {
        GenericPair<Integer> a = new GenericPair<Integer>(1, 42);
        GenericPair<Double> b = new GenericPair<Double>(1.5, 3.1415927);
        GenericPair<String> c = new GenericPair<String>("Joe", "Fred");

        // Everything in Java is an Object, so we can call toString that way
        ArrayList<Object> pairs = new ArrayList<Object>();
        pairs.add(a);
        pairs.add(b);
        pairs.add(new GenericPair<String>("Hello", "World"));
        pairs.add(c);
        assertEquals("Object same reference failed", c, pairs.get(3));
        assertEquals("toString check", "Hello\tWorld",
                pairs.get(2).toString());

        // Using just the class name as an interface also works
    }

}
