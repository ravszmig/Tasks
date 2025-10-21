package TIER2.task7;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* 🟢 EASY — Anagram Groups
Problem:

Given an array of strings, group the anagrams together.
Two words are anagrams if one can be rearranged to form the other.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["eat","tea","ate"],["tan","nat"],["bat"]]

Constraints:

1 ≤ number of strings ≤ 10⁴

Strings are lowercase English letters.

✅ Expected:

Time: O(n * k log k) (where k = avg word length)

Approach hint: Use a Map<String, List<String>> keyed by sorted word or by letter frequency signature.*/

public class GroupAnagrams {

    public static String[][] groupAnagrams(String[] strs) {
        return Stream.of(strs).
            collect(Collectors.groupingBy(s -> {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                return new String(chars);
            }))
            .values()
            .stream()
            .map(list -> list.toArray(new String[0]))
            .toArray(String[][]::new);
    }
}
