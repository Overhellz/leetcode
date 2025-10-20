package com.github.rodiond26.stage_2.ten.p6_stack_queue;

import java.util.Map;
import java.util.Stack;

public class Solution20 {
    private Map<Character, Character> brackets =
            Map.of(
                    '(', ')',
                    '{', '}',
                    '[', ']'
            );

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (brackets.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if (brackets.get(c) != ch) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
