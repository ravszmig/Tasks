package TIER2.task14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumberTest {

    @Test
    public void happyNumberTest() {
        var number = 19;
        var actualResult = HappyNumber.isHappy(number);
        assertTrue(actualResult);
    }

    @Test
    public void happyNumberTestFail() {
        var number = 2;
        var actualResult = HappyNumber.isHappy(number);
        assertFalse(actualResult);
    }
}
