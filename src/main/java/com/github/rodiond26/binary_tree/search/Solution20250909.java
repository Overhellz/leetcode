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

// TODO
class Solution98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && root.left.val >= root.val) {
            return false;
        }
        if (root.right != null && root.right.val <= root.val) {
            return false;
        }
        return isValidBST(root.left) && isValidBST(root.right);
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

class Solution701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (val < root.val) {
            return insertIntoBST(root.left, val);
        } else {
            return insertIntoBST(root.right, val);
        }
    }
}
