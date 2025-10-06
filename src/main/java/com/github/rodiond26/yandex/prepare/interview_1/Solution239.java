package com.github.rodiond26.yandex.prepare.interview_1;

import java.util.*;

public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = max(nums, i, i + k);
        }
        return result;
    }

    private int max(int[] nums, int start, int end) {
        int max = nums[start];
        for (int i = start + 1; i < nums.length && i < end; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}

class Solution239_2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int max = max(nums, k);
        result[0] = max;

        int j = 1;
        for (int i = k; i < result.length; i++) {
            result[j] = Math.max(result[j-1], nums[i]);
        }
        return result;
    }

    private int max(int[] nums, int k) {
        int max = nums[0];
        for (int i = 0; i < k; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}

class Solution239_3 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {

        }

        int j = 1;
        for (int i = k; i < result.length; i++) {
            result[j] = Math.max(result[j-1], nums[i]);
        }
        return result;
    }
}
