package com.github.rodiond26.yandex.prepare.interview_1;

import java.util.ArrayList;
import java.util.List;

public class Solution155 {
}

class MinStack {

//    private List<Integer> stack;
//    private List<Integer> minStack;
//
//    public MinStack() {
//        stack = new ArrayList<>();
//        minStack = new ArrayList<>();
//    }
//
//    public void push(int val) {
//        stack.add(val);
//        if (minStack.isEmpty()) {
//            minStack.add(val);
//        } else {
//            int prevMin = minStack.getLast();
//            minStack.add(Math.min(val, prevMin));
//        }
//    }
//
//    public void pop() {
//        stack.removeLast();
//        minStack.removeLast();
//    }
//
//    public int top() {
//        return stack.get(stack.size() - 1);
//    }
//
//    public int getMin() {
//        return minStack.get(minStack.size() - 1);
//    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */