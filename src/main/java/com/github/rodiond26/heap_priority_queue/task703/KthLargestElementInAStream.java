package com.github.rodiond26.heap_priority_queue.task703;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class KthLargestElementInAStream {
}

class KthLargest {
    private List<Integer> list;
    private final int k;
    private int kth;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.list = new ArrayList<>() ;
        for (int num : nums) {
            this.list.add(num);
        }
    }

    public int add(int val) {
        if (list.isEmpty()) {
            list.add(val);
        }
        list.add(val);
        Collections.sort(list);
        Collections.reverse(list);
        if (list.size() > k) {
            list = list.subList(0, k);
        }
        return list.get(k - 1);
    }
}
