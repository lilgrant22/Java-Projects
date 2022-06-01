import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CNUScheduleMakerTest
{
    private class MethodInfo
    {
        private String  methodName;
        private Class[] parameters;
        private Class   returnType;
        private boolean isStatic;

        public MethodInfo(
            String name,
            Class[] params,
            Class returnType,
            boolean isStatic)
        {
            methodName = name;
            parameters = params;
            this.returnType = returnType;
            this.isStatic = isStatic;
        }


        public String getName()
        {
            return methodName;
        }


        public Class[] getParams()
        {
            return parameters;
        }


        public Class getReturn()
        {
            return returnType;
        }


        public boolean isStatic()
        {
            return isStatic;
        }
    }

    private static PrintStream           console;
    private static ByteArrayOutputStream out;
    private Class<?>                     className;
    private Method                       aMethod;
    private String                       classStringName = "CNUScheduleMaker";
    private MethodInfo[]                 methods         = {
        new MethodInfo(
            "getDays",
            new Class[] { String.class },
            String.class,
            false),
        new MethodInfo("getInfo", new Class[] {}, void.class, false),
        new MethodInfo(
            "getNumberFromScanner",
            new Class[] { int.class, int.class, String.class },
            int.class,
            false),
        new MethodInfo("printSchedule", new Class[] {}, void.class, false),
        new MethodInfo(
            "main",
            new Class[] { String[].class },
            void.class,
            true) };

    @BeforeClass
    public static void beforeTestsBegin()
    {
        console = System.out;
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

    }


    @AfterClass
    public static void afterTestsEnd()
    {
        System.setOut(console);
    }


    @Before
    public void beforeEachTest()
    {
        className = null;
        aMethod = null;
    }


    @Test
    public void testClassHasMethods()
    {
        // class exists
        try
        {
            Package pkg = getClass().getPackage();
            // declare name and path as Strings. Remove earlier declaration
            String name = pkg == null ? "" : pkg.getName();
            String path = name.equals("") ? "" : (name + ".");
            className = Class.forName(path + classStringName);
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
            fail(
                classStringName + ".class does not have a " + classStringName
                    + " class (is the class name spelled correctly?");
        }
        for (MethodInfo m : methods)
        {
            String name = m.getName();
            Class[] params = m.getParams();
            Class expectedReturnType = m.getReturn();
            boolean isStatic = m.isStatic();
            try
            {
                aMethod = className.getMethod(name, params);
                Class actualReturnType = aMethod.getReturnType();
                int mods = aMethod.getModifiers();
                assertEquals(
                    name + "should have a return type of"
                        + expectedReturnType.toString(),
                    expectedReturnType,
                    actualReturnType);
                assertTrue(
                    name + " should be 'public'",
                    Modifier.isPublic(mods));
                assertEquals(
                    "Method" + name + "should "
                        + (isStatic ? " be " : " not be ") + "static",
                    isStatic,
                    Modifier.isStatic(mods));
            }
            catch (NoSuchMethodException | SecurityException e)
            {
                fail(
                    classStringName + ".class does not have a  " + name
                        + "  method. ");
            }
        }
    }


    @Test
    public void testgetDaysWithInvalids()
    {
        testClassHasMethods();
        Scanner s = new Scanner("we\nmwk\nmwf");
        String expected = "MWF";
        CNUScheduleMaker c = new CNUScheduleMaker(s);
        String actual = c.getDays​("xx");
        assertEquals(expected, actual);
    }


    @Test
    public void testgetValidDays()
    {
        testClassHasMethods();
        Scanner s = new Scanner("H");
        String expected = "H";
        CNUScheduleMaker c = new CNUScheduleMaker(s);
        String actual = c.getDays​("xx");
        assertEquals(expected, actual);
    }


    @Test
    public void testgetNumber()
    {
        testClassHasMethods();
        Scanner s = new Scanner("30\n-17\n44");
        int expected = 44;
        CNUScheduleMaker c = new CNUScheduleMaker(s);
        int actual = c.getNumberFromScanner​(40, 50, "xx");
        assertEquals(expected, actual);

    }

}
