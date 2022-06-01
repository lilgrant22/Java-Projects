/**
 * Demo class for how instructors are called
 * 
 * @author Conner
 * @version 0
 */
public class C
    extends B
{
    /**
     * Create a new C object.
     */
    public C()
    {
        System.out.print("[C]");
    }


    /**
     * Create a new C object.
     * 
     * @param test
     *            string
     */
    public C(String test)
    {
        super(test, 0);
        System.out.print("[" + test + "]");
    }


    /**
     * The main to run
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args)
    {

        System.out.println("------- A-C Demo ------");
        A a = new A();
        System.out.println(" instance of A " + (a instanceof A));
        System.out.println("\n=====================");
        B b = new B();
        System.out.println(" instance of B " + (b instanceof B));
        System.out.println(" instance of A " + (b instanceof A));
        System.out.println("\n---------------------");
        B bb = new B("BB");
        System.out.println(" instance of B " + (bb instanceof B));
        System.out.println(" instance of A " + (bb instanceof A));
        System.out.println("\n---------------------");
        B bd = new B("BD", 2);
        System.out.println(" instance of B " + (bd instanceof B));
        System.out.println(" instance of A " + (bd instanceof A));
        System.out.println("\n=====================");
        C c = new C("C");
        System.out.println(" instance of C " + (c instanceof C));
        System.out.println(" instance of B " + (c instanceof B));
        System.out.println(" instance of A " + (c instanceof A));
        System.out.println("\n---------------------");
        B cb = new C("CB");
        System.out.println(" instance of C " + (cb instanceof C));
        System.out.println(" instance of B " + (cb instanceof B));
        System.out.println(" instance of A " + (cb instanceof A));
        System.out.println("\n---------------------");
        A ca = new C("CA");
        System.out.println(" instance of C " + (ca instanceof C));
        System.out.println(" instance of B " + (ca instanceof B));
        System.out.println(" instance of A " + (ca instanceof A));
    }

}
