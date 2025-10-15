package com.github.rodiond26.stage_2.neetcode.linked_list;

import com.github.rodiond26.stage_2.ten.p3_linked_list.ListNode;

public class Solution143 {
    public void reorderList(ListNode head) {

        // find second   
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;

        // reverse list from second   
        ListNode prev = null;
        slow.next = null;
        while (second != null) {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        // merge two linked list
        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }
}
