package com.github.rodiond26.stage_2.ten.p14_graph_intro;

import java.util.ArrayList;
import java.util.List;

class Solution1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] inDegree = new int[n];
        for (List<Integer> edge : edges) {
            inDegree[edge.get(1)]++;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                result.add(i);
            }
        }

        return result;
    }
}
