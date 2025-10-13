package com.github.rodiond26.stage_2.ten.p3_linked_list;

import java.util.ArrayList;
import java.util.List;

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode middle = middleNode(head);
        ListNode second = reverseList(middle);

        while (head != null && second != null) {
            if (head.val != second.val) {
                return false;
            }
            head = head.next;
            second = second.next;
        }

        return true;
    }

    private ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }
        return prev;
    }
}

class Solution234_2 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode current = head;

        List<Integer> list = new ArrayList<>();
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
