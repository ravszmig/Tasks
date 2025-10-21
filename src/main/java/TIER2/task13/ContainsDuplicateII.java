package TIER2.task13;

import java.util.HashMap;

public class ContainsDuplicateII {

    /*
    * Given an integer array nums and an integer k,
    * return true if there are two distinct indices
    * i and j such that:
    * nums[i] == nums[j], and |i - j| <= k.
    * */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                if(i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
