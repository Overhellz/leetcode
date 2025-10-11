package com.github.rodiond26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

class MedianFinder {

    private final List<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        list.add(num);
    }

    public double findMedian() {
        if (list.isEmpty()) {
            return 0;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        Collections.sort(list); // NlogN
        int medianIndex = list.size() / 2;
        if (list.size() % 2 == 1) {
            return list.get(medianIndex);
        } else {
            return ((double) (list.get(medianIndex - 1) + list.get(medianIndex))) / 2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
class MedianFinder_2 {

    private final List<Integer> list;

    public MedianFinder_2() {
        list = new ArrayList<>(1024);
    }

    public void addNum(int num) {
        if (list.size() < 10) {
            list.add(num);
            Collections.sort(list);
            return;
        }

        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            if (num < list.get(left)) {
                list.add(left, num);
                break;
            }
            if (num > list.get(right)) {
                list.add(num);
                break;
            }
            if (num > list.get(left)) {
                left++;
                continue;
            }
            if (num < list.get(right)) {
                right--;
            }
        }
    }

    public double findMedian() {
        int medianIndex = list.size() / 2;
        if (list.size() % 2 == 1) {
            return list.get(medianIndex);
        } else {
            return ((double) (list.get(medianIndex - 1) + list.get(medianIndex))) / 2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */