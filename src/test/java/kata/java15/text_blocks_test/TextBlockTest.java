package kata.java15.text_blocks_test;

import kata.java15.text_blocks.TextBlock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextBlockTest {

    @Test
    void testTextBlock() {
        String expected = "TextBlock\n"
                + "\n"
                + "This is the new Java 15 features,\n"
                + "where you can use the new Text block features\n"
                + "to improve your code readability!\n"
                + "Use wisely!\n";

        assertEquals(TextBlock.getTextBlockMessage(), expected);
    }
}
