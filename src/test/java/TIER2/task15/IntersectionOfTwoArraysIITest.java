package TIER2.task15;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntersectionOfTwoArraysIITest {

    @Test
    public void testIntersectionOfTwoArraysII() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] expectedResult = {2,2};

        var result = IntersectionOfTwoArraysII.intersect(nums1, nums2);

        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testIntersectionOfTwoArraysII2() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] expectedResult = {4,9};

        var result = IntersectionOfTwoArraysII.intersect(nums1, nums2);

        Arrays.sort(result);
        Arrays.sort(expectedResult);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testIntersectionOfTwoArraysII3() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4,4,1,5,9};
        int[] expectedResult = {4,5,9};

        var result = IntersectionOfTwoArraysII.intersect(nums1, nums2);

        Arrays.sort(result);
        Arrays.sort(expectedResult);
        assertArrayEquals(expectedResult, result);
    }
}
