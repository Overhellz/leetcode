package com.github.rodiond26.linked_list.task141;

import com.github.rodiond26.linked_list.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
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

class SolutionSet {
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
