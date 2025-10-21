package TIER2.Task20;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAllAnagramsInTransactionStreamTest {

    @Test
    public void testFindAnagrams() {
        String s = "cbaebabacd";
        String p = "abc";

        var result = FindAllAnagramsInTransactionStream.findAnagrams(s, p);

        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(0);
        expectedResult.add(6);

        assertEquals(expectedResult, result);
    }
}
