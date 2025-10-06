package com.github.rodiond26;

import java.util.HashMap;
import java.util.Map;

public class LeetCode2 {
}

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ramsonNotes = new HashMap<>();
        Map<Character, Integer> magazines = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!ramsonNotes.containsKey(ransomNote.charAt(i))) {
                ramsonNotes.put(ransomNote.charAt(i), 0);
            }
            int count = ramsonNotes.get(ransomNote.charAt(i));
            count++;
            ramsonNotes.put(ransomNote.charAt(i), count);
        }

        for (int i = 0; i < magazine.length(); i++) {
            if (!magazines.containsKey(magazine.charAt(i))) {
                magazines.put(magazine.charAt(i), 0);
            }
            int count = magazines.get(magazine.charAt(i));
            count++;
            magazines.put(magazine.charAt(i), count);
        }

        for (Map.Entry<Character, Integer> entry : ramsonNotes.entrySet()) {
            if (!magazines.containsKey(entry.getKey())) {
                return false;
            }
            if (magazines.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}

class Solution278 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int middle = 0;

        while (left < right) {
            middle = left + (right - left) / 2;
            if (isBadVersion(middle)) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    boolean isBadVersion(int version) {
        return version >= 1702766719;
    }

    public static void main(String[] args) {
        Solution278 s = new Solution278();
        int n = 2126753390;
        s.firstBadVersion(n);
    }
}

class Solution1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return "";
        }

        int index = 0;
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                index++;
            } else {
                break;
            }
        }
        return str1.substring(0, index);
    }
}
