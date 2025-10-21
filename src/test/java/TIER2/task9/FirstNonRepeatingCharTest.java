package TIER2.task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstNonRepeatingCharTest {

    @Test
    void test_FirstNonRepeatingChar() {
        String str = "leetcode";
        int expectedResult = 0;
        int actualResult = FirstNonRepeatingChar.firstNonRepeatingChar(str);
        assertEquals(expectedResult, actualResult);

        String str2 = "loveleetcode";
        int expectedResult2 = 2;
        int actualResult2 = FirstNonRepeatingChar.firstNonRepeatingChar(str2);
        assertEquals(expectedResult2, actualResult2);

        String str3 = "aabb";
        int expectedResult3 = -1;
        int actualResult3 = FirstNonRepeatingChar.firstNonRepeatingChar(str3);
        assertEquals(expectedResult3, actualResult3);
    }
}
