
/**
 * Person class
 * 
 * @author <student>
 * @version 0
 */

public class Person extends Mammal {

    /** Constructor */
    public Person() {
        setName("Person");
    }

    /**
     * Constuctor using name string
     * 
     * @param n
     *            - name of person
     */
    public Person(String n) {
        super(n);
    }
}
