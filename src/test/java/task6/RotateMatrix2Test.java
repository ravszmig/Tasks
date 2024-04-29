package task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateMatrix2Test {
    @Test
    void rotate4x4() {
        int[][] matrix = new int[][]{
                {9, 10, 11, 12},
                {16, 17, 18, 19},
                {23, 24, 25, 26},
                {30, 31, 32, 33}};
        RotateMatrix2.rotate(matrix);
        assertArrayEquals(new int[]{30, 23, 16, 9}, matrix[0]);
        assertArrayEquals(new int[]{33, 26, 19, 12}, matrix[3]);
    }
    @Test
    void rotate5x5() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        RotateMatrix2.rotate(matrix);
        assertArrayEquals(new int[]{21, 16, 11, 6, 1}, matrix[0]);
        assertArrayEquals(new int[]{22, 17, 12, 7, 2}, matrix[1]);
    }

    @Test
    void rotate8x8() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48},
                {49, 50, 51, 52, 53, 54, 55, 56},
                {57, 58, 59, 60, 61, 62, 63, 64}};

        RotateMatrix2.rotate(matrix);

        assertArrayEquals(new int[]{57, 49, 41, 33, 25, 17, 9, 1}, matrix[0]);
        assertArrayEquals(new int[]{58, 50, 42, 34, 26, 18, 10, 2}, matrix[1]);
    }

    @Test
    void transpose() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        RotateMatrix2.transpose(matrix, matrix.length-1);

        assertArrayEquals(new int[]{1, 5, 9, 13}, matrix[0]);
        assertArrayEquals(new int[]{4, 8, 12, 16}, matrix[3]);
    }

    @Test
    void reverse() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        RotateMatrix2.reverse(matrix, matrix.length-1);

        assertArrayEquals(new int[]{4, 3, 2, 1}, matrix[0]);
        assertArrayEquals(new int[]{16, 15, 14, 13}, matrix[3]);
    }


}
