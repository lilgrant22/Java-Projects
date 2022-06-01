/**
 * Test class for IMAXMovie demonstrates issues with proper equals
 * implementation
 * 
 * @author PCSE CS250 instructors of yesteryear
 * @version 1
 */
public class IMAXMovie
    extends Movie
{

    /**
     * constructor
     * 
     * @param aName
     *            name of the movie
     * @param aYear
     *            release year
     * @param aQuote
     *            a memorable quote
     */
    public IMAXMovie(String aName, int aYear, String aQuote)
    {
        super(aName, aYear, aQuote);
    }


    /**
     * Tests if this instance is equal to another IMAX Movie object with same
     * name and release data (IMAX movies are not equal to regular movies)
     * 
     * @return true iff objects are equivalent by method
     */
    @Override
    public boolean equals(Object other)
    {
        if (other instanceof IMAXMovie)
        {
            return super.equals(other);
        }

        return false;
    }


    /**
     * toString
     * 
     * @return string with our data
     */
    @Override
    public String toString()
    {
        return "IMAX" + super.toString();
    }

}
