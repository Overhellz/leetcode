package com.github.rodiond26.stage_2.ten.p2_sliding_window;

public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;
        for (int i = 1; i <= nums.length - k; i++) {
            currentSum = currentSum - nums[i - 1] + nums[i + k - 1];
            maxSum = Math.max(maxSum, currentSum);
        }

        return (double) maxSum / k;
    }


    public static void main(String[] args) {
        Solution643 s = new Solution643();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = s.findMaxAverage(nums, k);
        System.out.println("result = " + result);
    }
}
