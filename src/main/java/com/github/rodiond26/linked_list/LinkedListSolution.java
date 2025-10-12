package com.github.rodiond26.linked_list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedListSolution {
}

class Solution141_1 {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, ListNode> map = new HashMap<>();
        return hasCycle(head, map);
    }

    private boolean hasCycle(ListNode head, Map<ListNode, ListNode> map) {
        if (head == null || head.next == null) {
            return false;
        }
        if (map.containsKey(head)) {
            return true;
        } else {
            map.put(head, head.next);
            return hasCycle(head.next, map);
        }
    }
}

class Solution141_2 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        return hasCycle(head, set);
    }

    private boolean hasCycle(ListNode head, Set<ListNode> set) {
        if (head == null || head.next == null) {
            return false;
        }
        if (set.contains(head)) {
            return true;
        } else {
            set.add(head);
            return hasCycle(head.next, set);
        }
    }
}

class Solution141_3_correct {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode first = head;
        ListNode second = head;
        while (true) {
            if (second.next == null || second.next.next == null) {
                return false;
            }
            if (second.next == first) {
                return true;
            }
            first = first.next;
            second = second.next.next;
        }
    }
}
