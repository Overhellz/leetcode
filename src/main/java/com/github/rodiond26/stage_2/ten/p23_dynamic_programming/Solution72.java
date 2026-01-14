package com.github.rodiond26.stage_2.ten.p23_dynamic_programming;

class Solution72 {

    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Базовые случаи
        // Пустая строка -> другая строка: нужно n вставок
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // вставка j символов
        }

        // Строка -> пустая строка: нужно m удалений
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // удаление i символов
        }

        // Заполняем таблицу
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // Символы совпадают, ничего не делаем
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Символы не совпадают, выбираем минимальную операцию:
                    // 1. Замена: dp[i-1][j-1] + 1
                    // 2. Удаление: dp[i-1][j] + 1
                    // 3. Вставка: dp[i][j-1] + 1
                    dp[i][j] = 1 + Math.min(
                            dp[i - 1][j - 1], // замена
                            Math.min(dp[i - 1][j], // удаление
                                    dp[i][j - 1]) // вставка
                    );
                }
            }
        }

        return dp[m][n];
    }
}
