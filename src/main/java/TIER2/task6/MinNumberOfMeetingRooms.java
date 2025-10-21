package TIER2.task6;

import java.util.Arrays;

public class MinNumberOfMeetingRooms {

    public static int minMeetingRooms(int[][] intervals) {
        if(intervals == null || intervals.length == 0) { return 0; }

        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        for(int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        Arrays.sort(starts);
        Arrays.sort(ends);

        int result = 0;
        int endPointer = 0;

        for (int start : starts) {
            if (start < ends[endPointer]) {
                result++;
            } else {
                endPointer++;
            }
        }

        return result;
    }
}
