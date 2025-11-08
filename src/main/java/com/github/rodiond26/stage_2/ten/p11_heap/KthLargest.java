package com.github.rodiond26.stage_2.ten.p11_heap;

import java.util.PriorityQueue;

public class KthLargest {

    private final PriorityQueue<Integer> minHeap;
    private final int kth;

    public KthLargest(int k, int[] nums) {
        this.minHeap = new PriorityQueue<>();
        this.kth = k;

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }

    public int add(int val) {
        minHeap.add(val);
        while (minHeap.size() > kth) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
