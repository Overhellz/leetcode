package com.github.rodiond26.stage_2.ten.p16_graph;

import java.util.*;

class Solution1129 {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {

        final int RED = 0;
        final int BLUE = 1;

        Map<Integer, Map<Integer, List<Integer>>> graph = new HashMap<>();
        graph.put(RED, new HashMap<>());
        graph.put(BLUE, new HashMap<>());

        for (int i = 0; i < n; i++) {
            graph.get(RED).put(i, new ArrayList<>());
            graph.get(BLUE).put(i, new ArrayList<>());
        }

        for (int[] edge : redEdges) {
            graph.get(RED).get(edge[0]).add(edge[1]);
        }

        for (int[] edge : blueEdges) {
            graph.get(BLUE).get(edge[0]).add(edge[1]);
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, RED, 0});
        queue.offer(new int[]{0, BLUE, 0});

        boolean[][] visited = new boolean[n][2];
        visited[0][RED] = true;
        visited[0][BLUE] = true;

        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        answer[0] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int node = current[0];
            int lastColor = current[1];
            int distance = current[2];

            int nextColor = lastColor == RED ? BLUE : RED;

            List<Integer> neighbors = graph.get(nextColor).get(node);

            for (int neighbor : neighbors) {
                if (!visited[neighbor][nextColor]) {
                    visited[neighbor][nextColor] = true;
                    int newDistance = distance + 1;
                    queue.offer(new int[]{neighbor, nextColor, newDistance});

                    if (answer[neighbor] == -1 || newDistance < answer[neighbor]) {
                        answer[neighbor] = newDistance;
                    }
                }
            }
        }
        return answer;
    }
}
