package filemethods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FileMethodsKataTest {

    private static Stream<Arguments> arguments() {
        return Stream.of(
                Arguments.of(Path.of("src/main/resources/"), "Test text"),
                Arguments.of(Path.of("src/main/resources/"), "Another Text. :) "));
    }

    @ParameterizedTest
    @MethodSource("arguments")
    void writeToFileAndReadFromFileTest(Path path, String givenText) throws IOException {

        Path writeResult = FileMethodsKata.writeStringToFile(givenText, path);
        String result = FileMethodsKata.readFromFile(writeResult);

        assertEquals(givenText, result);
    }
}