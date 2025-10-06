package com.github.rodiond26.yandex.prepare.interview_1;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (map.containsKey(val)) {
                return new int[]{i, map.get(val)};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException();
    }
}
