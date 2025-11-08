package com.github.rodiond26;

import java.util.Arrays;

public class Soulition2 {
}

class Solution3477 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (baskets[j] == 0) {
                    continue;
                }
                if (fruits[i] <= baskets[j]) {
                    baskets[j] = 0;
                    count++;
                }
                i++;
//                System.out.println(Arrays.toString(fruits));
                System.out.println(Arrays.toString(baskets));
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution3477 s = new Solution3477();
        int[] fruits = {4, 2, 5};
        int[] baskets = {3, 5, 4};
        int result = s.numOfUnplacedFruits(fruits, baskets);
        System.out.println(result);
    }
}

class Solution3477_2 {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if (baskets[j] != 0 && fruits[i] <= baskets[j]) {
                    baskets[j] = 0;
                    j = baskets.length;
                }
            }
        }
        int count = 0;
        for (int basket : baskets) {
            if (basket != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution3477_2 s = new Solution3477_2();
        int[] fruits = {4, 2, 5};
        int[] baskets = {3, 5, 4};
        int result = s.numOfUnplacedFruits(fruits, baskets);
        System.out.println(result);
    }
}

class Solution1488888 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].isEmpty()) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        int len = 0;
        for (int i = 0; i < strs[0].length() - 1 && strs[i].length() > i; i++) {
            if (strs[i].charAt(len) != strs[i + 1].charAt(len)) {
                break;
            }
            len++;
        }
        return strs[0].substring(0, len);
    }
}
