package task2;

import static java.util.Objects.requireNonNull;

public class StringUniqueChars {
    public static boolean hasUniqueChars(String str) {
        requireNonNull(str);

        if (str.length() > 128)
            return false;

        boolean[] booleans = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i);
            if (booleans[value]) {
                return false;
            }
            booleans[value] = true;
        }
        return true;
    }
}
