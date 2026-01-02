package com.github.rodiond26.stage_2.ten.p15_graph;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution200 {
    public int numIslands(char[][] grid) {
        if (grid == null) {
            return 0;
        }

        int num = 0;
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    num++;

                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});

                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        int r = current[0];
                        int c = current[1];

                        if (!isInvalid(grid, r, c)) {
                            grid[r][c] = '0';
                            queue.add(new int[]{r + 1, c});
                            queue.add(new int[]{r - 1, c});
                            queue.add(new int[]{r, c + 1});
                            queue.add(new int[]{r, c - 1});
                        }
                    }
                }
            }
        }

        return num;
    }

    private boolean isInvalid(char[][] grid, int row, int column) {
        return row < 0 || row >= grid.length
                || column < 0 || column >= grid[0].length
                || grid[row][column] != '1';
    }
}
