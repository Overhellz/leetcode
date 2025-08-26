package com.github.rodiond26.trees.task543;

import com.github.rodiond26.trees.TreeNode;


public class DiameterOfBinaryTreeSolution {
    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return result;
    }

    private int diameter (TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        result = Math.max(result, left +right);
        return 1 + Math.max(left, right);
    }
}
