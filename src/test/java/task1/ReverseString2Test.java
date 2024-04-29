package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReverseString2Test {

    @Test
    void reverseText_useCases() {
        assertEquals("abc2132", ReverseString2.reverse("2312cba", false));
        assertEquals("ba", ReverseString2.reverse("ab", false));
        assertEquals("c a1", ReverseString2.reverse("1a c", false));
    }

    @Test
    void reverseText_ExceptionCase() {
        assertThrows(RuntimeException.class, () -> ReverseString2.reverse(null, false));
    }

    @Test
    void reverseText_OnlyOddNumbers() {
        assertEquals("gbedcfa", ReverseString2.reverse("abcdefg", true));
    }
}
