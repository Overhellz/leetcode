package com.github.rodiond26.stage_2.ten.p19_topological_sort;

import java.util.*;

class Solution210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        Map<Integer, Integer> inDegree = new HashMap<>();

        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
            inDegree.put(i, 0);
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];

            graph.get(prerequisite).add(course);
            inDegree.put(course, inDegree.get(course) + 1);
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree.get(i) == 0) {
                queue.offer(i);
            }
        }

        List<Integer> order = new ArrayList<>();

        while (!queue.isEmpty()) {

            int current = queue.poll();
            order.add(current);

            for (int dependentCourse : graph.get(current)) {
                inDegree.put(dependentCourse, inDegree.get(dependentCourse) - 1);
                if (inDegree.get(dependentCourse) == 0) {
                    queue.offer(dependentCourse);
                }
            }
        }

        if (order.size() != numCourses) {
            return new int[0];
        }

        return order.stream().mapToInt(i -> i).toArray();
    }
}
