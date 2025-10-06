package com.github.rodiond26.array;

import java.util.Objects;

public class Solution20250913 {
}

class Solution136 {
    public int singleNumber(int[] nums) {
        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            val = val ^ nums[i];
        }
        return val;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 2, 1, 2};
        Solution136 s = new Solution136();
        int result = s.singleNumber(array);
        System.out.println(result);


        int[] a = new int[] {1, 2, 3};
        System.out.println("Objects.hashCode(a) = " + Objects.hashCode(a));
        a[0] = 4;
        a[1] = 5;
        a[2] = 6;
        System.out.println("Objects.hashCode(a) = " + Objects.hashCode(a));
        System.out.println(a);
    }
}
