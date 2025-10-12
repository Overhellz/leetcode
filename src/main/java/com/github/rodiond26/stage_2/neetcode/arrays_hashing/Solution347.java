package com.github.rodiond26.stage_2.neetcode.arrays_hashing;

import java.util.HashMap;
import java.util.Map;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map.entrySet().stream()
                .map(entry -> new int[]{entry.getKey(), entry.getValue()})
                .sorted((arr1, arr2) -> Integer.compare(arr2[1], arr1[1]))
                .limit(k)
                .mapToInt(arr -> arr[0])
                .toArray();
    }
}
