package kata.java9.interfaceprivatemethod;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(12, 9,
                        new int[]{1, 2, 3, 4, 5, 6}),

                Arguments.of(210, 0,
                        new int[]{10, 20, 30, 40, 50, 60}));
    }

    private final Calculator calc = new Calculator();

    @ParameterizedTest
    @MethodSource("arguments")
    void calculatorTest(int expectedEvensResult, int expectedOddsResult, int... nums) {
        Integer oddResult = calc.addOddNumbers(nums);
        Integer evenResult = calc.addEvenNumbers(nums);

        assertEquals(expectedOddsResult, oddResult);
        assertEquals(expectedEvensResult, evenResult);
    }

}