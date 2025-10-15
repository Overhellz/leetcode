package com.github.rodiond26.stage_2.neetcode.linked_list;

import com.github.rodiond26.stage_2.ten.p3_linked_list.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        List<ListNode> list = new ArrayList<>(Arrays.asList(lists));

        while (list.size() > 1) {
            List<ListNode> mergedLists = new ArrayList<>();

            for (int i = 0; i < list.size(); i += 2) {
                ListNode list1 = list.get(i);
                ListNode list2;
                if (i + 1 < list.size()) {
                    list2 = list.get(i + 1);
                } else {
                    list2 = null;
                }
                ListNode merged2 = mergeTwoLists(list1, list2);
                mergedLists.add(merged2);
            }
            list = mergedLists;
        }
        return list.get(0);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }

            current = current.next;
        }

        if (p1 != null) {
            current.next = p1;
        }
        if (p2 != null) {
            current.next = p2;
        }

        return dummy.next;
    }
}
