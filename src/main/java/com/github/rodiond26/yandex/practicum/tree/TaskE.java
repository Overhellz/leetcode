package com.github.rodiond26.yandex.practicum.tree;

public class TaskE {

    public boolean isTheSame(Node first, Node second) {
        if (first == null && second == null) {
            return true;
        }
        if (first != null && second == null) {
            return false;
        }
        if (first == null && second != null) {
            return false;
        }
        if (first.value == second.value) {
            return isTheSame(first.left, second.left) && isTheSame(first.right, second.right);
        }
        return false;
    }
}
