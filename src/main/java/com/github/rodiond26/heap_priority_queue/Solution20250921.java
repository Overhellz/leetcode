package com.github.rodiond26.heap_priority_queue;

import java.util.PriorityQueue;

public class Solution20250921 {
}

class SolutionSolution1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int stone : stones) {
            pq.add(-stone);
        }

        while (!pq.isEmpty()) {
            int stone1 = pq.poll();
            if (!pq.isEmpty()) {
                int stone2 = pq.poll();
                int diff = stone1 - stone2;
                if (diff != 0) {
                    pq.add(-Math.abs(diff));
                }
            } else {
                return -stone1;
            }
        }
        if (pq.isEmpty()) {
            return 0;
        } else {
            return pq.poll();
        }
    }
}
