package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUniqueChars2Test {

    @Test
    void uniqueChars_true() {
        assertTrue(StringUniqueChars2.hasUniqueChars("1234567890"));
        assertTrue(StringUniqueChars2.hasUniqueChars("abcdefg"));
    }

    @Test
    void uniqueChars_false() {
        assertFalse(StringUniqueChars2.hasUniqueChars("aa"));
        assertFalse(StringUniqueChars2.hasUniqueChars("Lorem ipsum dolor"));
    }

    @Test
    void uniqueChars_tooManyChars() {
        assertFalse(StringUniqueChars2.hasUniqueChars("abcdefghijklmnopqrstuwvxyz1234567890ABCDEFGHIJKLMNOPQRSTUWVXYZabcdefghijklmnopqrstuwvxyz1234567890ABCDEFGHIJKLMNOPQRSTUWVXYZabcdefghijklmnopqrstuwvxyz1234567890ABCDEFGHIJKLMNOPQRSTUWVXYZabcdefghijklmnopqrstuwvxyz1234567890ABCDEFGHIJKLMNOPQRSTUWVXYZ"));
    }

    @Test
    void uniqueChars_null() {
        assertThrows(RuntimeException.class, () -> StringUniqueChars2.hasUniqueChars(null));
    }

    @Test
    void uniqueChars_emptyString() {
        assertTrue(StringUniqueChars2.hasUniqueChars(""));
    }
}
