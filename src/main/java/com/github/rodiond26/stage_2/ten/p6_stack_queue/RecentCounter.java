package com.github.rodiond26.stage_2.ten.p6_stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class RecentCounter {
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
