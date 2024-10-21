package siiinteview;

public class InterviewTask {
//
//    Return the sum of the numbers in the array, except ignore sections of numbers
//    starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
//
//
//    Tests to self-check:
//    sum67([1, 2, 2]) => 5
//    sum67([1, 2, 2, 6, 99, 99, 7]) => 5
//    sum67([1, 1, 6, 7, 2]) => 4
//    sum67([1, 6, 2, 2, 7, 1, 6, 99, 99, 7]) => 2
//    sum67([1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7]) => 2
//    sum67([2, 7, 6, 2, 6, 2, 7]) => 9


    public static void main(String[] args) {
        System.out.println(sum67(new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean sixEncoundered = false;

        for(int num : nums) {
            if(!sixEncoundered && num != 6) {
                sum += num;
            } else if(num == 6) {
                sixEncoundered = true;
            } else if(num == 7) {
                sixEncoundered = false;
            }
        }

        return sum;
    }
}
