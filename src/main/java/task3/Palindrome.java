package task3;

public class Palindrome {
    public static boolean isPalindrome(String text) {

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
