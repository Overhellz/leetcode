package com.github.rodiond26.yandex.practicum.tree;

public class TaskD {

    public boolean isAnagram(Node root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(Node left, Node right) {
        if (left == null & right == null) {
            return true;
        }
        if (left == null || right == null || left.value != right.value) {
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
