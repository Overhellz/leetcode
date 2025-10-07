package com.github.rodiond26.stage_2.yandex.easy;

import java.util.ArrayDeque;

public class Solution933 {
}

class RecentCounter {

    private ArrayDeque<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        int interval = 3000;
        queue.add(t);
        while (true) {
            int first = queue.peekFirst();
            if (t - first > interval) {
                queue.removeFirst();
            } else {
                break;
            }
        }
        return queue.size();
    }
}
