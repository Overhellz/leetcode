package com.github.rodiond26.stage_2.ten.p15_graph;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null) {
            return 0;
        }

        int n = grid.length;
        int m = grid[0].length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    int currentArea = 0;
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});
                    grid[i][j] = 0;

                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        int r = current[0];
                        int c = current[1];
                        currentArea++;

                        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
                        for (int[] dir : directions) {
                            int newR = r + dir[0];
                            int newC = c + dir[1];

                            if (isValid(grid, newR, newC)) {
                                queue.add(new int[]{newR, newC});
                                grid[newR][newC] = 0;
                            }
                        }
                    }

                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }

        return maxArea;
    }

    private boolean isValid(int[][] grid, int newR, int newC) {
        return newR >= 0 && newR < grid.length
                && newC >= 0 && newC < grid[0].length
                && grid[newR][newC] == 1;
    }
}
