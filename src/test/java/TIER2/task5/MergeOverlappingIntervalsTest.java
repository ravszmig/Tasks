package TIER2.task5;

import org.junit.jupiter.api.Test;

public class MergeOverlappingIntervalsTest {

    @Test
    void test_MergeOverlappingIntervals() {
        int[][] arr = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] expectedResult = {{1,6}, {8,10}, {15,18}};

        int[][] result = MergeOverlappingIntervals.merge(arr);

        assert java.util.Arrays.deepEquals(result, expectedResult) : "Test failed";
    }
}
