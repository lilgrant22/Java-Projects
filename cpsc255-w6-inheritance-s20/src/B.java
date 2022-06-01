/**
 * Demo class for how instructors are called
 * 
 * @author Conner
 * @version 0
 */
public class B
    extends A
{

    /**
     * Create a new B object.
     */
    public B()
    {
        System.out.print("(B)");
    }


    /**
     * Create a new B object.
     * 
     * @param test
     *            string
     */
    public B(String test)
    {
        System.out.print("(" + test + ")");
    }


    /**
     * Create a new B object.
     * 
     * @param test
     *            string
     * @param x
     *            number
     */
    public B(String test, int x)
    {
        super(test);
        System.out.print("(" + test + ", " + x + ")");
    }


    /**
     * The main to run
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {

        System.out.println("------- A-B Demo ------");
        System.out.println("\n---------------------");
        A a = new A();
        System.out.println(" instance of " + (a instanceof A));
        System.out.println("\n---------------------");
        B b = new B();
        System.out.println(" instance of B " + (b instanceof B));
        System.out.println(" instance of A " + (b instanceof A));
        System.out.println("\n---------------------");
        B bc = new B("C");
        System.out.println(" instance of B " + (bc instanceof B));
        System.out.println(" instance of A " + (bc instanceof A));
        System.out.println("\n---------------------");
        B bd = new B("D", 2);
        System.out.println(" instance of B " + (bd instanceof B));
        System.out.println(" instance of A " + (bd instanceof A));
        System.out.println("\n---------------------");
    }
}
