package com.github.rodiond26.stage_2.ten.p14_graph_intro;

import java.util.*;

class Solution1971 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // map вершин из edges
        Map<Integer, List<Integer>> verticesToVertices = new HashMap<>();
        for (int[] edge : edges) {
            List<Integer> list0 = verticesToVertices.getOrDefault(edge[0], new ArrayList<>());
            list0.add(edge[1]);
            verticesToVertices.put(edge[0], list0);

            List<Integer> list1 = verticesToVertices.getOrDefault(edge[1], new ArrayList<>());
            list1.add(edge[0]);
            verticesToVertices.put(edge[1], list1);
        }

        // map до вершин, которые можно достичь
        Set<Integer> seen = new HashSet<>();
        seen.add(source);

        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        while (!stack.isEmpty()) {
            Integer current = stack.pop();
            if (current.equals(destination)) {
                return true;
            }

            for (Integer v : verticesToVertices.get(current)) {
                if (!seen.contains(v)) {
                    seen.add(v);
                    stack.push(v);
                }
            }
        }

        return false;
    }
}
