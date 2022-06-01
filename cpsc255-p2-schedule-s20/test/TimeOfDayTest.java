import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TimeOfDayTest {
    private class MethodInfo {
        private String methodName;
        private Class[] parameters;
        private Class returnType;
        private boolean isStatic;

        public MethodInfo(String name, Class[] params, Class returnType,
                boolean isStatic) {
            methodName = name;
            parameters = params;
            this.returnType = returnType;
            this.isStatic = isStatic;
        }

        public String getName() {
            return methodName;
        }

        public Class[] getParams() {
            return parameters;
        }

        public Class getReturn() {
            return returnType;
        }

        public boolean isStatic() {
            return isStatic;
        }
    }

    private static PrintStream console;
    private static ByteArrayOutputStream out;
    private Class<?> className;
    private Method aMethod;
    private String classStringName = "TimeOfDay";
    private MethodInfo[] methods = {
            new MethodInfo("getHour", new Class[] {}, int.class, false),
            new MethodInfo("getMinute", new Class[] {}, int.class, false),
            new MethodInfo("toString", new Class[] {}, String.class, false),
            new MethodInfo("readTime", new Class[] { Scanner.class },
                    TimeOfDay.class, true),
            new MethodInfo("isNumber", new Class[] { String.class },
                    boolean.class, true) };

    @BeforeClass
    public static void beforeTestsBegin() {
        // console = System.out;
        // out = new ByteArrayOutputStream();
        // System.setOut(new PrintStream(out));

    }

    @AfterClass
    public static void afterTestsEnd() {
        // System.setOut(console);
    }

    @Before
    public void beforeEachTest() {
        className = null;
        aMethod = null;
    }

    @Test
    public void testClassHasMethods() {
        // class exists
        try {
            Package pkg = getClass().getPackage();
            // declare name and path as Strings. Remove earlier declaration
            String name = pkg == null ? "" : pkg.getName();
            String path = name.equals("") ? "" : (name + ".");
            className = Class.forName(path + classStringName);
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
            fail(classStringName + ".class does not have a " + classStringName
                    + " class (is the class name spelled correctly?");
        }

        for (MethodInfo m : methods) {
            String name = m.getName();
            Class[] params = m.getParams();
            Class expectedReturnType = m.getReturn();
            boolean isStatic = m.isStatic();
            try {
                aMethod = className.getMethod(name, params);
                Class actualReturnType = aMethod.getReturnType();
                int mods = aMethod.getModifiers();
                assertEquals(
                        name + "should have a return type of"
                                + expectedReturnType.toString(),
                        expectedReturnType, actualReturnType);
                assertTrue(name + " should be 'public'",
                        Modifier.isPublic(mods));
                assertEquals(
                        "Method" + name + "should "
                                + (isStatic ? " be " : " not be ") + "static",
                        isStatic, Modifier.isStatic(mods));
            }
            catch (NoSuchMethodException | SecurityException e) {
                System.out.println(e);
                System.out.println("Show all existing methods:");
                Method[] allMethods = TimeOfDay.class.getDeclaredMethods();
                for (Method mthd : allMethods) {
                    System.out.println("  >" + mthd.getName());
                }
                fail(classStringName + ".class does not have a  " + name
                        + "  method. ");
            }
        }
    }

    @Test
    public void testaddMinutes() {
        testClassHasMethods();
        TimeOfDay t = new TimeOfDay(10, 20);
        t.addMinutesToDay​(256);
        int hoursExpected = 14;
        int minutesExpected = 36;
        assertEquals(
                "10:20 + 256 minutes should be 2:36, so hours should be 2 ",
                hoursExpected, t.getHour());
        assertEquals(
                "10:20 + 256 minutes should be 2:36, so minutes should be 36 ",
                minutesExpected, t.getMinute());
    }

}
