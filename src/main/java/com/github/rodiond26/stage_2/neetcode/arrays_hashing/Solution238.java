package com.github.rodiond26.stage_2.neetcode.arrays_hashing;

public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }

        int[] postfix = new int[nums.length];
        postfix[postfix.length - 1] = nums[nums.length - 1];
        for (int i = postfix.length - 2; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i];
        }

        int[] output = new int[nums.length];
        output[0] = postfix[1];
        for (int i = 1; i < output.length - 1; i++) {
            output[i] = prefix[i - 1] * postfix[i + 1];
        }
        output[output.length - 1] = prefix[prefix.length - 2];

        return output;
    }
}
