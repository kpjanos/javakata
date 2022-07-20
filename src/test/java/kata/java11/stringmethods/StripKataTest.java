package kata.java11.stringmethods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StripKataTest {
    private static Stream<Arguments> stripArguments() {
        return Stream.of(
                Arguments.of("   Hey   ", "Hey"),
                Arguments.of("Hello      ", "Hello"),
                Arguments.of("       ", ""));

    }

    private static Stream<Arguments> stripLeadArguments() {
        return Stream.of(
                Arguments.of("   Hey   ", "Hey   "),
                Arguments.of("   Hello", "Hello"),
                Arguments.of("       ", ""));

    }

    private static Stream<Arguments> stripTrailArguments() {
        return Stream.of(
                Arguments.of("   Hey   ", "   Hey"),
                Arguments.of("Hello      ", "Hello"),
                Arguments.of("       ", ""));

    }

    @ParameterizedTest
    @MethodSource("stripArguments")
    void returnStringWithoutWhitespaceTest(String givenString, String expectedString) {
        String string = StripKata.returnStringWithoutWhitespace(givenString);

        assertEquals(expectedString, string);
    }

    @ParameterizedTest
    @MethodSource("stripLeadArguments")
    void returnStringWithoutWhitespaceInLeadTest(String givenString, String expectedString) {
        String string = StripKata.returnStringWithoutWhitespaceInLead(givenString);

        assertEquals(expectedString, string);
    }

    @ParameterizedTest
    @MethodSource("stripTrailArguments")
    void returnStringWithoutWhitespaceInTrailTest(String givenString, String expectedString) {
        String string = StripKata.returnStringWithoutWhitespaceInTrail(givenString);

        assertEquals(expectedString, string);
    }
}