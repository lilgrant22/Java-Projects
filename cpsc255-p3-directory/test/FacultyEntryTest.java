import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FacultyEntryTest
{
    @Test
    public void facultyConstructorTest()
    {
        DirectoryEntry d =
            new FacultyEntry("johnny smith", "1234 addr", "xxx", "yyy");
        new DirectoryEntryTest().testClassHasMethods(); // ensure superclass ok
        assertEquals(d.getFirst(), "johnny");
        assertEquals(d.getLast(), "smith");
        assertTrue(d.isLabelShown());
        assertFalse(d.isAddressShown());
    }


    @Test
    public void compareToTest()
    {
        new DirectoryEntryTest().testClassHasMethods(); // ensure superclass ok
        DirectoryEntry d =
            new FacultyEntry("johnny smith", "1234 addr", "xxx", "yyy");
        assertEquals(
            "for entries that are the same, compareTo should 0",
            0,
            d.compareTo(d));
        DirectoryEntry e =
            new FacultyEntry("johnny smith", "1234 addr", "xxx", "yyy");
        assertEquals(
            "for entries that are equal, compareTo should 0",
            0,
            d.compareTo(e));
        DirectoryEntry f =
            new StudentEntry("johnny smith", "1234 addr", "xxx", "yyy");
        assertTrue(
            "faculty with the same name come before students (f < s)",
            e.compareTo(f) < 0);
        DirectoryEntry g =
            new FacultyEntry("smith johnny", "1234 addr", "xxx", "yyy");
        assertTrue("johnny should be < smith", g.compareTo(e) < 0);
        DirectoryEntry h =
            new FacultyEntry("susie smith", "1234 addr", "xxx", "yyy");
        assertTrue("first name johnny < susie", e.compareTo(h) < 0);
        DirectoryEntry i =
            new FacultyEntry("Johnny smith", "1234 addr", "xxx", "yyy");
        assertTrue("first name Johnny < johnny", i.compareTo(e) < 0);
        assertTrue(
            "if Johnny < johnny, then johnny > Johnny",
            e.compareTo(i) > 0);
        DirectoryEntry j =
            new StudentEntry("Johnny jones", "1234 addr", "xxx", "yyy");

        assertTrue(
            "compare should return < 0 for  student name < faculty name   student > faculty ",
            j.compareTo(i) < 0);

    }

    // the rest of the file tests that FacultyEntry has the correct methods
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
    private String                       classStringName = "FacultyEntry";
    private MethodInfo[]                 methods         =
        { new MethodInfo("toString", new Class[] {}, String.class, false) };

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
        // is class abstract
        assertFalse(
            classStringName + "should not be abstract",
            Modifier.isAbstract(className.getModifiers()));
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

}
