package com.github.rodiond26.stage_2.neetcode.stack;

import java.util.Arrays;
import java.util.Stack;

public class Solution853 {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (arr1, arr2) -> Integer.compare(arr2[0], arr1[0]));

        Stack<Double> stack = new Stack<>();
        for (int[] pair : pairs) {
            stack.push((double) (target - pair[0]) / pair[1]);
            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }
        return stack.size();
    }
}
