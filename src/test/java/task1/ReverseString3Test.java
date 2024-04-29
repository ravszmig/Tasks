package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReverseString3Test {

    @Test
    void reverseText_usecases() {
        assertEquals("abc", ReverseString3.reverseString3("cba"));
    }

    @Test
    void reverseText_exceptionCase() {
        assertThrows(RuntimeException.class, () -> ReverseString3.reverseString3(null));
    }

}