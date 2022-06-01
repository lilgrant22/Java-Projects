/**
 * Album class
 * 
 * @author Andrew Little
 * @version 02/25/2020
 */
public class Album
    implements Comparable<Album>
{

    /** band name */
    private String band;

    /** album title */
    private String title;

    /**
     * constructor with band name and album title
     * 
     * @param band
     *            - band (or artist) name
     * @param title
     *            - title of album
     */
    public Album(String band, String title)
    {
        super();
        this.band = band;
        this.title = title;
    }


    /**
     * return the band name
     * 
     * @return name of band
     */
    public String getBand()
    {
        return band;
    }


    /**
     * return the title of the album
     * 
     * @return album title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * compare to method
     * 
     * @param other
     *                      other band name
     * @return band
     *                      integer
     */
    public int compareTo(Album other)
    {
        if (band.equals(other.band))
        {
            return title.compareTo(other.title);
        }
        return band.compareTo(other.band);
    }

}
