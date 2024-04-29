package task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Palindrome2Test {

    @Test
    void palindrome_true() {
        assertTrue(Palindrome2.isPalindrome("kajak"));
    }


    @Test
    void palindrome_false() {
        assertFalse(Palindrome2.isPalindrome("kokodżambo"));
    }
}
