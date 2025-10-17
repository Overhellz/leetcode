package com.github.rodiond26.stage_2.neetcode.linked_list;

import java.util.HashMap;
import java.util.Map;

public class Solution138 {
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldToCopy = new HashMap<>();
        oldToCopy.put(null, null);

        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            oldToCopy.put(current, copy);
            current = current.next;
        }

        current = head;
        while (current != null) {
            Node copy = oldToCopy.get(current);
            copy.next = oldToCopy.get(current.next);
            copy.random = oldToCopy.get(current.random);
            current = current.next;
        }

        return oldToCopy.get(head);
    }
}
