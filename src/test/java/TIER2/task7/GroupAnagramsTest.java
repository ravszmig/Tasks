package TIER2.task7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GroupAnagramsTest {

    @Test
    void test_GroupAnagrams() {
        var input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        var expectedResult = new String[][] {{"ate", "eat","tea"}, {"nat","tan"}, {"bat"}};

        var result = GroupAnagrams.groupAnagrams(input);

        System.out.println(Arrays.deepToString(result));
        assert java.util.Arrays.deepEquals(result, expectedResult) : "Test failed";
    }
}
