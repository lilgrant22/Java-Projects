import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Test;

public class GradeBookTest {

    @Test
    public void testFieldCount() {
        Field[] allFields = StudentGradeBook.class.getDeclaredFields();

        assertEquals("SimpleStudent should have 2 fields (name, gpa).", 2,
                allFields.length);
    }

    @Test
    public void testFieldsPrivate() {
        Field[] allFields = StudentGradeBook.class.getDeclaredFields();

        assertTrue("SimpleStudent fields should be private.",
                Modifier.isPrivate(allFields[0].getModifiers()));
        assertTrue("SimpleStudent fields should be private.",
                Modifier.isPrivate(allFields[1].getModifiers()));
    }

    @Test
    public void testField2() {
        Field[] allFields = StudentGradeBook.class.getDeclaredFields();

        assertEquals("SimpleStudent should have 2 fields.", 2,
                allFields.length);
        assertTrue("SimpleStudent field should be private.",
                Modifier.isPrivate(allFields[0].getModifiers()));
        assertTrue("SimpleStudent field should be private.",
                Modifier.isPrivate(allFields[1].getModifiers()));
    }

    @Test
    public void testSimpleStudentWithSevenMethods() {
        Method[] allMethods = StudentGradeBook.class.getDeclaredMethods();
        for (Method mthd : allMethods) {
            System.out.println(mthd);
        }
        assertEquals("SimpleStudent should have 6 methods including main", 6,
                allMethods.length);
    }

    @Test
    public void testDefaultConstructor() {
        StudentGradeBook grades = new StudentGradeBook();
        assertEquals("Gradebook starts with 0 students", 0, grades.getCount());
    }

    @Test
    public void testAddStudent() {
        StudentGradeBook grades = new StudentGradeBook();
        grades.addStudent(new Student("test", 3.9));
        assertEquals("Gradebook has with 1 students", 1, grades.getCount());
    }

    @Test
    public void testAddStudentGrades() {
        StudentGradeBook grades = new StudentGradeBook();
        grades.addStudent(new Student("test", 3.9));
        assertEquals("Gradebook starts with 1 students", 1, grades.getCount());
        assertEquals("Gradebook has 1 grade - get min", 3.9,
                grades.getMinGrade(), 0.0001);
        assertEquals("Gradebook has 1 grad - get max", 3.9,
                grades.getMaxGrade(), 0.0001);
        assertEquals("Gradebook has 1 grade - get average", 3.9,
                grades.getAverageGrade(), 0.0001);
    }

    @Test
    public void testAddStudentGrades2() {
        StudentGradeBook grades = new StudentGradeBook();
        grades.addStudent(new Student("test1", 3.5));
        grades.addStudent(new Student("test2", 2.7));
        assertEquals("Gradebook starts with 1 students", 2, grades.getCount());
        assertEquals("Gradebook has 2 grades - get min", 2.7,
                grades.getMinGrade(), 0.0001);
        assertEquals("Gradebook has 2 grades - get max", 3.5,
                grades.getMaxGrade(), 0.0001);
        assertEquals("Gradebook has 2 grades - get average", 3.1,
                grades.getAverageGrade(), 0.0001);
    }

    @Test
    public void testAddTenStudents() {
        StudentGradeBook grades = new StudentGradeBook();
        for (int i = 0; i < 10; i++) {
            grades.addStudent(new Student("test_" + i, 2.0 + 0.2 * i));
        }
        assertEquals("Gradebook starts with 1 students", 10,
                grades.getCount());
        assertEquals("Gradebook has 1 grade - get min", 2.0,
                grades.getMinGrade(), 0.0001);
        assertEquals("Gradebook has 1 grad - get max", 3.8,
                grades.getMaxGrade(), 0.0001);
        assertEquals("Gradebook has 1 grade - get average", 2.9,
                grades.getAverageGrade(), 0.0001);

    }
}
