package com.github.rodiond26.yandex.practicum.tree;

import java.util.*;

public class TaskF {

    public List<Integer> right(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                queue.add(node.left);
                queue.add(node.right);
                if (i == 0) {
                    result.add(node.value);
                }
            }
        }
        return result;
    }
}
