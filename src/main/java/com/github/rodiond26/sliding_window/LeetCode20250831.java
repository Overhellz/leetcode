package com.github.rodiond26.sliding_window;

public class LeetCode20250831 {
}

class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0; // window state
        int beginIndex = 0;
        int endIndex = k - 1;

        int maxSum;

        for (int i = beginIndex; i <= endIndex; i++) {
            sum += nums[i];
        }
        maxSum = sum;

        while (endIndex < nums.length) {
            sum = sum - nums[beginIndex];
            beginIndex++;
            endIndex++;
            if (endIndex >= nums.length){
                break;
            }

            sum = sum + nums[endIndex];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}
