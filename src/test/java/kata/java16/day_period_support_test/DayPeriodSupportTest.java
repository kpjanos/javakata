package kata.java16.day_period_support_test;

import kata.java16.day_period_support.DayPeriodSupport;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayPeriodSupportTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of("14:25:08.690791", "2 in the afternoon"),
                Arguments.of("06:22:08.694561", "6 in the morning"),
                Arguments.of("18:12:08.223561", "6 in the evening"),
                Arguments.of("22:14:04.223564", "10 at night")
        );
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void getValidDayPeriods(String input, String expected) {
        String dayPeriod = DayPeriodSupport.dayPeriod(input);
        assertEquals(dayPeriod, expected);
    }
}
