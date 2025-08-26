package com.github.rodiond26.trees.task226;

import com.github.rodiond26.trees.TreeNode;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode tempNode = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tempNode);
        return root;
    }
}
