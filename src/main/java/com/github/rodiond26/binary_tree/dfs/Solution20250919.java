package com.github.rodiond26.binary_tree.dfs;

import com.github.rodiond26.binary_tree.TreeNode;

public class Solution20250919 {
}

class Solution1325 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }
}
