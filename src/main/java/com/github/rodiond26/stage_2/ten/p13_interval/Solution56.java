package com.github.rodiond26.stage_2.ten.p13_interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            int[] prev = merged.getLast();

            if (current[0] <= prev[1]) {
                merged.getLast()[1] = Math.max(current[1], prev[1]);
            } else {
                merged.add(current);
            }
        }

        return merged.toArray(new int[0][]);
    }
}
