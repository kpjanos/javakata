package unmodifiable;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToUnmodifiableTest {
    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5, 6),
                        List.of(1, 3, 5)),

                Arguments.of(List.of(500, 600, 700, 800, 1000),
                        Collections.emptyList()),

                Arguments.of(List.of(7, 11, 13, 15),
                        List.of(7, 11, 13, 15)));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void filterOddsToAnUnmodifiableListTest(List<Integer> givenIntegerList, List<Integer> expectedIntegerList) {
        List<Integer> integerList = ToUnmodifiable.filterOddsToAnUnmodifiableList(givenIntegerList);

        assertEquals(expectedIntegerList, integerList);
    }
}