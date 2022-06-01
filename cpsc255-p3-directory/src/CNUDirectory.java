import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class for executing CNU Directory
 * 
 * @author Andrew Little
 * @version 04/03/2020
 *
 */
public class CNUDirectory 
{
    private java.util.Scanner kbd; //Scanner
    private ArrayList<DirectoryEntry> list 
        = new ArrayList<DirectoryEntry>(); // array list
    
    /**
     * Constructor
     * 
     * @param myKbd
     *              keyboard scanner
     */
    public CNUDirectory(java.util.Scanner myKbd)
    {
        this.kbd = myKbd;
    }
    
    /**
     * Gets users choice of action
     * 
     * @return user choice
     */
    public java.lang.String getChoice()
    {
        
        System.out.println("What would you like to do? (I/C/E/A/Q) ---> ");
        while (true)
        {
            String choice = kbd.next(); 
            choice = choice.toUpperCase();
            boolean valid = true;
            
            for (int i = 0; i < choice.length(); i++)
            {
                if (choice.charAt(i) != 'I'
                        && choice.charAt(i) != 'C'
                        && choice.charAt(i) != 'E'
                        && choice.charAt(i) != 'A'
                        && choice.charAt(i) != 'Q')
                {
                    valid = false;
                }
            }
            if (valid && choice.length() != 0)
            {
                return choice;
            }
            else
            {
                valid = false;
                //System.out.println("Please enter a valid character ---> ");
            }
        }
    }
    
    /**
     * Gets next action if users choice is to insert
     * 
     * @return user choice
     */
    public java.lang.String insert()
    {
        System.out.println("Enter their label (S/F/T---> ");
        while (true)
        {
            String choice = kbd.next(); 
            choice = choice.toUpperCase();
            boolean valid = true;
            
            for (int i = 0; i < choice.length(); i++)
            {
                if (choice.charAt(i) != 'S'
                        && choice.charAt(i) != 'F'
                        && choice.charAt(i) != 'T')
                {
                    valid = false;
                }
            }
            if (valid && choice.length() != 0)
            {
                return choice;
            }
            else
            {
                valid = false;
                System.out.println("Please enter a valid character ---> ");
            }
        }
    }
    
    /**
     * if users choice is to insert, this method inserts
     * 
     */
    public void addEntry()
    {
        //student
        if (getChoice().equals("I"))
        {  
            if (insert().equals("S"))
            {   
                System.out.println("Enter the student's name ---> ");
                String name = kbd.next();
            
                System.out.println("Enter the student's home address ---> ");
                String address = kbd.next();
            
                System.out.println("Enter the student's dorm name ---> ");
                String dorm = kbd.next();
            
                System.out.println("Enter the student's major ---> ");
                String major = kbd.next();
            
                StudentEntry student = new StudentEntry(name, 
                        address, 
                        dorm, 
                        major);
                list.add(student);
            }
        
            else if (insert().equals("F"))
            {
                System.out.println("Enter the faculty member's name ---> ");
                String name = kbd.next();
            
                System.out.println("Enter the faculty member's "
                        + "home address ---> ");
                String address = kbd.next();
            
                System.out.println("Enter the faculty member's office ---> ");
                String office = kbd.next();
            
                System.out.println("Enter the faculty member's "
                        + "department  ---> ");
                String department = kbd.next();
            
                FacultyEntry faculty = new FacultyEntry(name, 
                        address, 
                        office, 
                        department);
                list.add(faculty);
            }
        
            else if (insert().equals("T"))
            {
                System.out.println("Enter the staff member's name ---> ");
                String name = kbd.next();
            
                System.out.println("Enter the staff member's "
                        + "home address ---> ");
                String address = kbd.next();
            
                System.out.println("Enter the staff member's title ---> ");
                String title = kbd.next();
            
                StaffEntry staff = new StaffEntry(name, address, title);
                list.add(staff);
            }
            System.out.println(list);
        }
    }
    

    /**
     * main method
     * 
     * @param args
     *              argument
     */
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        CNUDirectory directory = new CNUDirectory(kbd);
        directory.getChoice();
        if (directory.getChoice().equals("I"))
        {
            directory.addEntry();
        }
       
    }
    
}
