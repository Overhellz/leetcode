package com.github.rodiond26.stage_2.neetcode.sliding_window;

import java.util.*;

public class Solution76 {
    public String minWindow(String s, String t) {
        List<String> result = new ArrayList<>();
        int left = 0;
        int right = t.length();
        Map<Character, Integer> tMap = toMap(t);

        while (right <= s.length()) {
            String str = s.substring(left, right);
            Map<Character, Integer> strMap = toMap(str);

            if (areEqual(tMap, strMap)) {
                result.add(str);
                left++;
            } else {
                right++;
            }
        }

        return result.stream()
                .sorted(Comparator.comparingInt(String::length))
                .findFirst()
                .orElse("");
    }


    private boolean areEqual(Map<Character, Integer> first, Map<Character, Integer> second) {
        return first.entrySet()
                .stream()
                .allMatch(entry -> entry.getValue() <= second.getOrDefault(entry.getKey(), 0));
    }

    private Map<Character, Integer> toMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        return map;
    }

//    public static void main(String[] args) {
//        Solution76 solution = new Solution76();
//        String s = "ADOBECODEBANC";
//        String t = "ABC";
//        String result = solution.minWindow(s, t);
//        System.out.println("result = " + result);
//    }

}

class Solution76_2 {
    public String minWindow(String s, String t) {

        int[] tArr = new int[64];
        int[] sArr = new int[64];
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;

         String  result = "";

        for (int i = 0; i < t.length(); i++) {
            push(tArr, t.charAt(i));
        }

        while (right <= s.length()) {
            if (contains(sArr, tArr)) {
                String str = s.substring(left, right  );
                if (str.length() < min) {
                    min = str.length();
                    result = str;
                }
                pop(sArr, s.charAt(left));
                left++;
            } else {
                if (right < s.length()) {
                    push(sArr, s.charAt(right));
                }
                right++;
            }
        }

        return result ;
    }

    public void push(int[] arr, char ch) {
        arr[ch - 64]++;
    }

    public void pop(int[] arr, char ch) {
        arr[ch - 64]--;
    }

    public boolean contains(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution76_2 solution = new Solution76_2();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solution.minWindow(s, t);
        System.out.println("result = " + result);

        System.out.println(Integer.valueOf('A'));
    }
}
