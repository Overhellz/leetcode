package com.github.rodiond26.sliding_window.task121;

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] == prices[i]) {
                continue;
            }
            if (prices[i] > minPrice) {
                maxProfit = Math.max(prices[i] - minPrice, maxProfit);
            } else {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
