package com.github.rodiond26.stage_2.neetcode.stack;

import java.util.Stack;

public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // pair: [temperature, index]

        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperature > stack.peek()[0]) {
                int[] pair = stack.pop();
                int tempIndex = pair[1];
                result[tempIndex] = i - tempIndex;
            }
            stack.push(new int[]{temperature, i});
        }
        return result;
    }
}
