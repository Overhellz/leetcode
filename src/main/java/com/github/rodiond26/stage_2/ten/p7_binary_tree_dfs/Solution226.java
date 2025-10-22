package com.github.rodiond26.stage_2.ten.p7_binary_tree_dfs;

public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode dummy = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(dummy);
        return root;
    }
}
