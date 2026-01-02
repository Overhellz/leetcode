package com.github.rodiond26.stage_2.ten.p14_graph_intro;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution133 {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> seen = new HashMap<>();
        seen.put(node, new Node(node.val));

        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            for (Node neighbor : current.neighbors) {
                if (!seen.containsKey(neighbor)) {
                    seen.put(neighbor, new Node(neighbor.val));
                    stack.push(neighbor);
                }
                seen.get(current).neighbors.add(seen.get(neighbor));
            }
        }

        return seen.get(node);
    }
}
