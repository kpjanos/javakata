package copyof;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CopyOfTest {
    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(List.of("String One", "String Two", "String Three"),
                        List.of("String One", "String Two", "String Three")),

                Arguments.of(List.of("One", "Two", "Three"),
                        List.of("One", "Two", "Three"))
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void copyAListOfStringsTest(List<String> givenStringList, List<String> expectedStringList) {
        List<String> stringList = CopyOf.copyAListOfStrings(givenStringList);

        assertEquals(expectedStringList, stringList);
    }
}