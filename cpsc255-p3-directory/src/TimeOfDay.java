/**
 * Class used to set and format proper times of day
 * 
 * @author Andrew Little
 * @version 02/21/2020
 *
 */
public class TimeOfDay {
    
    private int        hour; // hours
    private int        minute; // minutes

    /**
     * Constructor
     */
    public TimeOfDay()
    {
        hour = 0;
        minute = 0;
    }
    
    /**
     * Constructor
     * Sets the hours and minutes parameters
     * 
     * @param hour
     *              hours given
     * @param minute
     *              minutes given
     */
    public TimeOfDay(int hour, int minute)
    {
        if (hour > 23 && hour < 0)
        {
            this.hour = 0;
        }
        else {
            this.hour = hour;
        }
        if (minute < 0)
        {
            this.minute = 0;
        }
        else if (minute > 59)
        {
            this.hour += minute / 60;
            this.minute = minute % 60;
        }
        else {
            this.minute = minute;
        }
    }
    
    /**
     * Adds number of minutes to current time
     * 
     * @param min
     *              minutes given
     */
    public void addMinutesToDay(int min)
    {
        this.minute += min;
        this.hour += this.minute / 60;
        this.minute %= 60;
        if (this.hour > 23) 
        {
            this.hour = 0;
        }
    } 

    /**
     * Reads from a scanner to create TimeOfDay object
     * 
     * @param scnr
     *              variable read in from keyboard
     * @return TimeOfDay object
     */
    public static TimeOfDay readTime(java.util.Scanner scnr)
    {
        int minutes;
        int hours;
        String s = scnr.next();
        if (isNumber(s))
        {
            int nbr = Integer.parseInt(s);
            minutes = nbr % 100;
            hours = nbr / 100;
        }
        else
        {
            int colonIndex = s.indexOf(':');
            if (colonIndex == -1 || !isNumber(s.substring(0, colonIndex))
                || !isNumber(s.substring(colonIndex + 1)))
            {
                System.out.println("Invalid time format");
                System.exit(1);
            }
            hours = Integer.parseInt(s.substring(0, colonIndex));
            minutes = Integer.parseInt(s.substring(colonIndex + 1));
        }
        return new TimeOfDay(hours, minutes);
    }

    /**
     * Checks to see if given string is a number
     * 
     * @param str
     *              String to check
     * @return true or false
     */
    public static boolean isNumber(String str)
    {
        try
        {
            int nbr = Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }
    
    /**
     * Sets hour parameter
     * 
     * @return hour
     */
    public int getHour()
    {
        return this.hour;
    }
    
    /**
     * Sets minute parameter
     * 
     * @return minute
     */
    public int getMinute()
    {
        return this.minute;
    }
    
    /**
     * prints the string in the form hh:mm
     * 
     * @return formatted string
     */
    public java.lang.String toString()
    {
        return String.format("%d:%02d", this.hour, this.minute);
    }   
    
}
