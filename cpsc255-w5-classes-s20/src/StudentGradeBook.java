
import java.util.Random;

public class StudentGradeBook {

    // TODO - JavaDoc
    private Student[] students;
    private int count;

    // Need a constructor!
    
    
    public StudentGradeBook() 
    {
        count = 0;
        students = new Student[count];
    }
    
    public StudentGradeBook(int count) 
    {
        this.count = count;
        students = new Student[count];
    }
    

    // JavaDoc
    public void addStudent(Student student) {

        // TODO - fix this!
        count++;
        
        Student[] temp = new Student[count];
        
        for (int i = 0; i < students.length; i++) {
            temp[i] = students[i];
        }
        
        students = new Student[count];

        for (int i = 0; i < students.length; i++) {
            students[i] = temp[i];
        }
        
        students[count - 1] = student;
    }

    // JavaDoc
    public double getMinGrade() {
        
        double minGrade = Double.MAX_VALUE;
        for(Student s : students)
        {
            if(minGrade > s.getGrade())
            {
                minGrade = s.getGrade();
            }
        }
        return minGrade;
    }

    public double getMaxGrade() {

        double maxGrade = Double.MIN_VALUE;
        for(Student s : students)
        {
            if (maxGrade < s.getGrade())
            {
                maxGrade = s.getGrade();
            }
        }
        return maxGrade;
    }

    public double getAverageGrade() {
        
        double sumGrade = 0;
        for(Student s : students)
        {
            sumGrade += s.getGrade(); 
        }
        return sumGrade / count;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println(" Before we add students we have "
                + Student.getCount() + " students");
        Student joe = new Student();

        // joe.name = "Joe"; // TODO - fix this!
        // joe.gpa = 3.4; // TODO - fix this!

        StudentGradeBook grades = new StudentGradeBook();

        grades.addStudent(joe);

        String[] names = { "Sally", "Charlie", "Lucy", "Linus", "Franklin" };

        // Objects are things, and we can have an array of things
        for (String name : names) {
            Student student = new Student(name,
                    random.nextDouble() * 50.0 + 50.0);
            grades.addStudent(student);
        }

        for (Student student : grades.students) {
            System.out.println(student);
        }

        System.out.println(" Class min: " + grades.getMinGrade());
        System.out.println(" Class max: " + grades.getMaxGrade());
        System.out.println(" Class average: " + grades.getAverageGrade());

    }
}