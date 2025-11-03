package com.github.rodiond26.graph;

import java.util.*;

public class Solution20250928 {
}

class Solution_200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null) {
            return 0;
        }

        int length = grid.length;
        int height = grid[0].length;
        int num = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                if (grid[i][j] == '1') {
                    num++;
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});

                    while (!queue.isEmpty()) {
                        int[] coordinates = queue.poll();
                        int x = coordinates[0];
                        int y = coordinates[1];

                        if (isValidCoordinates(x, y, length, height, grid)) {
                            grid[x][y] = '0';
                            queue.add(new int[]{x + 1, y});
                            queue.add(new int[]{x - 1, y});
                            queue.add(new int[]{x, y + 1});
                            queue.add(new int[]{x, y - 1});
                        }
                    }
                }
            }
        }
        return num;
    }

    private boolean isValidCoordinates(int x, int y, int length, int height, char[][] grid) {
        return x >= 0 && x < length &&
                y >= 0 && y < height &&
                grid[x][y] == '1';
    }
}

class Solution752 {
    public int openLock(String[] deadends, String target) {
        String start = "0000";
        if (target.equals(start)) {
            return 0;
        }

        Set<String> seen = new HashSet<>(Arrays.asList(deadends));
        if (seen.contains(target) || seen.contains(start)) {
            return -1;
        }

        Queue<String> queue = new ArrayDeque<>();
        queue.add(start);
        seen.add(start);
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            count++;

            for (int j = 0; j < size; j++) {
                String currentString = queue.poll();

                for (int i = 0; i < 4; i++) {
                    char original = currentString.charAt(i);
                    char upChar = toUpChar(original);
                    String upString = currentString.substring(0, i) + upChar + currentString.substring(i + 1);
                    if (upString.equals(target)) {
                        return count;
                    }
                    if (!seen.contains(upString)) {
                        seen.add(upString);
                        queue.add(upString);
                    }

                    char downChar = toDownChar(original);
                    String downString = currentString.substring(0, i) + downChar + currentString.substring(i + 1);
                    if (downString.equals(target)) {
                        return count;
                    }
                    if (!seen.contains(downString)) {
                        seen.add(downString);
                        queue.add(downString);
                    }
                }
            }
        }
        return -1;
    }

    private char toUpChar(char original) {
        return original == '9' ? '0' : (char) (original + 1);
    }

    private char toDownChar(char original) {
        return original == '0' ? '9' : (char) (original - 1);
    }
}
