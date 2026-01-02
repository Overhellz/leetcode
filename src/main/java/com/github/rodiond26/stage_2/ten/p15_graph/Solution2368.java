package com.github.rodiond26.stage_2.ten.p15_graph;

import java.util.*;

class Solution2368 {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        Set<Integer> seen = new HashSet<>();
        seen.add(0);
        for (int num : restricted) {
            seen.add(num);
        }

        int result = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty()) {
            int v = stack.pop();
            result++;

            for (Integer n1 : graph.get(v)) {
                if (!seen.contains(n1)) {
                    seen.add(n1);
                    stack.push(n1);
                }
            }
        }

        return result;
    }
}
