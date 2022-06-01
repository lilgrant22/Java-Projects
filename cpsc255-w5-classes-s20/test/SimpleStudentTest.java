import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Test;

public class SimpleStudentTest {

    @Test
    public void testFieldCount() {
        Field[] allFields = SimpleStudent.class.getDeclaredFields();

        assertEquals("SimpleStudent should have 2 fields (name, gpa).", 2,
                allFields.length);
    }

    @Test
    public void testFieldsPrivate() {
        Field[] allFields = SimpleStudent.class.getDeclaredFields();

        assertTrue("SimpleStudent fields should be private.",
                Modifier.isPrivate(allFields[0].getModifiers()));
        assertTrue("SimpleStudent fields should be private.",
                Modifier.isPrivate(allFields[1].getModifiers()));
    }

    @Test
    public void testField2() {
        Field[] allFields = SimpleStudent.class.getDeclaredFields();

        assertEquals("SimpleStudent should have 2 fields.", 2,
                allFields.length);
        assertTrue("SimpleStudent field should be private.",
                Modifier.isPrivate(allFields[0].getModifiers()));
        assertTrue("SimpleStudent field should be private.",
                Modifier.isPrivate(allFields[1].getModifiers()));
    }

    @Test
    public void testSimpleStudentWithSevenMethods() {
        Method[] allMethods = SimpleStudent.class.getDeclaredMethods();
        for (Method mthd : allMethods) {
            System.out.println(mthd);
        }
        assertEquals("SimpleStudent should have 7 methods including main", 7,
                allMethods.length);
    }

    @Test
    public void testDefaultConstructorGetName() {
        SimpleStudent student = new SimpleStudent();
        assertEquals("SimpleStudent default name is Archimedes", "Archimedes",
                student.getName());
    }

    @Test
    public void testDefaultConstructorGetGPA() {
        SimpleStudent student = new SimpleStudent();
        assertEquals("SimpleStudent : Archimedes's GPA is 3.14", 3.14,
                student.getGPA(), 0.0001);
    }

    @Test
    public void testSetName() {
        SimpleStudent student = new SimpleStudent();
        assertEquals("SimpleStudent default name is Archimedes", "Archimedes",
                student.getName());
        student.setName("Joe");
        assertEquals("SimpleStudent : setName ", "Joe", student.getName());

    }

    @Test
    public void testSetGPA() {
        SimpleStudent student = new SimpleStudent();
        assertEquals("SimpleStudent : Archimedes's GPA is 3.14", 3.14,
                student.getGPA(), 0.0001);
        student.setGPA(3.99);
        assertEquals("SimpleStudent : setName ", 3.99, student.getGPA(),
                0.0001);
    }

}
