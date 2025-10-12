package com.github.rodiond26.stage_2.ten.p1_two_pointers;

public class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        for (int i = result.length - 1; i >= 0; i--) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (rightSquare > leftSquare) {
                result[i] = rightSquare;
                right--;
            } else {
                result[i] = leftSquare;
                left++;
            }
        }

        return result;
    }
}
