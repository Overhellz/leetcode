package com.github.rodiond26.linked_list.task21;

import com.github.rodiond26.linked_list.ListNode;

class Solution  {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode currentNode = new ListNode();
        if (list1.val <= list2.val) {
            currentNode.val = list1.val;
            currentNode.next = mergeTwoLists(list1.next, list2);
        } else {
            currentNode.val = list2.val;
            currentNode.next = mergeTwoLists(list1, list2.next);
        }
        return currentNode;
    }
}
