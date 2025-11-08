package com.github.rodiond26.stage_2.ten.p11_heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution451 {
    public String frequencySort(String s) {
        Map<Character, Integer> mapCharToCount = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mapCharToCount.put(ch, mapCharToCount.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<CharCount> maxHeap = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : mapCharToCount.entrySet()) {
            CharCount charCount = new CharCount(entry.getKey(), entry.getValue());
            maxHeap.add(charCount);
        }

        StringBuilder sb = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            CharCount current = maxHeap.poll();
            sb.append(String.valueOf(current.ch).repeat(Math.max(0, current.count)));
        }
        return sb.toString();
    }
}

class CharCount implements Comparable<CharCount> {
    char ch;
    int count;

    public CharCount(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }

    @Override
    public int compareTo(CharCount other) {
        return Integer.compare(other.count, this.count);
    }
}
