package com.github.rodiond26.stage_2.ten.p16_graph;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution994 {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int freshCount = 0;
        int minutes = 0;

        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                }
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j, 0});
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int i = current[0];
            int j = current[1];
            int minute = current[2];
            minutes = Math.max(minutes, minute);

            for (int[] direction : directions) {
                int newI = i + direction[0];
                int newJ = j + direction[1];

                if (newI >= 0 && newI < rows && newJ >= 0 && newJ < cols && grid[newI][newJ] == 1) {
                    freshCount--;
                    grid[newI][newJ] = 2;
                    queue.offer(new int[]{newI, newJ, minute + 1});
                }
            }
        }

        if (freshCount == 0) {
            return minutes;
        }
        return -1;
    }
}
