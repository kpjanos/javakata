package kata.java12.string_methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFeatures12Test {

    @Test
    void testIndent() {
        assertEquals("  John\n", StringFeatures12.getIndentedString("John", 2));
    }

    @Test
    void testRevert() {
        assertEquals("nhoJ", StringFeatures12.getRevertedString("John"));
    }
}
