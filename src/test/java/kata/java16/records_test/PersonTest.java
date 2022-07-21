package kata.java16.records_test;

import kata.java16.records.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    private final Person bob = new Person("Bob", 21);

    @Test
    void recordTest() {
        assertEquals(bob.getName(), "Bob");
        assertEquals(bob.getAge(), 21);
    }
}
