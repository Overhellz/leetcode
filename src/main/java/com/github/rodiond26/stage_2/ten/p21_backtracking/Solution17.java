package com.github.rodiond26.stage_2.ten.p21_backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution17 {

    private static final String[] PHONE_MAP = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        for (int i = 0; i < digits.length(); i++) {
            char digit = digits.charAt(i);
            String letters = PHONE_MAP[digit - '0'];
            int size = queue.size();

            for (int j = 0; j < size; j++) {
                String current = queue.poll();
                for (char letter : letters.toCharArray()) {
                    queue.offer(current + letter);
                }
            }
        }

        result.addAll(queue);
        return result;
    }
}
