package com.github.rodiond26;

public class Solution3 {
}

class Solution555 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = dummy;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        while (true) {
            if (first == null) {
                second = second.next.next;
                break;
            }
            first = first.next;
            second = second.next;
        }

        return dummy.next;
    }
}
