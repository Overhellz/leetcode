package com.github.rodiond26.graph;

import java.util.*;

public class Solution20250927 {
}

class Solution200 {
    public int numIslands(char[][] grid) {
        if (grid == null) {
            return 0;
        }

        int num = 0;
        int length = grid.length;
        int height = grid[0].length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < height; j++) {
                if (grid[i][j] == '1') {
                    num++;
                    Queue<Coordinate> queue = new ArrayDeque<>();
                    queue.add(new Coordinate(i, j));

                    while (!queue.isEmpty()) {
                        Coordinate coordinate = queue.poll();
                        if (!isInvalidCoordinates(coordinate, length, height, grid)) {
                            grid[coordinate.i][coordinate.j] = '0';
                            queue.add(new Coordinate(coordinate.i + 1, coordinate.j));
                            queue.add(new Coordinate(coordinate.i - 1, coordinate.j));
                            queue.add(new Coordinate(coordinate.i, coordinate.j + 1));
                            queue.add(new Coordinate(coordinate.i, coordinate.j - 1));
                        }
                    }
                }
            }
        }

        return num;
    }

    private boolean isInvalidCoordinates(Coordinate coordinate, int length, int height, char[][] grid) {
        return isInvalidCoordinates(coordinate.i, coordinate.j, length, height, grid);
    }

    private boolean isInvalidCoordinates(int i, int j, int length, int height, char[][] grid) {
        return i < 0 || i >= length
                || j < 0 || j >= height
                || grid[i][j] != '1';
    }

    class Coordinate {
        int i;
        int j;

        public Coordinate() {
        }

        public Coordinate(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object other) {
            if (other == null || getClass() != other.getClass()) return false;

            Coordinate that = (Coordinate) other;
            return i == that.i && j == that.j;
        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}

class Solution1466 {
    public int minReorder(int n, int[][] connections) {
        Set<Connect> originalConnections = new HashSet<>();
        for (int[] connection : connections) {
            Connect connect = new Connect(connection[0], connection[1]);
            originalConnections.add(connect);
        }

        List<Connect> undirectedGraph = new ArrayList<>();
        for (int[] connection : connections) {
            undirectedGraph.add(new Connect(connection[0], connection[1]));
            undirectedGraph.add(new Connect(connection[1], connection[0]));
        }

        Set<Integer> senn = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty()) {
            int v = stack.pop();

            for (Connect connect : undirectedGraph) {
            }

        }

        return -1;
    }
}

class Connect {
    int from;
    int to;

    public Connect(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) return false;

        Connect that = (Connect) other;
        return this.from == that.from && this.to == that.to;
    }

    @Override
    public int hashCode() {
        int result = from;
        result = 31 * result + to;
        return result;
    }
}

class Solution2368 {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Map<Integer, Integer> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.put(edge[0], edge[1]);
            graph.put(edge[1], edge[0]);
        }

        Set<Integer> seen = new HashSet<>();
        seen.add(0);
        for (int val : restricted) {
            seen.add(val);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        int count = 0;

        while (!stack.isEmpty()) {
            int v = stack.pop();
            count++;

            int val = graph.get(v);
            if (!seen.contains(val)) {
                seen.add(val);
                stack.push(val);
            }
        }
        return count;
    }
}