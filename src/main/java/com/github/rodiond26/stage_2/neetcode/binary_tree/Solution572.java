package com.github.rodiond26.stage_2.neetcode.binary_tree;

public class Solution572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        return isSameTree(root, subRoot)
                || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
