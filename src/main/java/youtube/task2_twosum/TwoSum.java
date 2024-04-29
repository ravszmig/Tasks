package youtube.task2_twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];

        //Create hashmap to store previously encountered numbers
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i<arr.length; i++) {
            // Count what number we need to reach the target
            int delta = target - arr[i];

            // If we already encountered the needed numer, we have the answer
            if(numMap.containsKey(delta)) {
                result[0] = i;
                result[1] = numMap.get(delta);
                break;
            } else {
                // If we have no such number, we store the current value and its indice
                numMap.put(arr[i], i);
            }
        }

        return result;
    }
}
