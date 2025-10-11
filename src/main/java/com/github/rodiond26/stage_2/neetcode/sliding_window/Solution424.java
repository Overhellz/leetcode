package com.github.rodiond26.stage_2.neetcode.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Solution424 {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            put(map, s.charAt(i));

            while (condition(map, s.charAt(start), k)) {
                remove(map, s.charAt(start));
                start++;
            }
            length = Math.max(length, i - start + 1);
        }
        return length;
    }

    private boolean condition(Map<Character, Integer> map, char base, int k) {
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() != base) {
                count += entry.getValue();
            }
        }
        return count > k;
    }

    private void put(Map<Character, Integer> map, char ch) {
        if (!map.containsKey(ch)) {
            map.put(ch, 1);
        } else {
            int count = map.get(ch);
            count++;
            map.put(ch, count);
        }
    }

    private void remove(Map<Character, Integer> map, char ch) {
        int count = map.get(ch);
        if (count > 1) {
            count--;
            map.put(ch, count);
        } else {
            map.remove(ch);
        }
    }
}

