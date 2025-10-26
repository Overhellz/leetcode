package com.github.rodiond26.stage_2.neetcode.binary_tree;

public class Solution1448 {

    public int goodNodes(TreeNode root) {
        return goodNodes(root, root.val);
    }

    public int goodNodes(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }

        int newMax = Math.max(max, root.val);
        int count = goodNodes(root.left, newMax) + goodNodes(root.right, newMax);
        if (root.val >= max) {
            count++;
        }

        return count;
    }
}
