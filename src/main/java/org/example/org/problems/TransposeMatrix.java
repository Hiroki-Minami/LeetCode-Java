package org.example.org.problems;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int[][] ret = new int[matrix[0].length][matrix.length];
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                ret[x][y] = matrix[y][x];
            }
        }
        return ret;
    }
}
