package com.github.rodiond26;

public class LeetCode3 {
}

// 509. Fibonacci Number
class Solution509 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

// 66. Plus One
class Solution66 {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return digits;
        }

        digits[digits.length - 1] = digits[digits.length - 1] + 1;

        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i - 1] = digits[i - 1] + 1;
                digits[i] = 0;
            }
        }

        if (digits[0] == 10) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            digits[0] = 0;
            for (int i = 0; i < digits.length; i++) {
                newDigits[i + 1] = digits[i];
            }
            return newDigits;
        }
        return digits;
    }
}
