package com.github.rodiond26;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode1 {
}

class Solution11 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int[] arr = new int[10];
        int len = 0;
        for (int i = 0; i < 10; i++) {
            int a = x % 10;
            len++;
            arr[i] = a;
            x = x / 10;
            if (x == 0) {
                break;
            }
        }
        return isPalindrome(arr, len);
    }

    public boolean isPalindrome(int[] arr, int len) {
        for (int i = 0; i < arr.length && i < len; i++) {
            if (arr[i] != arr[len - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        s.isPalindrome(1);
        s.isPalindrome(11);
        s.isPalindrome(121);
    }
}

