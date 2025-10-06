package com.github.rodiond26.dynamic;

public class Solution20251004 {
}

class Solution509 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }

        int[] cash = new int[n + 1];
        cash[0] = 0;
        cash[1] = 1;
        for (int i = 2; i <= n; i++) {
            cash[i] = cash[i - 1] + cash[i - 2];
        }

        return cash[n];
    }
}