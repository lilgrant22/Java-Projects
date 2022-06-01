/**
 * This code has some issues, we will practice out debugging skills, and fix to
 * follow good codinging practices
 * 
 * @author Andrew Little
 * @version 2/18/2020
 */
public class ProblematicCode {

    /**
     * Demo if blocks and why we want extra { }
     * 
     * if x <= 0 return "buzz" otherwise if y > 0 return "fizz", otherwise
     * return "Nope"
     * 
     * @param x
     *              input value
     * @param y
     *              input value
     * @return string
     */
    public static String ifBlock(int x, int y) {
        String output = "";
        if(x <= 0)
        {
            output += "buzz";
        }
        else if(y > 0)
        {
            output += "fizz";
        }
        else 
        {
            output += "nope";
        }
        return output;
    }

    /**
     * Calc sum of array elements
     * 
     * @param array
     *                  integer array
     * @return sum of elements
     */
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    /**
     * calculate the product of numbers from start to end inclusive e.g.
     * calcProductOfRange(3, 6) = 3*4*5*6 = 360
     * 
     * @param start
     *                  the start of numbers
     * @param end
     *                  the end of numbers
     *
     * @return the sum of numbers
     *
     */
    public static int calcProductOfRange(int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum *= i;
        }
        return sum;
    }

    /**
     * This method gives a start and end values for 
     * a set of numbers. The array and the sum is 
     * then printed.
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" 1, 1 " + ifBlock(1, 1));
        System.out.println("-1, 1 " + ifBlock(-1, 1));
        System.out.println("-1,-1 " + ifBlock(-1, -1));
        System.out.println(" 1,-1 " + ifBlock(1, -1));

        int[] array = { 1, 3, 5 };
        System.out.println("sumArray([1, 3,5])=" + sumArray(array));

        System.out.println(
                "calcProductOfRange(3,6)=" + calcProductOfRange(3, 6));
    }

}
