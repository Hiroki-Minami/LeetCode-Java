package org.example.org.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rowLength = grid.length;
        int columnLength = grid[0].length;

        for (int l = 0; l < k; l++) {
            int temp = grid[0][0];
            for (int row = 0; row < rowLength; row++) {
                for (int column = 0; column < columnLength; column++) {
                   int nextRow = column == columnLength - 1 ? (row + 1) % rowLength: row;
                   int nextColumn = column == columnLength - 1 ? 0: column + 1;
                   int temp2 = grid[nextRow][nextColumn];
                   grid[nextRow][nextColumn] = temp;
                   temp = temp2;
                }
            }
        }

        return Arrays.stream(grid)
                .map(row -> Arrays.stream(row)
                        .boxed()
                        .collect(Collectors.toList()))
                .toList();
    }
}
