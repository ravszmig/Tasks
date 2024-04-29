package task6;

public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length - 1;

        if (n <= 0)
            return;

        /* layers */
        for (int i = 0; i < (n + 1) / 2; i++) {
            /* elements */
            for (int j = i; j < n - i; j++) {
                // Swap elements in clockwise direction
                // temp = top-left
                int temp = matrix[i][j];
                // top-left <- bottom-left
                matrix[i][j] = matrix[n - j][i];
                // bottom-left <- bottom-right
                matrix[n - j][i] = matrix[n - i][n - j];
                // bottom-right <- top-right
                matrix[n - i][n - j] = matrix[j][n - i];
                // top-right <- top-left
                matrix[j][n - i] = temp;
            }
        }
    }
}
