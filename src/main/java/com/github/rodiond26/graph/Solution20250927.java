package com.github.rodiond26.graph;

import java.util.*;

public class Solution20250927 {
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