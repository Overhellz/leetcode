package com.github.rodiond26.stage_2.ten.p1_two_pointers;

public class Solution392 {
    public boolean isSubsequence(String s, String t) {

        int p = 0;

        if (s.length() == 0) {
            return true;
        }

        if (s.length() > t.length()) {
            return false;
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(p)) {
                p++;
            }
            if (p == s.length()) {
                return true;
            }
        }
        return false;
    }
}
