package TIER2.task6;

import org.junit.jupiter.api.Test;

public class MinNumberOfMeetingRoomsTest {

    @Test
    void test_MinNumberOfMeetingRooms() {
        int[][] arr = {{0, 30}, {5, 10}, {15, 20}};
        int expectedResult = 2;
        int actualResult = MinNumberOfMeetingRooms.minMeetingRooms(arr);
        assert expectedResult == actualResult;
    }
}
