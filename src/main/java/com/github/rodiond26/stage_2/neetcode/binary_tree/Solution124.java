package com.github.rodiond26.stage_2.neetcode.binary_tree;

public class Solution124 {
    private int maxPath;

    public int maxPathSum(TreeNode root) {
        maxPath = root.val;
        dfs(root);
        return maxPath;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMax = dfs(root.left);
        int rightMax = dfs(root.right);

        leftMax = Math.max(leftMax, 0);
        rightMax = Math.max(rightMax, 0);

        // max path sum with split
        int maxPathWithSplit = root.val + leftMax + rightMax;
        maxPath = Math.max(maxPath, maxPathWithSplit);

        return root.val + Math.max(leftMax, rightMax);
    }
}
