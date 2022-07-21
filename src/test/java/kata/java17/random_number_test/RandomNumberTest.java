package kata.java17.random_number_test;

import kata.java17.random_number.RandomNumber;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RandomNumberTest {

    public static final String ALGORITHM = "Random";

    private final RandomNumber randomNumberGenerator = new RandomNumber();

    @Test
    void listHas10item() {
        List<Integer> actual = randomNumberGenerator.getRandomIntNumbers(ALGORITHM, 10, 0,100);

        assertThat(actual, hasSize(10));
    }

    @Test
    void listHasRandomItems() {
        List<Integer> actualOne = randomNumberGenerator.getRandomIntNumbers(ALGORITHM, 10, 0,100);
        List<Integer> actualTwo = randomNumberGenerator.getRandomIntNumbers(ALGORITHM, 10, 0,100);

        assertThat(actualOne, not(IsEmptyCollection.empty()));
        assertThat(actualTwo, not(IsEmptyCollection.empty()));
        assertThat(actualOne, not(actualTwo));
    }

    @Test
    void listItemsBetweenOneAndOneHundred() {
        List<Integer> actual = randomNumberGenerator.getRandomIntNumbers(ALGORITHM, 10, 0,100);

        assertThat(actual, not(IsEmptyCollection.empty()));
        assertThat(actual, everyItem(greaterThanOrEqualTo(0)));
        assertThat(actual, everyItem(lessThan(100)));
    }

}
