import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GenericMethodsTest {

    @Test
    public void testInitInteger() {
        Integer[] array = new Integer[3];
        Integer val = new Integer(3);

        GenericMethods.initIntegers(array, val);
        assertEquals(array[0], val);
        assertEquals(array[1], val);
        assertEquals(array[2], val);
    }

    @Test
    public void testInitGeneric() {
        String[] array = new String[3];
        String val = "test";

        GenericMethods.init(array, val);
        assertEquals(array[0], val);
        assertEquals(array[1], val);
        assertEquals(array[2], val);
    }

}
