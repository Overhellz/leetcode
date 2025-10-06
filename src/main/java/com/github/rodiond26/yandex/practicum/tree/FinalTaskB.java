package com.github.rodiond26.yandex.practicum.tree;

public class FinalTaskB {




    public int max(Node root) {
        if (root.left == null && root.right == null) {
            return root.value;
        }
        if (root.left != null && root.right == null) {
            return root.value + max(root.left);
        }
        if (root.left == null && root.right != null) {
            return root.value + max(root.right);
        }

        int leftMax = max(root.left);
        int rightMax = max(root.right);
        return root.value + Math.max(leftMax, rightMax);
    }
}
