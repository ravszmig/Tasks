package youtube.task6_triangle;

public class Triangle {
    public static String print() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            StringBuilder b = new StringBuilder();
            for (int j = 0; j < i; j++) {
                b.append("*");
            }
            result.append(b).append("\n");
        }
        // Remove the trailing newline
        return result.toString().trim();
    }
}