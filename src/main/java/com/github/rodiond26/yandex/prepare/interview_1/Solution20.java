package com.github.rodiond26.yandex.prepare.interview_1;

import java.util.Map;
import java.util.Stack;

public class Solution20 {
    public boolean isValid(String s) {
        Map<Character, Character> parentheses = Map.of(
                '(', ')',
                '[', ']',
                '{', '}'
        );

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() && !parentheses.containsKey(c)) {
                return false;
            }
            if (parentheses.containsKey(c)) {
                stack.push(c);
                continue;
            } else {
                char ch = stack.peek();
                if (parentheses.get(ch) == c) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
