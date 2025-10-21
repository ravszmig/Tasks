package TIER2.task10;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }

        Deque<Integer> dq = new ArrayDeque<>(); // stores indices
        int[] result = new int[nums.length - k + 1];
        int ri = 0;

        for (int i = 0; i < nums.length; i++) {
            // 1️⃣ Remove indices outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2️⃣ Remove smaller elements (they can’t be max)
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3️⃣ Add current index
            dq.offerLast(i);

            // 4️⃣ Add to result once window size reaches k
            if (i >= k - 1) {
                result[ri++] = nums[dq.peekFirst()];
            }
        }

        return result;
    }

    private static int max(Deque<Integer> deque) {
        return deque.stream().mapToInt(i -> i).max().orElseThrow(() -> new IllegalArgumentException("Deque cannot be empty"));
    }
}
