package com.github.rodiond26.stack_queue;

import java.util.*;

public class Solution20250913 {
}

class Solution20 {
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

class Solution1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
                continue;
            }
            if (stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}

class Solution2390 {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*' && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}

class Solution71 {
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

class Solution933 {
}

class RecentCounter {
    private Deque<Integer> deque;

    public RecentCounter() {
        deque = new ArrayDeque<>();
    }

    public int ping(int t) {
        deque.add(t);

        while (true) {
            if (t - deque.peekFirst() > 3000) {
                deque.removeFirst();
            } else {
                break;
            }
        }
        return deque.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
