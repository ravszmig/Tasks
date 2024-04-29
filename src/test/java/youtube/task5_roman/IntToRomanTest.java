package youtube.task5_roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntToRomanTest {

    @Test
    void test_intToRoman_valid() {
        assertEquals(1, IntToRoman.intToRoman("I"));
        assertEquals(5, IntToRoman.intToRoman("V"));
        assertEquals(10, IntToRoman.intToRoman("X"));
        assertEquals(50, IntToRoman.intToRoman("L"));
        assertEquals(100, IntToRoman.intToRoman("C"));
        assertEquals(500, IntToRoman.intToRoman("D"));
        assertEquals(1000, IntToRoman.intToRoman("M"));
        assertEquals(6, IntToRoman.intToRoman("VI"));
        assertEquals(16, IntToRoman.intToRoman("XVI"));
        assertEquals(17, IntToRoman.intToRoman("XVII"));
        assertEquals(49, IntToRoman.intToRoman("XLIX"));
        assertEquals(99, IntToRoman.intToRoman("XCIX"));
        assertEquals(399, IntToRoman.intToRoman("CCCXCIX"));
        assertEquals(666, IntToRoman.intToRoman("DCLXVI"));
        assertEquals(999, IntToRoman.intToRoman("CMXCIX"));
        assertEquals(1994, IntToRoman.intToRoman("MCMXCIV"));
        assertEquals(2022, IntToRoman.intToRoman("MMXXII"));
        assertEquals(3999, IntToRoman.intToRoman("MMMCMXCIX")); // Max Roman numeral value
    }

    @Test
    void test_intToRoman_invalid() {
        // Test cases for valid Roman numerals
        assertEquals(1, IntToRoman.intToRoman("I"));
        assertEquals(5, IntToRoman.intToRoman("V"));
        assertEquals(10, IntToRoman.intToRoman("X"));
        assertEquals(50, IntToRoman.intToRoman("L"));
        assertEquals(100, IntToRoman.intToRoman("C"));
        assertEquals(6, IntToRoman.intToRoman("VI"));
        assertEquals(16, IntToRoman.intToRoman("XVI"));
        assertEquals(17, IntToRoman.intToRoman("XVII"));
        assertEquals(49, IntToRoman.intToRoman("XLIX"));
        assertEquals(99, IntToRoman.intToRoman("XCIX"));
        assertEquals(3999, IntToRoman.intToRoman("MMMCMXCIX")); // Max Roman numeral value

        // Test cases for invalid Roman numerals
        // Edge case: Empty string
        assertThrows(IllegalArgumentException.class, () -> IntToRoman.intToRoman(""));
        // Edge case: Null string
        assertThrows(IllegalArgumentException.class, () -> IntToRoman.intToRoman(null));
        // Invalid characters
        assertThrows(IllegalArgumentException.class, () -> IntToRoman.intToRoman("A"));
        // Out of range: Roman numeral greater than 3999
        assertThrows(IllegalArgumentException.class, () -> IntToRoman.intToRoman("MMMM"));
    }

}
