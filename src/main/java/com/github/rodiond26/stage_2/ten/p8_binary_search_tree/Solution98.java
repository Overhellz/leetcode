package com.github.rodiond26.stage_2.ten.p8_binary_search_tree;

import java.util.Stack;

public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        return isValidBST2(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST2(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST2(root.left, min, root.val)
                && isValidBST2(root.right, root.val, max);
    }

    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }

        Stack<Wrapper> stack = new Stack<>();
        Wrapper wrapper1 = new Wrapper(root, Long.MIN_VALUE, Long.MAX_VALUE);
        stack.push(wrapper1);

        while (!stack.isEmpty()) {
            Wrapper wrapper = stack.pop();
            if (wrapper == null) {
                continue;
            }
            if (wrapper.node == null) {
                continue;
            }

            TreeNode current = wrapper.node;
            long min = wrapper.min;
            long max = wrapper.max;

            if (current.val <= min || current.val >= max) {
                return false;
            }
            stack.push(new Wrapper(current.left, min, current.val));
            stack.push(new Wrapper(current.right, current.val, max));
        }
        return true;
    }

    private class Wrapper {
        TreeNode node;
        long min;
        long max;

        public Wrapper(TreeNode node, long min, long max) {
            this.node = node;
            this.min = min;
            this.max = max;
        }
    }
}
