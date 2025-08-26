package com.github.rodiond26.linked_list.task206;

import com.github.rodiond26.linked_list.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
