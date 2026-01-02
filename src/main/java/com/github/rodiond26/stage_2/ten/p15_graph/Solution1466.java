package com.github.rodiond26.stage_2.ten.p15_graph;

import java.util.*;

class Solution1466 {
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Set<String> originalDirections = new HashSet<>();

        for (int[] connection : connections) {
            int a = connection[0];
            int b = connection[1];

            graph.putIfAbsent(a, new ArrayList<>());
            graph.putIfAbsent(b, new ArrayList<>());
            graph.get(a).add(b);
            graph.get(b).add(a);
            originalDirections.add(a + ":" + b);
        }

        int turns = 0;

        Set<Integer> seen = new HashSet<>();
        seen.add(0);

        Stack<Integer> stack = new Stack<>();
        stack.add(0);

        while (!stack.isEmpty()) {
            int v = stack.pop();
            for (Integer n1 : graph.get(v)) {
                if (!seen.contains(n1)) {
                    if (originalDirections.contains(v + ":" + n1)) {
                        turns++;
                    }

                    stack.add(n1);
                    seen.add(n1);
                }
            }
        }

        return turns;
    }
}
