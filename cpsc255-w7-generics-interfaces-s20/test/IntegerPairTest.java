import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class IntegerPairTest {

    @Test
    public void testConstruction() {
        IntegerPair test = new IntegerPair(2, 3);
        assertNotNull("failed to create", test);
    }

    @Test
    public void test23() {
        IntegerPair test = new IntegerPair(2, 3);
        assertNotNull("failed to create", test);
        assertEquals(" first is not 2", new Integer(2), test.getFirst());
        assertEquals(" second is not 3", new Integer(3), test.getSecond());
    }

    @Test
    public void test23String() {
        IntegerPair test = new IntegerPair(2, 3);
        assertEquals("  toString is not correct with tab separation", "2\t3",
                test.toString());

    }

}
