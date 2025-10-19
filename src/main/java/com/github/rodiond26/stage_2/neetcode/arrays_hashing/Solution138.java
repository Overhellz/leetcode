package com.github.rodiond26.stage_2.neetcode.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

public class Solution138 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxConsecutiveLength = 0;
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                }
                maxConsecutiveLength = Math.max(maxConsecutiveLength, length);
            }
        }

        return maxConsecutiveLength;
    }
}
