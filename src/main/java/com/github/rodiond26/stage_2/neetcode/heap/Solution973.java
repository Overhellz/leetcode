package com.github.rodiond26.stage_2.neetcode.heap;

import java.util.PriorityQueue;

class Solution973 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Position> positionMinHeap = new PriorityQueue<>();
        for (int[] point : points) {
            Position position = new Position(point[0], point[1]);
            positionMinHeap.add(position);
        }

        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) {
            Position position = positionMinHeap.poll();
            result[i] = new int[]{position.x, position.y};
        }
        return result;
    }
}

class Position implements Comparable<Position> {
    int x;
    int y;
    double distance;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = computeDistance(x, y);
    }

    private double computeDistance(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public int compareTo(Position other) {
        return Double.compare(this.distance, other.distance);
    }
}
