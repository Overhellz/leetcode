package com.github.rodiond26.stage_2.neetcode.binary_search;

public class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int length = matrix.length;
        int height = matrix[0].length;
        int x = 0;
        int y = 0;

        while (true) {
            if (x >= length || y >= height) {
                return false;
            }
            int current = matrix[x][y];
            if (current == target) {
                return true;
            }

            if ()



        }


        return false;
    }
}
