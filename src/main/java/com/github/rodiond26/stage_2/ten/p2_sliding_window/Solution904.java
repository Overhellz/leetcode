package com.github.rodiond26.stage_2.ten.p2_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Solution904 {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int begin = 0;
        int result = 0;

        for (int i = 0; i < fruits.length; i++) {
            if (!basket.containsKey(fruits[i])) {
                basket.put(fruits[i], 1);
            } else {
                int fruitCount = basket.get(fruits[i]);
                fruitCount++;
                basket.put(fruits[i], fruitCount);
            }

            while (basket.size() > 2) {
                int fruitCount = basket.get(fruits[begin]);
                fruitCount--;
                basket.put(fruits[begin], fruitCount);
                if (fruitCount == 0) {
                    basket.remove(fruits[begin]);
                }
                begin++;
            }

            result = Math.max(result, i - begin + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution904 s = new Solution904();
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        int result = s.totalFruit(fruits);
        System.out.println("result = " + result);
    }
}
