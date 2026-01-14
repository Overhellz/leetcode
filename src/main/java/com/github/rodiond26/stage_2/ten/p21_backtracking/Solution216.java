package com.github.rodiond26.stage_2.ten.p21_backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution216 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result,
                           List<Integer> tempList,
                           int k,
                           int remaining,
                           int start) {

        if (tempList.size() == k && remaining == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        if (tempList.size() > k || remaining < 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            tempList.add(i);
            backtrack(result, tempList, k, remaining - i, i + 1);
            tempList.removeLast();
        }
    }
}
