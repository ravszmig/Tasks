package TIER2.task2;

import java.util.HashMap;

public class FirstUniqueInString {

    public static char firstUnique(String str) {
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : arr) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return '_';
    }
}
