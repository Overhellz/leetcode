package com.github.rodiond26.binary_tree.bfs;

import com.github.rodiond26.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution20250919 {
}

class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = deque.removeFirst();
                levelList.add(node.val);
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
            }

            resultList.add(levelList);
        }

        return resultList;
    }
}

class Solution515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            List<Integer> levelList = new ArrayList<>();
            int max = deque.peekFirst().val;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = deque.removeFirst();
                max = Math.max(max, node.val);

                levelList.add(node.val);
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
            }
            result.add(max);
        }
        return result;
    }
}

class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);

        while (!deque.isEmpty()) {
            int levelSize = deque.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = deque.removeFirst();
                if (i == levelSize - 1) {
                    result.add(node.val);
                }
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
            }
        }
        return result;
    }
}

class Solution117 {
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
