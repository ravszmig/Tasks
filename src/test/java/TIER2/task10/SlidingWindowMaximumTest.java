package TIER2.task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SlidingWindowMaximumTest {

    @Test
    void maxSlidingWindow() {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] expectedResult = {3,3,5,5,6,7};

        int[] result = SlidingWindowMaximum.maxSlidingWindow(nums, k);
        assertArrayEquals(expectedResult, result);
    }
}
