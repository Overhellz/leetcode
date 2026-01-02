package com.github.rodiond26.stage_2.ten.p16_graph;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution1926 {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // row, col, distance
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && maze[newRow][newCol] == '.') {
                    if (newRow == 0 || newRow == rows - 1 || newCol == 0 || newCol == cols - 1) {
                        return distance + 1;
                    }

                    maze[newRow][newCol] = '+';
                    queue.offer(new int[]{newRow, newCol, distance + 1});
                }
            }
        }

        return -1;
    }
}
