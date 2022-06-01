
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class AlbumTest {

    @Test
    public void testSort() {
        ArrayList<Album> list = new ArrayList<Album>();
        list.add(new Album("Led Zepplin", "IV"));
        list.add(new Album("Led Zepplin", "Physical Graffiti"));
        list.add(new Album("Coldplay", "X&Y"));
        list.add(new Album("Coldplay", "Viva la Vida"));
        list.add(new Album("Twenty One Pilots", "Regional at Best"));
        list.add(new Album("Twenty One Pilots", "Blurryface"));

        ArrayList<Album> test = new ArrayList<Album>();
        for (Album al : list)
            test.add(al); // this makes a deep copy

        // Objects in list MUST IMPLEMENT Comparable
        Collections.sort(list);

        assertEquals(test.get(3), list.get(0)); // "Coldplay", "Viva la Vida"
        assertEquals(test.get(2), list.get(1)); // "Coldplay", "X&Y"
        assertEquals(test.get(0), list.get(2)); // Led Zepplin IV
        assertEquals(test.get(1), list.get(3)); // Led Zepplin IV
        assertEquals(test.get(5), list.get(4)); // Twenty One Pilots",
                                                // "Blurryface"
        assertEquals(test.get(4), list.get(5)); // Twenty One Pilots", "Regional
                                                // at Best"
    }
}
