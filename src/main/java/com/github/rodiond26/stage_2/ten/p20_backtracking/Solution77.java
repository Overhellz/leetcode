package com.github.rodiond26.stage_2.ten.p20_backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int start, int n, int k) {

        if (tempList.size() == k) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i <= n; i++) {
            tempList.add(i);
            backtrack(result, tempList, i + 1, n, k);
            tempList.removeLast();
        }
    }
}
