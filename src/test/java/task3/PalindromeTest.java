package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @Test
    void palindrome_true() {
        assertTrue(Palindrome.isPalindrome("kajak"));
    }


    @Test
    void palindrome_false() {
        assertFalse(Palindrome.isPalindrome("kokodżambo"));
    }
}
