package com.github.rodiond26.stage_2.neetcode.stack;

import java.util.Set;
import java.util.Stack;

public class Solution150 {
    public int evalRPN(String[] tokens) {
        Set<String> operators = Set.of("+", "-", "*", "/");
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (!operators.contains(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int second = stack.pop();
                int first = stack.pop();

                if (token.equals("+")) {
                    int result = first + second;
                    stack.push(result);
                }
                if (token.equals("-")) {
                    int result = first - second;
                    stack.push(result);
                }
                if (token.equals("*")) {
                    int result = first * second;
                    stack.push(result);
                }
                if (token.equals("/")) {
                    int result = first / second;
                    stack.push(result);
                }
            }
        }

        return stack.pop();
    }
}
