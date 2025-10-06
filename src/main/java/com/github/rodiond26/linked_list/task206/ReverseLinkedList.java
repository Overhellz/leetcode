package com.github.rodiond26.linked_list.task206;

import com.github.rodiond26.linked_list.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode5 = new ListNode(5);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        solution.reverseList(listNode1);
        solution.reverseList(listNode2);
        solution.reverseList(listNode3);
        solution.reverseList(listNode4);
        solution.reverseList(listNode5);
    }
}
