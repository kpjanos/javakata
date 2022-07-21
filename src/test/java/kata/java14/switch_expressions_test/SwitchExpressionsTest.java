package kata.java14.switch_expressions_test;

import kata.java14.switch_expressions.Day;
import kata.java14.switch_expressions.SwitchExpressions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SwitchExpressionsTest {

    @Test
    void getTrueWhenGiveAHoliday() {
        assertTrue(SwitchExpressions.isTodayHoliday(Day.SUNDAY));
    }

    @Test
    void getFalseWhenGiveANonHoliday() {
        assertFalse(SwitchExpressions.isTodayHoliday(Day.MONDAY));
    }
}
