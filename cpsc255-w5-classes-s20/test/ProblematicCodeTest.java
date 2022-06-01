import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test for correction of bad code we've seen in Intro Java
 * 
 * @author dconner
 * @version 0
 */
public class ProblematicCodeTest {

    /** test */
    @Test
    public void test1to2() {
        int val = ProblematicCode.calcProductOfRange(1, 2);
        assertEquals("output check", 2, val);
    }

    @Test
    public void test2to6() {
        int val = ProblematicCode.calcProductOfRange(2, 6);
        assertEquals("output check", 2 * 3 * 4 * 5 * 6, val);
    }

    @Test
    public void test42to47() {
        int val = ProblematicCode.calcProductOfRange(42, 47);
        assertEquals("output check", 42 * 43 * 44 * 45 * 46 * 47, val);
    }

    @Test
    public void test100to133() {
        int val = ProblematicCode.calcProductOfRange(11, 17);
        assertEquals("output check", 98017920, val);
    }

    @Test
    public void testSumArray() {
        int val = ProblematicCode.sumArray(new int[] { 1, 2, 3 });
        assertEquals("output check", 6, val);
    }

    @Test
    public void testSumArray2() {
        int val = ProblematicCode.sumArray(new int[] { 3, 2, -5, 3, -4, 6, -10 });
        assertEquals("output check", -5, val);
    }

    @Test
    public void testIfBlockBuzz() {
        String val = ProblematicCode.ifBlock(-1, -1);
        assertEquals("output check", "buzz", val);

    }

    @Test
    public void testIfBlockNope() {
        String val = ProblematicCode.ifBlock(1, -1);
        assertEquals("output check", "Nope", val);

    }

    @Test
    public void testIfBlockFizz() {
        String val = ProblematicCode.ifBlock(1, 1);
        assertEquals("output check", "fizz", val);

    }

}
