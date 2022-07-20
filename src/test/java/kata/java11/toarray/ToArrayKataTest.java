package toarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import stringmethods.IsBlankKata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ToArrayKataTest {
    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(List.of("String One", "String Two", "String Three"),
                        new String[]{"String One", "String Two", "String Three"}),
                Arguments.of(List.of("", "", "Three"),
                        new String[]{"", "", "Three"}));

    }

    @ParameterizedTest
    @MethodSource("arguments")
    void removeEmptyStringsFormAListTest(List<String> givenStringList, String[] expectedStringArray) {
        String[] stringArray =ToArrayKata.convertStringListToStringArray(givenStringList);

        assertArrayEquals(expectedStringArray, stringArray);

    }
}