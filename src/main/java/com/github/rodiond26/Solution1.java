package com.github.rodiond26;

import java.util.*;

public class Solution1 {
}

class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int pos = result.length - 1;

        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l > r) {
                result[pos] = l;
                left++;
            } else {
                result[pos] = r;
                right--;
            }
            pos--;
        }
        return result;
    }
}

class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int start = 0;
        int end = k - 1;
        int maxSum = sum;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            maxSum = sum;
        }
        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            maxSum = Math.max(sum, maxSum);
        }

        return (double) maxSum / k;
    }
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

class MyLinkedList {

    private int value;
    private MyLinkedList next;

    public MyLinkedList() {

    }

    public int get(int index) {
        int count = 0;
        MyLinkedList target = this;
        if (count == index) {
            return target.value;
        }

        return -1;

    }

    public void addAtHead(int val) {

    }

    public void addAtTail(int val) {

    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    set.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        Solution15 s = new Solution15();
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = s.threeSum(nums1);
        System.out.println(result1);

        int[] nums2 = {0, 1, 1};
        List<List<Integer>> result2 = s.threeSum(nums2);
        System.out.println(result2);

        int[] nums3 = {0, 0, 0};
        List<List<Integer>> result3 = s.threeSum(nums3);
        System.out.println(result3);
    }
}

class Solution11 {
//    public int maxArea(int[] height) {
//        int maxArea = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = height.length - 1; j >= 0 && i < j; j--) {
//                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
//            }
//        }
//        return maxArea;
//    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();

        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result1 = s.maxArea(height1);
        System.out.println(result1);

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
