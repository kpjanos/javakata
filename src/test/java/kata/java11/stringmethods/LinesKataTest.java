package kata.java11.stringmethods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinesKataTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("Hey \n  this \n will \nbe \nnew\n line", 6L),
                Arguments.of("Hello\n World      ", 2L),
                Arguments.of("Hello", 1L));

    }

    @ParameterizedTest
    @MethodSource("arguments")
    void returnStringWithoutWhitespaceInLeadTest(String givenString, Long expectedCount) {
        Long countOfLines = LinesKata.countLinesInAString(givenString);

        assertEquals(expectedCount, countOfLines);
    }
}