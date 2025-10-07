package com.github.rodiond26.stage_2.ten.p1_two_pointers;

public class Solution125 {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return true;
        }

        String str = s.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
                continue;
            }
            if ((str.charAt(left) != str.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
