package com.github.rodiond26.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution20250922 {
}

class Solution56 {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];

            if (nextInterval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(nextInterval[1], currentInterval[1]);
            } else {
                mergedIntervals.add(nextInterval);
                currentInterval = nextInterval;
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}

