package TIER2.task8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {

    int k;
    PriorityQueue<Integer> nums;

    public KthLargest(int k, int[] nums) {
        this.k = k - 1;
        this.nums = new PriorityQueue<>(k);
        this.nums.addAll(Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).limit(k).toList());
    }

    public int add(int val) {
        nums.offer(val);
        if (nums.size() > k ) {
            nums.poll();
        }
        return nums.peek();
    }
}
