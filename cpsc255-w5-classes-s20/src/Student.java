public class Student
{

    private static int cnt = 0; // Counter
    private int        id; // Student id
    private String     name; // Student name
    private double     grade;  // Student's grade

    
    /**
     * Constructor
     */
    public Student()
    {
        id = cnt;
        cnt++;
        name = " no_name_" + String.valueOf(id);
        grade = 0.0;
    }

    /**
     * Create a second constructor that sets name and grade, but uses automatic
     * ID setting
     * 
     * @param name
     * @param grade
     */
    public Student(String name, double grade)
    {
        id = cnt;
        cnt++;
        this.name = name;
        this.grade = grade;
    }

    /**
     * Create a third constructor that sets ID, name and grade in that order Use
     * given ID, but increment the counter
     * 
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, double grade)
    {
        this.id = id;
        cnt++;
        this.name = name;
        this.grade = grade;
    }

    /**
     * This method gets the student name from the class instance
     * 
     * @return String student name
     */
    public String getName()
    {
        return this.name;
    }


    /**
     * This method sets the student name This implementation has a problem that
     * we need to fix!
     * 
     * @param name
     *            String name
     * @return void
     */
    public void setName(String name)
    {
        this.name = name;
    }


    /**
     * This method sets the student grade
     *
     * @param grade_
     *            double grade value
     */
    public void setGrade(double grade_)
    {
        this.grade = grade_;
    }


    /**
     * This method gets the student grade from the class instance
     * 
     * @return double student grade
     */
    public double getGrade()
    {
        return this.grade;
    }

    // We won't allow changing of the ID after initially assigned, so no setter!


    /**
     * This method gets the student id from the class instance
     * 
     * @return int student id
     */
    public int getID()
    {
        return id;
    }


    /**
     * This method gets the total student count
     * 
     * @return int student count
     */
    public static double getCount()
    {
        return cnt;
    }

    // TODO - add toString "ID : Name (grade)" use % 4d %32s and %.2f string
    // formats

    // TODO - equals two students are equal iff (if and only if) they have the
    // same ID

}
