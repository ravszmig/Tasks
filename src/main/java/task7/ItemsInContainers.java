package task7;

import java.util.ArrayList;
import java.util.List;

public class ItemsInContainers {
    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        validateIndices(startIndices, "Start");
        validateIndices(endIndices, "End");

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < startIndices.size(); i++) {
            int asterisksAcumulated = countAsterisks(s, startIndices.get(i), endIndices.get(i));
            result.add(asterisksAcumulated);
        }
        return result;
    }

    private static void validateIndices(List<Integer> indices, String type) {
        if (indices.isEmpty() || indices.size() > Math.pow(10, 5)) {
            throw new RuntimeException(type + " indices are of wrong size");
        }
    }

    private static int countAsterisks(String s, int startIndex, int endIndex) {
        if (startIndex < 1 || startIndex > Math.pow(10, 5) || endIndex < 1 || endIndex > Math.pow(10, 5)) {
            throw new RuntimeException("Start or End has wrong size");
        }

        int asterisksAcumulated = 0;
        boolean firstPipeFound = false;
        int asterisks = 0;

        for (char c : s.substring(startIndex - 1, endIndex).toCharArray()) {
            switch (c) {
                case '|':
                    if (firstPipeFound) {
                        asterisksAcumulated += asterisks;
                        asterisks = 0;
                    } else {
                        firstPipeFound = true;
                        asterisks = 0;
                    }
                    break;
                case '*':
                    asterisks++;
                    break;
                default:
                    throw new RuntimeException("Invalid char found");
            }
        }
        return asterisksAcumulated;
    }
}
