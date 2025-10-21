package TIER2.task15;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> result = new ArrayDeque<>();

        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        return result.stream().mapToInt(r -> r).toArray();
    }
}
