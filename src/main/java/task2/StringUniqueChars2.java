package task2;

import static java.util.Objects.requireNonNull;

public class StringUniqueChars2 {
    public static boolean hasUniqueChars(String str) {
        requireNonNull(str);

        if (str.length() > 128)
            return false;

        return str.chars().distinct().count() == str.length();
    }
}
