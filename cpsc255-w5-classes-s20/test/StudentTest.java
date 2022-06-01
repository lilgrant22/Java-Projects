import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testFieldCount() {
        Field[] allFields = Student.class.getDeclaredFields();

        assertEquals("Student should have 4 fields (cnt, id, name, grade).", 4,
                allFields.length);
    }

    @Test
    public void testFieldsPrivate() {
        Field[] allFields = Student.class.getDeclaredFields();

        assertTrue("Student fields should be private.",
                Modifier.isPrivate(allFields[0].getModifiers()));
        assertTrue("Student fields should be private.",
                Modifier.isPrivate(allFields[1].getModifiers()));
    }

    @Test
    public void testField2() {
        Field[] allFields = Student.class.getDeclaredFields();

        assertEquals("Student should have 4 fields (including static).", 4,
                allFields.length);
        assertTrue("Student field should be private.",
                Modifier.isPrivate(allFields[0].getModifiers()));
        assertTrue("Student field should be private.",
                Modifier.isPrivate(allFields[1].getModifiers()));
        assertTrue("Student field should be private.",
                Modifier.isPrivate(allFields[2].getModifiers()));
        assertTrue("Student field should be private.",
                Modifier.isPrivate(allFields[3].getModifiers()));
    }

    @Test
    public void testStudentWithSevenMethods() {
        Method[] allMethods = Student.class.getDeclaredMethods();
        for (Method mthd : allMethods) {
            System.out.println(mthd);
        }
        assertEquals("Student should have 6 methods", 6, allMethods.length);
    }

    @Test
    public void testDefaultConstructorGetName() {
        Student student = new Student();
        assertTrue("Student default name ",
                student.getName().contains("no_name_"));
    }

    @Test
    public void testDefaultConstructorGetGrade() {
        Student student = new Student();
        assertEquals("Student : ", 0.0, student.getGrade(), 0.0001);
    }

    @Test
    public void testSetGetName() {
        Student student = new Student();
        student.setName("Joe");
        assertEquals("Student : setName ", "Joe", student.getName());

    }

    @Test
    public void testSetGetGrade() {
        Student student = new Student();
        student.setGrade(3.99);
        assertEquals("Student : setGrade ", 3.99, student.getGrade(), 0.0001);
    }

    @Test
    public void testTwoArgConstructor() {
        Student student = new Student("test_name", 2.705);
        assertEquals("Student : ", "test_name", student.getName());
        assertEquals("Student : ", 2.705, student.getGrade(), 0.0001);
    }

    @Test
    public void testTwoArgConstructor2() {
        Student student = new Student("Name Test", 3.70);
        assertEquals("Student : ", "Name Test", student.getName());
        assertEquals("Student : ", 3.700, student.getGrade(), 0.0001);
    }

    @Test
    public void testThreeArgConstructor() {
        Student student = new Student(99, "Name Test", 3.70);
        assertEquals("Student : ", "Name Test", student.getName());
        assertEquals("Student : ", 3.700, student.getGrade(), 0.0001);
        assertEquals("Student : ", 99, student.getID());
    }

}
