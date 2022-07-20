package kata.java11.stringmethods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatKataTest {
    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("Uff", 3, "UffUffUff"),
                Arguments.of("Hey", 2, "HeyHey"),
                Arguments.of("A", 5, "AAAAA"));

    }

    @ParameterizedTest
    @MethodSource("arguments")
    void getSetOfStringsTest(String givenString, Integer givenRepeatCount, String expectedString) {
        String string = RepeatKata.repeatingAString(givenString, givenRepeatCount);

        assertEquals(expectedString, string);
    }
}