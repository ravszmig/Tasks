package youtube.task6_triangle;

public class Triangle {
    public static String print() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            StringBuilder b = new StringBuilder();
            for (int j = 0; j < i; j++)
            {
                b.append("*");
            }
            System.out.println(b);

            result.append(b);
            result.append(System.getProperty("line.separator"));
        }
        return result.toString();
    }
}
