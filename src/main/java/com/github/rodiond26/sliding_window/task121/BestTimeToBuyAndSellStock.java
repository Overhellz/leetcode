package com.github.rodiond26.sliding_window.task121;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] task1 = new int[]{2, 4, 0};
        int[] task2 = new int[]{7, 1, 5, 3, 6, 4, 0, 3, 4, 0};

        System.out.println("task1=" + solution.maxProfit(task1));
        System.out.println("task2=" + solution.maxProfit(task2));
    }
}
