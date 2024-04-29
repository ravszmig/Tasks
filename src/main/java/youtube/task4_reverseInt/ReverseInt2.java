package youtube.task4_reverseInt;

public class ReverseInt2 {

    public static int reverse(int num){
        long reversed = 0;

        while(num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                throw new ArithmeticException();
            }
        }

        return (int) reversed;
    }

}
