package youtube.task4_reverseint;

import org.junit.jupiter.api.Test;
import youtube.task4_reverseInt.ReverseInt;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntTest {

    @Test
    void test_reverseInt() {
        assertEquals(12345, ReverseInt.reverseInt(54321));
    }

}
