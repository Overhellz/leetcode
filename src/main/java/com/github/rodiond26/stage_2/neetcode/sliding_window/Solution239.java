package com.github.rodiond26.stage_2.neetcode.sliding_window;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[right]) {
                deque.pollLast();
            }
            deque.addLast(right);

            if (deque.getFirst() < right - k + 1) {
                deque.pollFirst();
            }

            if (right >= k - 1) {
                result.add(nums[deque.getFirst()]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
