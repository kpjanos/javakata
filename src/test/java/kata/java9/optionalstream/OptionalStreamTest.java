package kata.java9.optionalstream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OptionalStreamTest {

    private static final List<Optional<String>> optionalStringList = Arrays.asList(
            Optional.empty(),
            Optional.of("A boring string"),
            Optional.empty(),
            Optional.of("An interesting string"));


    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                                Optional.empty(),
                                Optional.of("A boring string"),
                                Optional.empty(),
                                Optional.of("An interesting string")),

                        Arrays.asList("A boring string", "An interesting string")),

                Arguments.of(Arrays.asList(
                                Optional.empty(),
                                Optional.empty(),
                                Optional.empty(),
                                Optional.of("A String")),

                        Arrays.asList("A String")),

                Arguments.of(Arrays.asList(
                                Optional.empty(),
                                Optional.empty(),
                                Optional.empty()),

                        Collections.emptyList()));

    }

    @ParameterizedTest
    @MethodSource("arguments")
    void getStringListTest(List<Optional<String>> givenOptionalStringList, List<String> expectedStringList) {
        List<String> stringList = OptionalStream.getStringList(givenOptionalStringList);

        assertEquals(expectedStringList, stringList);
    }
}