package youtube.task2_twosum;

import org.junit.jupiter.api.Test;
import youtube.task1_fizzbuzz.FizzBuzz;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void test_twoSum() {
        int[] arr = new int[] {2,7,11,15};
        int target = 13;

        var result = TwoSum.twoSum(arr, target);

        assertArrayEquals(new int[]{2, 0}, result);
    }
}
