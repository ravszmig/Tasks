package TIER2.task12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopKFrequentElementsTest {

    @Test
    public void topKFrequent() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] expectedResult = {1, 2};
        int[] actualResult = TopKFrequentElements.topKFrequent(nums, k);

        assertArrayEquals(expectedResult, actualResult);
    }
}
