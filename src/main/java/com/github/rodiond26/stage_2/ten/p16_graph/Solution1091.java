package com.github.rodiond26.stage_2.ten.p16_graph;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] != 0) {
            return -1;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {
                {1, 0}, {-1, 0}, {0, 1}, {0, -1},
                {1, 1}, {1, -1}, {-1, -1}, {-1, 1}
        };

        grid[0][0] = 1;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0, 1});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];

            if (row == rows - 1 && col == cols - 1) {
                return distance;
            }

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 0) {
                    if (row == rows - 1 && col == cols - 1) {
                        return distance;
                    }

                    grid[newRow][newCol] = 1;
                    queue.offer(new int[]{newRow, newCol, distance + 1});
                }
            }
        }

        return -1;
    }
}
