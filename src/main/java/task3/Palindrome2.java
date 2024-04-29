package task3;

public class Palindrome2 {
    public static boolean isPalindrome(String text) {

        var textReversed = new StringBuilder(text).reverse().toString();

        return text.equals(textReversed);
    }
}
