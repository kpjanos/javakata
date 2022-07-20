package setof;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetOfTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("String One", "String Two", "String Three",
                        Set.of("String One", "String Two", "String Three")),

                Arguments.of("One", "Two", "Three",
                        Set.of("One", "Two", "Three"))
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void getSetOfStringsTest(String s1, String s2, String s3, Set<String> expectedSetOfStrings) {
        Set<String> stringSet = SetOf.getSetOfStrings(s1, s2, s3);

        assertEquals(expectedSetOfStrings, stringSet);
    }
}