package com.github.rodiond26.stage_2.ten.p12_heap;

import java.util.PriorityQueue;

public class Solution1962 {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxStonePriorityQueue = new PriorityQueue<>();
        for (int pile : piles) {
            maxStonePriorityQueue.add(-pile);
        }

        for (int i = 0; i < k; i++) {
            int currentStone = (int) Math.ceil(-maxStonePriorityQueue.poll() / 2.0);
            maxStonePriorityQueue.add(-currentStone);
        }

        int sum = 0;
        while (!maxStonePriorityQueue.isEmpty()) {
            sum += -maxStonePriorityQueue.poll();
        }
        return sum;
    }
}
