package com.github.rodiond26.trees.task104;

import com.github.rodiond26.trees.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        return root == null
                ? 0
                : 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}
