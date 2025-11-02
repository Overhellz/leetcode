package com.github.rodiond26.stage_2.ten.p9_binary_tree_bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        boolean leftToRightDirection = true;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);

        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                if (leftToRightDirection) {
                    TreeNode current = deque.pollFirst();
                    list.add(current.val);
                    if (current.left != null) {
                        deque.addLast(current.left);
                    }
                    if (current.right != null) {
                        deque.addLast(current.right);
                    }
                } else {
                    TreeNode current = deque.pollLast();
                    list.add(current.val);
                    if (current.right != null) {
                        deque.addFirst(current.right);
                    }
                    if (current.left != null) {
                        deque.addFirst(current.left);
                    }
                }
            }
            result.add(list);
            leftToRightDirection = !leftToRightDirection;
        }
        return result;
    }
}
