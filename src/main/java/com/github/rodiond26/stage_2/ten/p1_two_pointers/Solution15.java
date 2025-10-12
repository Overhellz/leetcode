package com.github.rodiond26.stage_2.ten.p1_two_pointers;

import java.util.*;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length-2; i++) {
            int target = nums[i];
            int left = i+1;
            int right = nums.length -1;

            while (left < right) {
                int sum = nums[left] + nums[right] + target  ;
                if (sum == 0) {
                    result.add(List.of(target, nums[left], nums[right]));
                    right--;
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

       return result.stream().toList();
    }
}
