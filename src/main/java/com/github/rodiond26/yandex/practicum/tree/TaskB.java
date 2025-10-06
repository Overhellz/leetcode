package com.github.rodiond26.yandex.practicum.tree;

public class TaskB {

    public boolean isBalancedByHeight(Node node) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return true;
        }

        int leftHeight = maxHeight(node.left);
        int rightHeight = maxHeight(node.right);

        return Math.abs(leftHeight - rightHeight) <= 1;
    }

    public int maxHeight(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = 1 + maxHeight(node.left);
        int rightHeight = 1 + maxHeight(node.right);
        return Math.max(leftHeight, rightHeight);
    }
}
