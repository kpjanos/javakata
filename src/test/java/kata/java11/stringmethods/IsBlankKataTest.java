package stringmethods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IsBlankKataTest {
    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(List.of("", "String One", "String Two", "", "String Three"),
                        List.of("String One", "String Two", "String Three")),
                Arguments.of(List.of("", "String"),
                        List.of("String")),
                Arguments.of(List.of("", "", ""),
                        Collections.emptyList()));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void removeEmptyStringsFormAListTest(List<String> givenStringList, List<String> expectedStringList) {
        List<String> stringList = IsBlankKata.removeEmptyStringsFormAList(givenStringList);

        assertEquals(expectedStringList, stringList);
    }
}