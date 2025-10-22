package com.github.rodiond26.stage_2.ten.p7_binary_tree_dfs;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);
        return Math.max(maxLeft, maxRight) + 1;
    }

    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
    }

    public int maxDepth3(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current != null) {
                    if (current.left != null) {
                        queue.add(current.left);
                    }
                    if (current.right != null) {
                        queue.add(current.right);
                    }
                }
            }
        }
        return depth;
    }
}
