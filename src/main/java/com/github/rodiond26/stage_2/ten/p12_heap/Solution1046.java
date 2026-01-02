package com.github.rodiond26.stage_2.ten.p12_heap;

import java.util.PriorityQueue;

class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxWeightPriorityQueue = new PriorityQueue<>();
        for (int stone : stones) {
            maxWeightPriorityQueue.add(-stone);
        }

        while (maxWeightPriorityQueue.size() > 1) {
            int first = -maxWeightPriorityQueue.poll();
            int second = -maxWeightPriorityQueue.poll();

            if (first != second) {
                maxWeightPriorityQueue.add(-(first - second));
            }
        }

        if (maxWeightPriorityQueue.isEmpty()) {
            return 0;
        }
        return -maxWeightPriorityQueue.poll();
    }
}
