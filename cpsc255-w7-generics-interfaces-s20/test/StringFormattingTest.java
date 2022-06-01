
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringFormattingTest {

    @Test
    public void testPrintIntegers() {
        assertEquals("  1", StringFormatting.integerToString(1));
        assertEquals("  8", StringFormatting.integerToString(8));
        assertEquals(" 10", StringFormatting.integerToString(10));
        assertEquals("111", StringFormatting.integerToString(111));
        assertEquals("4444", StringFormatting.integerToString(4444));

    }

    @Test
    public void testPrintDollarAmounts() {
        assertEquals("$        3.14", StringFormatting.dollarToString(3.14));
        assertEquals("$    2,001.00", StringFormatting.dollarToString(2001));
        assertEquals("$    7,623.10", StringFormatting.dollarToString(7623.1));
        assertEquals("$       16.00", StringFormatting.dollarToString(15.999));
        assertEquals("$5,507,869.00",
                StringFormatting.dollarToString(5507869.001));

    }
}
