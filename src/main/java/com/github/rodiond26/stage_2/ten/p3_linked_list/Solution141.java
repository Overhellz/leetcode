package com.github.rodiond26.stage_2.ten.p3_linked_list;

public class Solution141 {
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
