/**
 * Movie class
 * 
 * @author Andrew Little
 * @version 02/25/2020
 */
// movies with title, year, and quote
public class Movie
    implements Comparable<Movie>
{

    /** name of movie */
    private String name;

    /** release year */
    private int    year;

    /** memorable quote */
    private String quote;

    /**
     * constructor These comments are silly given names, but WebCat is picky
     * 
     * @param aName
     *            - name
     * @param aYear
     *            - year of release
     * @param aQuote
     *            - memorable quote
     */
    public Movie(String aName, int aYear, String aQuote)
    {
        this.name = aName;
        this.year = aYear;
        this.quote = aQuote;
    }


    /**
     * @return name of this movie
     */
    public String getName()
    {
        return name;
    }


    /**
     * @return year of release
     */
    public int getYear()
    {
        return year;
    }


    /**
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
     *            - object to compare
     * @return true if equivalent (name and release year)
     */
    @Override
    public boolean equals(Object other)
    {

        // check that is movie, and also of the same class (e.g. not IMAX movie)
        if (other instanceof Movie && other.getClass() == this.getClass())
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

    /**
     * compare to method
     * 
     * @param other
     *              other year
     * 
     * @return name comparison
     *                          integer
     */
    public int compareTo(Movie other)
    {
        if (year != other.year)
        {
            return year - other.year;
        }
        return this.name.compareTo(other.name);
    }

}
