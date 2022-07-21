package kata.java16.stream_to_list_test;

import kata.java16.stream_to_list.StreamToList;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamToListTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(Arrays.asList("1", "2", "3"), Arrays.asList(1, 2, 3)),
                Arguments.of(Arrays.asList("33", "56", "22"), Arrays.asList(33, 56, 22)),
                Arguments.of(Arrays.asList("664", "445", "334"), Arrays.asList(664, 445, 334)),
                Arguments.of(Arrays.asList("334", "535", "331"), Arrays.asList(334, 535, 331))
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void getValidDayPeriodWhen2PM(List<String> input, List<Integer> expected) {
        List<Integer> integerList = StreamToList.parseInt(input);
        assertEquals(integerList, expected);
    }
}
