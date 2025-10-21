package TIER2.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(arr -> arr[0]));
        ArrayList<int[]> result = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++) {
            if(i == intervals.length - 1) {
                result.add(new int[]{intervals[i][0], intervals[i][1]});
                break;
            }
            if(intervals[i][1] >= intervals[i+1][0]) {
                // merge
                intervals[i][1] = Math.max(intervals[i][1], intervals[i+1][1]);
                result.add(new int[]{intervals[i][0], intervals[i][1]});
                i++;
            } else {
                result.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }

        int[][] tempArrayResult = new int[result.size()][2];
        return result.toArray(tempArrayResult);
    }
}
