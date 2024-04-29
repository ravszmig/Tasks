package youtube.task4_reverseInt;

public class ReverseInt {
    public static int reverseInt(int num) {
         // 5 4 3 2 1
        long result = 0;

        while(num !=0) {
            result = result * 10 + num % 10;
            num /= 10;

            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) result;
    }
}
