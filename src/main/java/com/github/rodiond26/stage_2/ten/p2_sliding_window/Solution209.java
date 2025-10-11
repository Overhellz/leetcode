package com.github.rodiond26.stage_2.ten.p2_sliding_window;

public class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int begin = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        int windowSize;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                windowSize = i - begin + 1;
                len = Math.min(len, windowSize);
                sum -= nums[begin];
                begin++;
            }
        }

        return len > nums.length ? 0 : len;
    }
}
