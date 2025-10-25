package com.github.rodiond26.stage_2.ten.p7_binary_tree_dfs;

import com.github.rodiond26.binary_tree.TreeNode;

public class Solution100 {
    public boolean isSameTree(com.github.rodiond26.binary_tree.TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q == null) {
            return false;
        }
        if (p == null && q != null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}
