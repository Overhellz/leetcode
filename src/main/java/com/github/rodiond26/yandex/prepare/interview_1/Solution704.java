package com.github.rodiond26.yandex.prepare.interview_1;

public class Solution704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            System.out.println("left = " + left);
            System.out.println("right = " + right);
            System.out.println("middle = " + middle);
            System.out.println("----");

            if (target == nums[middle]) {
                return middle;
            }

            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution704 s = new Solution704();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int result = s.search(nums, 9);
        System.out.println("result = " + result);
    }
}
