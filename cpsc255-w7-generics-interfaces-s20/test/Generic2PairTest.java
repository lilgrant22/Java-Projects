import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Generic2PairTest {

    @Test
    public void testDoubleIntegerPair() {

        Generic2Pair<Double, Integer> a = new Generic2Pair<Double, Integer>(
                3.14, 42);
        assertNotNull("failed to create", a);
        assertTrue(" One is not an Integer",
                a.getFirst().getClass() == Double.class);
        assertTrue(" Two is not an Integer",
                a.getSecond().getClass() == Integer.class);
        assertEquals(" first==3.14", new Double(3.14), a.getFirst());
        assertEquals(" second==42", new Integer(42), a.getSecond());
    }

    @Test
    public void testDoubleStringPair() {

        Generic2Pair<Double, String> a = new Generic2Pair<Double, String>(1.0,
                "TTFN");
        assertNotNull("failed to create", a);
        assertTrue(" First is not a Double",
                a.getFirst().getClass() == Double.class);
        assertTrue(" Second is not a String",
                a.getSecond().getClass() == String.class);
        assertEquals(" first==1.0", new Double(1), a.getFirst());
        assertEquals(" second==\"TTFN\"", "TTFN", a.getSecond());
    }

    @Test
    public void testStringCharPair() {

        Generic2Pair<String, Character> a = new Generic2Pair<String, Character>(
                "Joe", '$');
        assertNotNull("failed to create", a);
        assertTrue(" first is not a String",
                a.getFirst().getClass() == String.class);
        assertTrue(" second is not a String",
                a.getSecond().getClass() == Character.class);
        assertEquals(" first==1.0", new String("Joe"), a.getFirst());
        assertEquals(" second==\'$\'", new Character('$'), a.getSecond());
    }

}
