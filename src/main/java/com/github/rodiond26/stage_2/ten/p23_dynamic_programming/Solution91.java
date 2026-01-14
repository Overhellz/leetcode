package com.github.rodiond26.stage_2.ten.p23_dynamic_programming;

class Solution91 {

    public int numDecodings(String s) {

        int n = s.length();

        if (n == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int[] dp = new int[n + 1];

        // Базовые случаи
        dp[0] = 1; // Пустая строка — 1 способ
        dp[1] = 1; // Первая цифра (не '0') — 1 способ

        for (int i = 2; i <= n; i++) {
            // Одна цифра
            int oneDigit = s.charAt(i - 1) - '0';
            if (oneDigit != 0) {
                dp[i] += dp[i - 1];
            }

            // Две цифры
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}
