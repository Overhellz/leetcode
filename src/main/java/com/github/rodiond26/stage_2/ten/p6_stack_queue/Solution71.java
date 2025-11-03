package com.github.rodiond26.stage_2.ten.p6_stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class Solution71 {
    public String simplifyPath(String path) {
        String[] input = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String str : input) {
            if (str.equals(".")) {
                continue;
            }
            if (str.equals("..")) {
                if (stack.size() == 1) {
                    continue;
                }
                if (stack.size() > 1) {
                    stack.pop();
                    stack.pop();
                }
                continue;
            }
            if (str.isEmpty()) {
                continue;
            }
            if (stack.isEmpty()) {
                stack.push("/");
            }
            if (!stack.peek().equals("/")) {
                stack.push("/");
            }
            stack.push(str);
        }
        if (stack.isEmpty()) {
            stack.push("/");
        }

        StringBuilder sb = new StringBuilder();
        for (String str : stack) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "/a/./b/../../c/";

        String[] input = str.split("/");
        System.out.println(Arrays.toString(input));
        Solution71 s = new Solution71();
        String result = s.simplifyPath(str);
        System.out.println(result);
    }
}
