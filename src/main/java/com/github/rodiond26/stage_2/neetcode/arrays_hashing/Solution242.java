package com.github.rodiond26.stage_2.neetcode.arrays_hashing;

import java.util.Arrays;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        int sHash = countHash(s);
        int tHash = countHash(t);
        return sHash == tHash;
    }

    public int countHash(String str) {
        int[] counts = new int[26];
        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }
        return Arrays.hashCode(counts);
    }
}
