package com.github.rodiond26.stage_2.neetcode.linked_list;

import com.github.rodiond26.stage_2.ten.p3_linked_list.ListNode;

public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode();
        ListNode newRoot = current;
        ListNode l1Current = l1;
        ListNode l2Current = l2;

        int accum = 0;

        while (l1Current != null || l2Current != null) {
            if (l1Current != null) {
                accum += l1Current.val;
                l1Current = l1Current.next;
            }
            if (l2Current != null) {
                accum += l2Current.val;
                l2Current = l2Current.next;
            }
            if (accum > 9) {
                current.val = accum % 10;
                accum = accum / 10;
            } else {
                current.val = accum;
                accum = 0;
            }
            if (l1Current != null || l2Current != null || accum != 0) {
                current.next = new ListNode(accum);
                current = current.next;
            }
        }
        return newRoot;
    }
}
