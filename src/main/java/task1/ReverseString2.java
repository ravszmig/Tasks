package task1;

import static java.util.Objects.requireNonNull;

public class ReverseString2 {
    public static String reverse(String text, boolean onlyOdd) {
        requireNonNull(text);

        StringBuilder builder = new StringBuilder(text.length());

        for (int i = text.length() - 1; i >= 0; i--) {
            if ((text.length() - i) % 2 == 1 || !onlyOdd)
                builder.append(text.charAt(i));
            else {
                builder.append(text.charAt(text.length() - i - 1));
            }
        }

        return builder.toString();
    }
}
