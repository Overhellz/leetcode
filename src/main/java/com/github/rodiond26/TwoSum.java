package com.github.rodiond26;

import java.util.*;

public class TwoSum {
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException();
    }
}

class Solution2 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            if (price > minPrice) {
                maxProfit = Math.max(maxProfit, price - minPrice);
            } else {
                minPrice = price;
            }
        }
        return maxProfit;
    }
}

class Solution3999999 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}

class Solution_temp {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftArrayProduct(nums, i) * rightArrayProduct(nums, i);
        }
        return result;
    }

    int leftArrayProduct(int[] nums, int index) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length && i < index; i++) {
            int key = nums[i];
            if (!map.containsKey(key)) {
                map.put(key, 0);
            }
            int v = map.get(key) + 1;
            map.put(key, v);
        }
        return mapProduct(map);
    }

    int rightArrayProduct(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = index + 1; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
                continue;
            }
            int v = map.get(nums[i]) + 1;
            map.put(nums[i], v);
        }
        return mapProduct(map);
    }

    int mapProduct(Map<Integer, Integer> map) {
        int product = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                return 0;
            }
            product = product * (int) Math.pow(entry.getKey(), entry.getValue());
        }
        return product;
    }


    public static void main(String[] args) {
        Solution_temp s = new Solution_temp();
        int[] nums = {-1, 1, 0, -3, 3};

        int[] p = s.productExceptSelf(nums);
        System.out.println(Arrays.toString(p));

        int l0 = s.leftArrayProduct(nums, 0);
        int l1 = s.leftArrayProduct(nums, 1);
        int l2 = s.leftArrayProduct(nums, 2);
        int l3 = s.leftArrayProduct(nums, 3);
        int l4 = s.leftArrayProduct(nums, 4);
        System.out.println(l0);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
    }

    class Solution3 {

        public int[] productExceptSelf(int[] nums) {
            // Get the length of the input array
            int length = nums.length;
            // Initialize the answer array with the same length
            int[] result = new int[length];

            // Initialize 'leftProduct' to 1, to represent the product of elements to the left of the current index
            int leftProduct = 1;
            // Loop through the array from left to right
            for (int i = 0; i < length; i++) {
                // Set the current element in the result array to 'leftProduct'
                result[i] = leftProduct;
                // Multiply 'leftProduct' by the current element in nums for the next iteration (prefix product)
                leftProduct *= nums[i];
            }

            // Initialize 'rightProduct' to 1, to represent the product of elements to the right of the current index
            int rightProduct = 1;
            // Loop through the array from right to left
            for (int i = length - 1; i >= 0; i--) {
                // Multiply the current element in the result array by 'rightProduct'
                result[i] *= rightProduct;
                // Multiply 'rightProduct' by the current element in nums for the next iteration (suffix product)
                rightProduct *= nums[i];
            }

            // Return the final product except self array
            return result;
        }
    }
}
