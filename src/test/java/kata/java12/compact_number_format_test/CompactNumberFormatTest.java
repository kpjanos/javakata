package kata.java12.compact_number_format_test;

import kata.java12.compact_number_format.CompactNumberFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompactNumberFormatTest {

    public static final int NUMBER = 3563;

    @Test
    void getShortFormatWhenGiveValidNumber() {
        assertEquals("3.56K", CompactNumberFormat.getShortFormatAsString(NUMBER));
    }

    @Test
    void getLongFormatWhenGiveValidNumber() {
        assertEquals("3.56 thousand", CompactNumberFormat.getLongFormatAsString(NUMBER));
    }
}
