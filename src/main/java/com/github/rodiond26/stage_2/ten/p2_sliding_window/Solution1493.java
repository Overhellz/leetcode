package com.github.rodiond26.stage_2.ten.p2_sliding_window;

public class Solution1493 {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;
        int max = 0;
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[p] == 0) {
                    zeroCount--;
                }
                p++;
            }
            max = Math.max(max, i - p + 1);
        }
        return max - 1;
    }
}
