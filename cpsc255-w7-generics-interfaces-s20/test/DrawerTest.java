
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DrawerTest {

    // Some stuff to put in drawers
    private class Sock {
    }

    private class Shirt {
    }

    @Test
    public void testDrawerOfSocks() {
        Drawer<Sock> drawer = new Drawer<Sock>();

        Sock fromDrawer = drawer.getItem();

        assertEquals(null, fromDrawer);
        assertFalse(drawer.hasStuff());

        Sock sock = new Sock();
        drawer.putItem(sock);

        assertTrue(drawer.hasStuff());

        fromDrawer = drawer.getItem();

        assertEquals(sock, fromDrawer);
        assertFalse(drawer.hasStuff());
    }

    @Test
    public void testDrawerOfShirts() {
        Drawer<Shirt> drawer = new Drawer<Shirt>();

        Shirt fromDrawer = drawer.getItem();

        assertEquals(null, fromDrawer);
        assertFalse(drawer.hasStuff());

        Shirt shirt = new Shirt();
        drawer.putItem(shirt);

        assertTrue(drawer.hasStuff());

        fromDrawer = drawer.getItem();

        assertEquals(shirt, fromDrawer);
        assertFalse(drawer.hasStuff());
    }
}
