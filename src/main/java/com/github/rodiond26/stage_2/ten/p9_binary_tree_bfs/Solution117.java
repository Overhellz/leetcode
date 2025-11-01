package com.github.rodiond26.stage_2.ten.p9_binary_tree_bfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution117 {
    public Node connect(Node root) {

        if (root == null) {
            return null;
        }

        Deque<Node> deque = new ArrayDeque<>();
        deque.push(root);

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            Node prev = null;
            for (int i = 0; i < levelSize; i++) {
                if (i == 0) {
                    prev = deque.removeFirst();
                    if (prev.left != null) {
                        deque.addLast(prev.left);
                    }
                    if (prev.right != null) {
                        deque.addLast(prev.right);
                    }
                } else {
                    Node current = deque.removeFirst();
                    prev.next = current;
                    prev = current;
                    if (current.left != null) {
                        deque.addLast(current.left);
                    }
                    if (current.right != null) {
                        deque.addLast(current.right);
                    }
                }
            }
        }

        return root;
    }
}

class Solution117_2 {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        Deque<Node> deque = new ArrayDeque<>();
        deque.push(root);

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            Node prev = null;
            Node current = null;
            for (int i = 0; i < levelSize; i++) {
                Node node = deque.removeFirst();
                if (i == 0) {
                    prev = node;
                } else {
                    current = node;
                    prev.next = current;
                    prev = current;
                }

                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
            }
        }

        return root;
    }
}
