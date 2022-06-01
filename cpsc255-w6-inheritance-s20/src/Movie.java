/**
 * movies with title, year, and quote
 * 
 * @author <student>
 * @version 0
 */
public class Movie
{

    /** name of movie */
    private String name;

    /** year shown */
    private int    year;

    /** famous quote */
    private String quote;

    /**
     * constructor with arguments
     * 
     * @param aName
     *            - name of movie
     * @param aYear
     *            - year shown
     * @param aQuote
     *            - famous quote from movie
     */
    public Movie(String aName, int aYear, String aQuote)
    {
        this.name = aName;
        this.year = aYear;
        this.quote = aQuote;
    }


    /**
     * get the name
     * 
     * @return returns stored name
     */
    public String getName()
    {
        return name;
    }


    /**
     * get the year
     * 
     * @return stored year
     */
    public int getYear()
    {
        return year;
    }


    /**
     * get the quote
     * 
     * @return the quote
     */
    public String getQuote()
    {
        return quote;
    }


    /**
     * equals method
     * 
     * @param other
     *            - object to compare against
     * @return true if equals, false otherwise
     */
    @Override
    public boolean equals(Object other)
    {
        if (other instanceof Movie)
        {
            // cast other to a Movie
            Movie otherMovie = (Movie)other;

            // get other's fields
            String otherName = otherMovie.getName();
            int otherYear = otherMovie.getYear();

            // test equality of fields
            if (name.equals(otherName) && year == otherYear)
            {
                return true;
            }

        }

        // not a movie OR a not equal movie
        return false;
    }

    // @todo - toString should print "\"quote\" name (year)"


    public String toString()
    {
        return "\"" + name;
    }

}
