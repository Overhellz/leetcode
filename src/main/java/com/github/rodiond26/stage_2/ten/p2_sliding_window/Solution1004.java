package com.github.rodiond26.stage_2.ten.p2_sliding_window;

public class Solution1004 {
    public int longestOnes(int[] nums, int k) {

        int zeroCount = 0;
        int max = 0;
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[p] == 0) {
                    zeroCount--;
                }
                p++;
            }
            max = Math.max(max, i - p + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution1004 s = new Solution1004();
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        int result = s.longestOnes(nums, k);
        System.out.println("result = " + result);
    }
}
