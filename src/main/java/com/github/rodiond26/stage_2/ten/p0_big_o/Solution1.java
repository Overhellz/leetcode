package com.github.rodiond26.stage_2.ten.p0_big_o;

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int toFindValue = target - current;
            if (numsMap.containsKey(toFindValue)) {
                return new int[]{i, numsMap.get(toFindValue)};
            } else {
                numsMap.put(current, i);
            }
        }
        return null;
    }
}
