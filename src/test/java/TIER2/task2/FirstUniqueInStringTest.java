package TIER2.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueInStringTest {

    @Test
    void test_FirstUniqueInString() {
        var response = FirstUniqueInString.firstUnique("aabbcddee");
        assertEquals('c', response);
    }

    @Test
    void test_FirstUniqueInString2() {
        var response = FirstUniqueInString.firstUnique("aabbccddee");
        assertEquals('_', response);
    }
}
