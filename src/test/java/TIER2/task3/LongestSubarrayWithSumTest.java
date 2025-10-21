package TIER2.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayWithSumTest {

    @Test
    public void test_LongestSubarrayWithSum() {
        int[] nums = {2, -1, 2, 3, -4, 2, 1};
        int k = 3;

        int result = LongestSubarrayWithSum.longestSubarrayWithSum(nums, k);
        assertEquals(5, result);
    }
}
