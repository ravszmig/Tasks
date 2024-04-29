package task1;

import static java.util.Objects.isNull;

public class  ReverseString3 {

    public static String reverseString3(String s) {
        if (isNull(s)) {
            throw new IllegalArgumentException("String can not be null");
        }

        StringBuilder reversedStringNuilder = new StringBuilder(s);
        return reversedStringNuilder.reverse().toString();
    }
}
