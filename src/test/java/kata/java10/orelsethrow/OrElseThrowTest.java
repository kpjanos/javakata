package kata.java10.orelsethrow;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrElseThrowTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5, 6),
                        2),

                Arguments.of(List.of(500, 600, 700, 800, 1000),
                        500));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void findTheFirstEvenTest(List<Integer> givenIntegerList, Integer expectedInteger) {
        Integer firstEven = OrElseThrow.findTheFirstEven(givenIntegerList);

        assertEquals(expectedInteger, firstEven);
    }

    @Test
    void findTheFirstEvenTest(){
        NoSuchElementException thrown = assertThrows(NoSuchElementException.class, () -> {
           Integer integer =  OrElseThrow.findTheFirstEven(List.of(1,5,9));
        }, "NoSuchElementException was expected");

    }

}