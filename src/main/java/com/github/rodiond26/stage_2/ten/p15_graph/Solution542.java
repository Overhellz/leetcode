package com.github.rodiond26.stage_2.ten.p15_graph;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution542 {

    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] dist = new int[m][n];
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                    queue.offer(new int[]{i, j});
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
                    if (dist[newRow][newCol] > dist[row][col] + 1) {
                        dist[newRow][newCol] = dist[row][col] + 1;
                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
        }
        return dist;
    }
}
