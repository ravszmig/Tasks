package TIER2.task3;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestSubarrayWithSum {

    public static int longestSubarrayWithSum(int[] arr, int k) {
        Deque<Integer> deque = new ArrayDeque<>();

        for(int element : arr) {
            deque.addLast(element);
            if(sum(deque) >= k) {
                deque.removeLast();
            }
        }

        return deque.size();
    }

    private static int sum(Deque<Integer> deque) {
        return deque.stream().mapToInt(i -> (int) i).sum();
    }
}
