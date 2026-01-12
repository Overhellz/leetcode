package com.github.rodiond26.stage_2.ten.p20_backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {

        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int num : nums) {

            if (tempList.contains(num)) {
                continue;
            }

            tempList.add(num);
            backtrack(result, tempList, nums);
            tempList.removeLast();
        }
    }
}
