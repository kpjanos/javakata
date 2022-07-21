package kata.java15.string_methods_test;

import kata.java15.string_methods.StringFeatures15;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFeatures15Test {

    @Test
    void testFormattedString() {
        assertEquals("This message send by John!", StringFeatures15.getFormattedString("John"));
    }

    @Test
    void testWhiteSpace() {
        assertEquals("John", StringFeatures15.getStringWithoutWhiteSpaces("  John    "));
    }
}
