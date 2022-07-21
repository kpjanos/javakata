package kata.java12.collector_teeing_test;

import kata.java12.collector_teeing.CollectorTeeing;
import kata.java12.collector_teeing.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectorTeeingTest {

    private final List<Student> studentList = Arrays.asList(
            new Student("Bob", "A123FG", 3.14),
            new Student("Carl", "H563RT", 4.44),
            new Student("Stacy", "Z443WW", 4.87),
            new Student("Gabe", "Q228OO", 2.88),
            new Student("Rob", "P998QA", 2.44)
    );

    @Test
    void getStacyAsBestAndRobAsWorst() {
        HashMap<String, Student> result = CollectorTeeing.getBestAndWorstStudent(studentList);
        assertEquals("Stacy", result.get("Best student").getName());
        assertEquals("Rob", result.get("Worst student").getName());
    }
}
