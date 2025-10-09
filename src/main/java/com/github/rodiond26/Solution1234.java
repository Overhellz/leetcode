package com.github.rodiond26;

public class Solution1234 {
}

class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = nums[left];
        int len = 0;

        while (true) {
            if (sum < target) {
                right++;
                if (right >= nums.length) {
                    break;
                }
                sum += nums[right];
            } else {
                if (len == 0) {
                    len = right + 1 - left;
                }
                len = Math.min(right + 1 - left, len);

                sum -= nums[left];
                left++;
            }
        }

        return len;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;

        while (true) {
            if (second == null) {
                break;
            }

            first = first.next;

            second = second.next;
            if (second == null) {
                break;
            }
            second = second.next;
            if (second == null) {
                break;
            }
        }
        return first;
    }
}

class Solution2095 {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode dummy = new ListNode(0, head);

        ListNode preMiddle = dummy;
        ListNode second = head.next;

        while (true) {
            if (second == null) {
                break;
            }

            preMiddle = preMiddle.next;

            second = second.next;
            if (second == null) {
                break;
            }
            second = second.next;
            if (second == null) {
                break;
            }
        }

        preMiddle.next = preMiddle.next.next;
        return head;
    }
}
