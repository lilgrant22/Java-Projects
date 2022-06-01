/**
 * This class is unrelated to your assignment, but you can use it to practice
 * redirection
 * 
 * @author drlambert
 * @version 03/2020
 */
public class ReadTwo
{
    /**
     * Main method
     * 
     * @param args
     *              argument
     */
    public static void main(String[] args)
    {
        java.util.Scanner kbd = new java.util.Scanner(System.in); // or use
                                                                  // import
        int n1;
        int n2;
        System.out.print("Enter two numbers-> ");
        n1 = kbd.nextInt();
        n2 = kbd.nextInt();
        System.out
            .println("The sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
    }
}
