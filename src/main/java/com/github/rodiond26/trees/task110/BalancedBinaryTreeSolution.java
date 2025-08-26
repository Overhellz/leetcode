package com.github.rodiond26.trees.task110;

import com.github.rodiond26.trees.TreeNode;

public class BalancedBinaryTreeSolution {

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
