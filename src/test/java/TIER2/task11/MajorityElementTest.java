package TIER2.task11;

import org.junit.jupiter.api.Test;

public class MajorityElementTest {

    @Test
    public void majorityElement() {
        int[] arr = {3,2,3};
        int expectedResult = 3;
        int actualResult = MajorityElement.majorityElement(arr);
        assert expectedResult == actualResult;

        int[] arr2 = {2,2,1,1,1,2,2};
        int expectedResult2 = 2;
        int actualResult2 = MajorityElement.majorityElement(arr2);
        assert expectedResult2 == actualResult2;
    }
}
