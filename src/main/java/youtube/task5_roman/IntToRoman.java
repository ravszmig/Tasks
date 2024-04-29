package youtube.task5_roman;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {

    public static int intToRoman(String roman) {
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("Invalid Roman numeral");
        }

        Map<Character, Integer> vals = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int result = 0;
        int prevValue = 0;

        for (int i = 0; i < roman.length(); i++) {
            char currentChar = roman.charAt(i);
            if (!vals.containsKey(currentChar)) {
                throw new IllegalArgumentException("Invalid Roman numeral character: " + currentChar);
            }

            int val = vals.get(currentChar);

            // Subtract twice the previous value if the current value is greater than the previous one
            if (val > prevValue) {
                result -= 2 * prevValue;
            }

            result += val;
            prevValue = val; // Update previous value
        }

        if (result > 3999) {
            throw new IllegalArgumentException("Roman numeral exceeds maximum value (3999)");
        }

        return result;
    }
}
