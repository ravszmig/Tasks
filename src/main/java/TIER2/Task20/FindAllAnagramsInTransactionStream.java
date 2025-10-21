package TIER2.Task20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInTransactionStream {

    public static List<Integer> findAnagrams(String s, String p) {

        char[] sArr = s.toCharArray();
        int[] sCount = new int[26];
        int[] pCount = new int[26];

        List<Integer> result = new ArrayList<>();

        int pLength = p.length();

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            sCount[sArr[i] - 'a']++;

            if(i >= pLength) {
                sCount[sArr[i - pLength] - 'a']--;
            }

            if(Arrays.equals(sCount, pCount)) {
                result.add(i-(pLength-1));
            }
        }
        return result;
    }
}
