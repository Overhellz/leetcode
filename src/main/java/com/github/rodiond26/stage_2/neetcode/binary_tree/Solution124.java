package com.github.rodiond26.stage_2.neetcode.binary_tree;

public class Solution124 {
    int result = 0;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }


    }


    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return result;
    }


    private int branchSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }
        int leftSum = branchSum(root.left);
        int rightSum = branchSum(root.right);
        int currentSum = root.val + leftSum + rightSum;
        result = Math.max(result, currentSum);

    }

    private int diameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = diameter(root.left);
        int right = diameter(root.right);
        result = Math.max(result, left + right);
        return 1 + Math.max(left, right);
    }
}
