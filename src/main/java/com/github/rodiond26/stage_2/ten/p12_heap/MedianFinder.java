package com.github.rodiond26.stage_2.ten.p12_heap;

import java.util.PriorityQueue;

class MedianFinder {
    private final PriorityQueue<Integer> leftMaxHeap;
    private final PriorityQueue<Integer> rightMinHeap;

    public MedianFinder() {
        leftMaxHeap = new PriorityQueue<>();
        rightMinHeap = new PriorityQueue<>();
    }

    // O(log n)
    public void addNum(int num) {
        leftMaxHeap.add(-num);
        int leftMax = leftMaxHeap.poll();
        rightMinHeap.add(-leftMax);
        if (rightMinHeap.size() > leftMaxHeap.size()) {
            int rightMax = -rightMinHeap.poll();
            leftMaxHeap.add(rightMax);
        }
    }

    // O(1)
    public double findMedian() {
        if (leftMaxHeap.size() > rightMinHeap.size()) {
            return -leftMaxHeap.peek();
        }
        return (-leftMaxHeap.peek() + rightMinHeap.peek()) / 2.0;
    }
}
