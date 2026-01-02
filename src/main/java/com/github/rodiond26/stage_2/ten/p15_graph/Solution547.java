package com.github.rodiond26.stage_2.ten.p15_graph;

import java.util.*;

class Solution547 {
    public int findCircleNum(int[][] isConnected) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) {
                    graph.putIfAbsent(i, new ArrayList<>());
                    graph.get(i).add(j);

                    graph.putIfAbsent(j, new ArrayList<>());
                    graph.get(j).add(i);
                }
            }
        }

        Set<Integer> seen = new HashSet<>();
        int num = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < isConnected.length; i++) {
            if (!seen.contains(i)) {
                num++;
                stack.push(i);
                seen.add(i);

                while (!stack.isEmpty()) {
                    int current = stack.pop();

                    List<Integer> neighbors = graph.get(current);
                    for (Integer neighbor : neighbors) {
                        if (!seen.contains(neighbor)) {
                            seen.add(neighbor);
                            stack.push(neighbor);
                        }
                    }
                }
            }
        }

        return num;
    }
}
