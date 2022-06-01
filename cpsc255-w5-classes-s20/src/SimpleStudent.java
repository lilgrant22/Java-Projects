/**
 * 
 * Make the field private
 * 
 * Add getters and setters for both fields
 * 
 * Add toString and equals as overrides
 * 
 * @author Andrew Little
 * @version 2/18/2020
 * 
 */

public class SimpleStudent {

    private String name; // Student name
    private double gpa;  // Student's current gpa
    
    /**
     * sets the default values for name and gpa
     */
    public SimpleStudent()
    {
        name = "Archimedes";
        gpa = 3.14;
        
    }
    
    /** 
     * Sets the name for the SimpleStudent object
     * 
     * @param name
     */
    public SimpleStudent(String name)
    {
        this.name = name;
    }
    
    /**
     * Sets the name and gpa for the SimpleStudent object
     * 
     * @param name
     * @param gpa
     */
    public SimpleStudent(String name, double gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }

    /**
     * Gets the name for the SimpleStudent object
     * 
     * @return
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Sets the name for the SimpleStudent object
     * 
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Sets the gpa for the SimpleStudent object
     * 
     * @param gpa_
     */
    public void setGPA(double gpa_)
    {
        this.gpa = gpa_;
    }
    
    /**
     * Gets the gpa for the SimpleStudent object
     * 
     * @return
     */
    public double getGPA()
    {
        return this.gpa;
    }


    /**
     * 
     * Simple demo in main
     * 
     * @param args
     *                 not used here
     */
    public static void main(String[] args) {

        SimpleStudent joe = new SimpleStudent();

        joe.name = "Joe";
        joe.gpa = 3.4;

        // Objects are things, and we can have an array of things
        SimpleStudent[] students = { joe, new SimpleStudent() };

        students[1].name = "Fred";
        students[1].gpa = 1.9;

        for (SimpleStudent student : students)
            System.out.println(student);

        // students[1].setName("Fred Flintstone");
        // students[0].setName("Fred Flintstone");
        System.out.println(students[0]);
        System.out.println(students[0].equals(students[1]));

    }
}
