package task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseText_useCases() {
        assertEquals("abc2132", ReverseString.reverse("2312cba", false));
        assertEquals("ba", ReverseString.reverse("ab", false));
        assertEquals("c a1", ReverseString.reverse("1a c", false));
    }

    @Test
    void reverseText_exceptionCase() {
        assertThrows(RuntimeException.class, () -> ReverseString.reverse(null, false));
    }

    @Test
    void reverseText_onlyOddNumbers() {
        assertEquals("gbedcfa", ReverseString.reverse("abcdefg", true));
    }
}
