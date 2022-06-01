import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SuperHeroTest {

    @Test
    public void testRegular() {
        Person person = new Person();
        assertNotNull(person);
        assertEquals("Person", person.getName());
        Person joe = new Person("Joe");
        assertNotNull(joe);
        assertEquals("Joe", joe.getName());
        assertTrue(person instanceof Mammal);

        Dog dog = new Dog();
        assertNotNull(dog);
        assertEquals("Dog", dog.getName());
        Person delci = new Person("Delci");
        assertNotNull(delci);
        assertEquals("Delci", delci.getName());
        assertTrue(delci instanceof Mammal);

    }

    @Test
    public void testSuperMan() {
        SuperPerson person = new SuperPerson();
        assertNotNull(person);
        assertEquals("Person", person.getName());

        SuperPerson clark = new SuperPerson("Clark Kent", true);
        assertNotNull(clark);
        assertEquals("Clark Kent", clark.getName());
        assertTrue(clark instanceof Mammal);
        assertTrue(clark instanceof SuperHero);
        assertTrue(clark.flies());

    }

    @Test
    public void testBatMan() {

        SuperPerson bruce = new SuperPerson("Bruce Wayne", false);
        assertNotNull(bruce);
        assertEquals("Bruce Wayne", bruce.getName());
        assertTrue(bruce instanceof Mammal);
        assertTrue(bruce instanceof SuperHero);
        assertFalse(bruce.flies());

    }

    @Test
    public void testUnderDog() {
        SuperDog ud = new SuperDog("UnderDog", true);
        assertNotNull(ud);
        assertEquals("UnderDog", ud.getName());

        assertTrue(ud instanceof Mammal);
        assertTrue(ud instanceof SuperHero);
        assertTrue(ud.flies());

    }

}
