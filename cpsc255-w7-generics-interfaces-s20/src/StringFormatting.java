
/**
 * Test String formatting
 * 
 * @author <student>
 * @version 0
 */

public class StringFormatting {

    // @todo - correct the formating to match the JUnit test
    /**
     * 
     * @param val
     *            - value to print
     * @return formatted string
     */
    public static String integerToString(int val) {
        // allow for 3 columns with leading blanks, right justified
        return String.format("%3d", val);

    }

    // @todo - correct the formating to match the JUnit test
    /**
     * 
     * @param amount
     *            - dollar to format
     * @return formatted string
     */
    public static String dollarToString(double amount) {
        // $, 12 spaces for double (float), 2 precision, with commas
        return String.format("$%,12.2f", amount);

    }
}
