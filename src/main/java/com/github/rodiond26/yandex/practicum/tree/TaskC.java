package com.github.rodiond26.yandex.practicum.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TaskC {

    public int[][] ages(Node node) {
        if (node == null) {
            return new int[][]{};
        }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        List<int[]> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();
            int[] generation = new int[size];
            for (int i = 0; i < size; i++) {
                Node n = queue.poll();
                generation[i] = n.value;
                if (n.left != null) {
                    queue.add(n.left);
                }
                if (n.right != null) {
                    queue.add(n.right);
                }
            }
            list.add(generation);
        }

        int[][] result = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(0);
        }
        return result;
    }
}
