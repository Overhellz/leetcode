package com.github.rodiond26.stage_2.ten.p23_dynamic_programming;

class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        return arr[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Solution62 s = new Solution62();
        s.uniquePaths(3, 7);
    }
}
