package TIER2.task13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainsDuplicateIITest {

    @Test
    public void testContainsNearbyDuplicate() {
       int[] nums = {1,2,3,1};
       int k = 3;

       var expectedResult = true;
       var actualResult = ContainsDuplicateII.containsNearbyDuplicate(nums, k);

       assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testContainsNearbyDuplicate2() {
        int[] nums = {1,0,1,1};
        int k = 1;

        var expectedResult = true;
        var actualResult = ContainsDuplicateII.containsNearbyDuplicate(nums, k);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testContainsNearbyDuplicate3() {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;

        var expectedResult = false;
        var actualResult = ContainsDuplicateII.containsNearbyDuplicate(nums, k);

        assertEquals(expectedResult, actualResult);
    }
}
