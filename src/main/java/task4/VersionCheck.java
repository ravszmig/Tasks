package task4;

import java.util.Arrays;

public class VersionCheck {

    //        * -1 if version1 < version2
    //        * 1 if version1 > version2
    //        * 0 if version1 == version2

    public static int compare(String val1, String val2) {
        int[] val1split = parseVersionString(val1);
        int[] val2split = parseVersionString(val2);

        int maxLength = Math.max(val1split.length, val2split.length);

        for (int i = 0; i < maxLength; i++) {
            int v1 = i < val1split.length ? val1split[i] : 0;
            int v2 = i < val2split.length ? val2split[i] : 0;

            if (v1 < v2) {
                return -1;
            } else if (v1 > v2) {
                return 1;
            }
        }

        return 0;
    }

    private static int[] parseVersionString(String version) {
        return Arrays.stream(version.split("\\."))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}