package TIER2.task12;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }
}
