package com.github.rodiond26.stage_2.neetcode.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            put(map, s.charAt(i));

            while (map.containsKey(s.charAt(start))) {
                if (map.get(s.charAt(i)) == 1) {
                    break;
                }
                remove(map, s.charAt(start));
                start++;
            }
            max = Math.max(max, map.size());
        }
        return max;
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

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        String s = "pwwkew";
        int result = solution3.lengthOfLongestSubstring(s);
        System.out.println("result = " + result);
    }
}
