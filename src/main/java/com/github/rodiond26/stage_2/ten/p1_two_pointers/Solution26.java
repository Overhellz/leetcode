package com.github.rodiond26.stage_2.ten.p1_two_pointers;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int first = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[first]) {
                continue;
            }
            first++;
            nums[first] = nums[i];
            count++;
        }

        return count;
    }
}
