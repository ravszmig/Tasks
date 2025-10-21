package TIER2.task14;

import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy(int n) {
        HashSet<Integer> results = new HashSet<>();
        if(n <= 0) return false;

        while(n != 1) {
            n = getSumOfSquares(n);
            if(!results.add(n)) {
                return false;
            }
        }

        return true;
    }

    private static int getSumOfSquares(int n) {
        int sum = 0;
        while(n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
