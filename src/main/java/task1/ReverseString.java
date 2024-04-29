package task1;

import static java.util.Objects.isNull;

public class ReverseString {

    public static String reverse(String text, boolean onlyOddNumbers) {
        if(isNull(text)) {
            throw new RuntimeException("Text is not initialized");
        }
        var chars = text.toCharArray(); // O(1)
        var arrayLength = chars.length; // O(1)
        char temp;


        for(int idx = 0; idx < arrayLength/2; idx++) { // O(N / 2)
            if((idx + 1) % 2 != 0 || !onlyOddNumbers) { // O(1)
                temp = chars[idx]; // O(1)
                chars[idx] = chars[arrayLength - idx - 1]; // O(1)
                chars[arrayLength - idx - 1] = temp; // O(1)
            }
        }

        return String.valueOf(chars); // O(1)
    }


}
