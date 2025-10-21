package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUniqueCharsTest {

    @Test
    void uniqueChars_true() {
        assertTrue(StringUniqueChars.hasUniqueChars("1234567890"));
        assertTrue(StringUniqueChars.hasUniqueChars("abcdefg"));
    }

    @Test
    void uniqueChars_false() {
        assertFalse(StringUniqueChars.hasUniqueChars("aa"));
        assertFalse(StringUniqueChars.hasUniqueChars("Lorem ipsum dolor"));
    }

    @Test
    void uniqueChars_tooManyChars() {
        assertFalse(StringUniqueChars.hasUniqueChars("abcdefghijklmnopqrstuwvxyz1234567890ABCDEFGHIJKLMNOPQRSTUWVXYZabcdefghijklmnopqrstuwvxyz1234567890ABCDEFGHIJKLMNOPQRSTUWVXYZabcdefghijklmnopqrstuwvxyz1234567890ABCDEFGHIJKLMNOPQRSTUWVXYZabcdefghijklmnopqrstuwvxyz1234567890ABCDEFGHIJKLMNOPQRSTUWVXYZ"));
    }

    @Test
    void uniqueChars_null() {
        assertThrows(RuntimeException.class, () -> StringUniqueChars.hasUniqueChars(null));
    }

    @Test
    void uniqueChars_emptyString() {
        assertTrue(StringUniqueChars.hasUniqueChars(""));
    }
}
