package com.github.rodiond26.stage_2.ten.p7_binary_tree_dfs;

import java.util.Stack;

public class Solution112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }

    public boolean hasPathSum2(TreeNode root, int targetSum) {

        // TODO fix
        if (root == null) {
            return false;
        }
        Wrapper wrapper = new Wrapper(root, targetSum);

        Stack<Wrapper> stack = new Stack<>();
        stack.push(wrapper);

        while (!stack.isEmpty()) {
            Wrapper current = stack.pop();
            int currentSum = current.sum;
            if (current.node == null) {
                continue;
            }
            if (current.node.left == null
                    && current.node.right == null
                    && current.node.val == currentSum) {
                return true;
            }
            stack.push(new Wrapper(current.node.left, currentSum + current.node.val));
            stack.push(new Wrapper(current.node.right, currentSum + current.node.val));
        }
        return false;
    }

    static class Wrapper {
        TreeNode node;
        int sum;

        public Wrapper(TreeNode node, int sum) {
            this.node = node;
            this.sum = sum;
        }
    }
}
