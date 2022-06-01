import java.util.Scanner;

/**
 * Class used to execute P2-ScheduleMaker
 * 
 * @author Andrew Little
 * @version 02/27/2020
 */
public class CNUScheduleMaker 
{

    private java.util.Scanner kbd; // keyboard input
    private Course[] scheduleArray = new Course[0]; // array of courses
    
    /**
     * Constructor
     * 
     * @param myKbd
     *              keyboard input
     */
    public CNUScheduleMaker(java.util.Scanner myKbd) 
    {
        this.kbd = myKbd;
    }
    
    /**
     * Receives and checks course meeting days for validity
     * 
     * @param className
     *              name of course
     * @return
     *              course meeting days
     */
    public java.lang.String getDays​(java.lang.String className)
    {
        System.out.println("Enter the days " + className + " meets ---> ");
        while (true) 
        {
            String days = kbd.next();
            days = days.toUpperCase();
            boolean valid = true;
            for (int i = 0 ; i < days.length() ; i++) 
            {
                if (days.charAt(i) != 'M' && days.charAt(i) 
                        != 'T' && days.charAt(i) 
                        != 'W' && days.charAt(i) 
                        != 'H' && days.charAt(i) != 'F') 
                {
                    valid = false;
                }
            }
            if (valid && days.length() != 0) 
            {
                return days;
            }
            else 
            {
                valid = false;
            }
        }
        
    }
    
    /**
     * Receives the amount of classes being taken (between start and end)
     * 
     * @param start
     *              lowest number the input can be
     * @param end
     *              highest number the input can be
     * @param prompt
     *              string asking for user input
     * @return
     *              the number entered, if valid
     *              
     */
    public int getNumberFromScanner​(int start, int end, 
            java.lang.String prompt)
    {
        while (true) 
        {
            System.out.println(prompt);
            int val = kbd.nextInt();
            if (val >= start && val <= end) 
            {
                return val;
            }
        }
    }
    
    /**
     * Getter for number of courses being taken.
     * Then gets information for each course.
     */
    public void getInfo()
    {
        int numClasses = getNumberFromScanner​(0, 10, 
                "How many classes are you taking? ---> ");
        scheduleArray = new Course[numClasses];
        for (int i = 0 ; i < numClasses ; i++)
        {
            String courseName = kbd.next();
            String courseDays = getDays​(courseName);
            int startHour = kbd.nextInt();
            int startMinute = kbd.nextInt();
            TimeOfDay startTime = new TimeOfDay(startHour, startMinute);
            int endHour = kbd.nextInt();
            int endMinute = kbd.nextInt();
            TimeOfDay endTime = new TimeOfDay(endHour, endMinute);
            Course newCourse = new Course(courseName, 
                    startTime, endTime, courseDays);
            scheduleArray[i] = newCourse;
        }
    }
    
    /**
     * Prints students schedule. Utilizes Course's toString method
     * for proper formatting.
     */
    public void printSchedule()
    {
        for (int i = 0 ; i < scheduleArray.length ; i++) 
        {
            System.out.println(scheduleArray[i].toString());
        }
    }
    
    /**
     * Main method for executing CNUScheduleMaker
     * 
     * @param args
     *              main method argument
     */
    public static void main(String[] args) 
    {
        Scanner kbd = new Scanner(System.in);
        CNUScheduleMaker mySchedule = new CNUScheduleMaker(kbd);
        mySchedule.getInfo();
        mySchedule.printSchedule();

    }

}
