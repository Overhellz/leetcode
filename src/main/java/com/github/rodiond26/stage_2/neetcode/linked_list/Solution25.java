package com.github.rodiond26.stage_2.neetcode.linked_list;

import com.github.rodiond26.stage_2.ten.p3_linked_list.ListNode;

public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode groupPrev = dummy;

        while (true) {
            ListNode kth = getKth(groupPrev, k);
            if (kth == null) {
                break;
            }

            ListNode groupNext = kth.next;

            // reverse group
            ListNode prev = kth.next;
            ListNode current = groupPrev.next;
            while (current != groupNext) {
                ListNode tmp = current.next;
                current.next = prev;
                prev = current;
                current = tmp;
            }

            ListNode tmp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = tmp;
        }

        return dummy.next;
    }

    private ListNode getKth(ListNode current, int k) {
        while (current != null && k > 0) {
            current = current.next;
            k--;
        }
        return current;
    }
}
