package com.github.rodiond26.stage_2.neetcode.sliding_window;

import java.util.Arrays;

public class Solution567 {

    public boolean checkInclusion(String s1, String s2) {
        int hashS1 = countHash(s1);

        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            String str = s2.substring(i, i + s1.length());
            int hash = countHash(str);
            if (hashS1 == hash) {
                return true;
            }
        }
        return false;
    }

    public int countHash(String str) {
        int[] counts = new int[26];
        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }
        return Arrays.hashCode(counts);
    }
}
