package com.github.rodiond26.binary_tree.search;

import com.github.rodiond26.binary_tree.TreeNode;

public class Solution20250909 {
}

class Solution110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean result = true;

        result = result && Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1;

        return !result
                ? false
                : isBalanced(root.left) && isBalanced(root.right);
    }

    private int maxDepth(TreeNode root) {
        return root == null
                ? 0
                : 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}

class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
