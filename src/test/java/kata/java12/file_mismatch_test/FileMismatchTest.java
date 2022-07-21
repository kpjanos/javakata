package kata.java12.file_mismatch_test;

import kata.java12.file_mismatch.FileMismatch;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileMismatchTest {

    @Test
    void getValidMismatchNumberWhenHasMismatch() throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "This is just an example text file!");
        Files.writeString(filePath2, "Thi is just an example text file!");

        assertEquals(3, FileMismatch.getFileMismatch(filePath1, filePath2));
    }

    @Test
    void getMinusOneMismatchNumberWhenHasNotMismatch() throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "This is just an example text file!");
        Files.writeString(filePath2, "This is just an example text file!");

        assertEquals(-1, FileMismatch.getFileMismatch(filePath1, filePath2));
    }
}
