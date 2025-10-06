package com.github.rodiond26.yandex.prepare.interview_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                }
                if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
                System.out.println("i = " + i);
                System.out.println("left = " + left);
                System.out.println("right = " + right);
            }
        }
        return result.stream().toList();
    }
}
