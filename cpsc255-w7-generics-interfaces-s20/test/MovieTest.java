
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MovieTest {
	@Test
	public void testNewMovie() {
		Movie  movie = new Movie( "Star Wars", 1979, "But I was going into Tosche Station to pick up some power converters!" );
		String name  = movie.getName(); 
		int    year  = movie.getYear();

		assertEquals( "Incorrect result", "Star Wars", name );
		assertEquals( "Incorrect result", 1979,        year );
	}

	@Test
	public void testMovieEquals() {
		Object obj1, obj2;
		// same movie
		obj1 = new Movie( new String("Wizard of Oz"), 1939, new String("We're not in Kansas anymore.") );
		obj2 = new Movie( new String("Wizard of Oz"), 1939, new String("We're not in Kansas anymore.")  );
		assertEquals( "Incorrect result", obj1, obj2 );
		// movie of different name
		obj1 = new Movie( "Casino Royale",     2006, new String("The name's Bond... James Bond.") );
		obj2 = new Movie( "The Devil Wears Prada", 2006 , new String("Don't make me feed you to one of the models.") );
		assertFalse( "Incorrect result", obj1.equals( obj2 ));
		// movie of different year
		obj1 = new Movie( new String("Star Wars"), 1977, new String("You can waste time with your friends when your chores are done.")  );
		obj2 = new Movie( new String("Star Wars"), 2008, new String("Great. Rolling death balls.") );
		assertFalse( "Incorrect result", obj1.equals( obj2 ));
		// another object
		obj1 = new Movie( "Poltergeist", 1982, "Follow the light" );
		obj2 = "abracadabra";
		assertFalse( "Incorrect result", obj1.equals( obj2 ));
		// nothing
		obj1 = new Movie( "2001: A Space Odyssey", 1968, "HAL, are you there?" );
		obj2 = null;
		assertFalse( "Incorrect result", obj1.equals( obj2 ));
	}

	@Test
	public void testMovieCompareTo() {
		Comparable<Movie> obj1;
		Movie             obj2;
		// same movie
		obj1 = new Movie( "Star Trek", 1986, "" );
		obj2 = new Movie( "Star Trek", 1986, "" );
		assertTrue( "Incorrect result", obj1.compareTo(obj2) == 0);
		// movie of same year & lower name
		obj1 = new Movie( "Megamind", 2010, "" );
		obj2 = new Movie( "The Tourist", 2010, "" );
		assertTrue( "Incorrect result", obj1.compareTo(obj2) < 0);
		// movie of same year & higher name
		obj1 = new Movie( "The King's Speech", 2010, "" );
		obj2 = new Movie( "Hereafter", 2010, "" );
		assertTrue( "Incorrect result", obj1.compareTo(obj2) > 0);
		// movie of lower year & same name
		obj1 = new Movie( "Star Wars", 1977, "" );
		obj2 = new Movie( "Star Wars", 2008, "" );
		assertTrue( "Incorrect result", obj1.compareTo(obj2) < 0);
		// movie of higher year & same name
		obj1 = new Movie( "The Ring", 2005, "" );
		obj2 = new Movie( "The Ring", 2001, "" );		
		assertTrue( "Incorrect result", obj1.compareTo(obj2) > 0);
	} 
}
