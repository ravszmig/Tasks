package task6;

public class RotateMatrix2 {
    public static void rotate(int[][] matrix) {
        var len = matrix.length;

        if (len <= 1) {
            return;
        }

        var n = len - 1;

        //Transpose
        transpose(matrix, n);
        //Reverse
        reverse(matrix, n);
    }

    public static void transpose(int[][] matrix, int n) {
        for(int i = 0; i<=n; i++){
            for(int j = i + 1; j<=n; j++) {
                var temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] matrix, int n) {
        for(int i = 0; i<=n; i++) {
            var start = 0;
            var end = n;

            while(start < end) {
                var temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }
    }
}