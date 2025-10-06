package com.github.rodiond26.yandex.prepare.interview_1;

public class Solution896 {
    public boolean isMonotonic(int[] nums) {
        boolean isDecreasing = true;
        boolean isIncreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isIncreasing = false;
            } else if (nums[i] < nums[i + 1]) {
                isDecreasing = false;
            }
            if (!isIncreasing && !isDecreasing) {
                break;
            }
        }
        return isIncreasing || isDecreasing;
    }
}
