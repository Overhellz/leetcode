package com.github.rodiond26;

import java.util.Arrays;
import java.util.Stack;

public class LeetCode1 {
}

class Solution11 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int[] arr = new int[10];
        int len = 0;
        for (int i = 0; i < 10; i++) {
            int a = x % 10;
            len++;
            arr[i] = a;
            x = x / 10;
            if (x == 0) {
                break;
            }
        }
        return isPalindrome(arr, len);
    }

    public boolean isPalindrome(int[] arr, int len) {
        for (int i = 0; i < arr.length && i < len; i++) {
            if (arr[i] != arr[len - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution11 s = new Solution11();
        s.isPalindrome(1);
        s.isPalindrome(11);
        s.isPalindrome(121);
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int currentValue = nums[0];
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentValue == nums[i]) {
                continue;
            }
            currentValue = nums[i];
            len++;
            nums[len] = currentValue;
        }
        len++;
        if (len < nums.length) {
            nums[len] = currentValue;
        }
        return len;
    }
}

class Solution12 {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }


    }
}

class Solution13 {
//    public int removeElement(int[] nums, int val) {
//        int len = 0;
//        int currentValue = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                len++;
//                currentValue = nums[i];
//                continue;
//            }
//
//        }
//    }
}

class Solution14 {
    public void reverseString(char[] s) {
        if (s.length < 2) {
            return;
        }

        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = temp;
            System.out.println(Arrays.toString(s));
        }
    }

    public static void main(String[] args) {
        Solution14 s = new Solution14();
        s.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
}

class Solution125 {
    public boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;
        char a;
        char b;
        while (start <= end) {
            a = s.charAt(start);
            b = s.charAt(end);

            if (isNotLetterOrDigit(a)) {
                start++;
                continue;
            }
            if (isNotLetterOrDigit(b)) {
                end--;
                continue;
            }
            if (isNotEqual(a, b)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    boolean isNotLetterOrDigit(char a) {
        return !Character.isLetterOrDigit(a) && !Character.isLetterOrDigit(a);
    }

    boolean isNotEqual(char a, char b) {
        return Character.toLowerCase(a) != Character.toLowerCase(b);
    }
}

class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int second = numbers.length - 1;
        while (first < second) {
            if (numbers[first] + numbers[second] == target) {
                return new int[]{first + 1, second + 1};
            }
            if (numbers[first] + numbers[second] > target) {
                second--;
                continue;
            }
            if (numbers[first] + numbers[second] < target) {
                first++;
            }
        }
        return new int[]{first + 1, second + 1};
    }
}

class Solution283 {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }

        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        for (int i = pos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums2 = {0};
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] nums4 = {1, 2, 3, 4, 5, 0};
        int[] nums5 = {1, 0};
        int[] nums6 = {0, 1};
        int[] nums7 = {0, 1, 0};
        Solution283 s = new Solution283();
        s.moveZeroes(nums);
        s.moveZeroes(nums2);
        s.moveZeroes(nums3);
        s.moveZeroes(nums4);
        s.moveZeroes(nums5);
        s.moveZeroes(nums6);
        s.moveZeroes(nums7);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
        System.out.println(Arrays.toString(nums5));
        System.out.println(Arrays.toString(nums6));
        System.out.println(Arrays.toString(nums7));
    }
}

class Solution392 {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }

        int pos = 0;
        for (int i = 0; i < t.length() && pos < s.length(); i++) {
            if (t.charAt(i) == s.charAt(pos)) {
                pos++;
            }
        }
        return pos == s.length();
    }
}

class Solution844 {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> sStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                sStack.push(s.charAt(i));
            } else {
                if (!sStack.isEmpty()) {
                    sStack.pop();
                }
            }
        }

        Stack<Character> tStack = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                tStack.push(t.charAt(i));
            } else {
                if (!tStack.isEmpty()) {
                    tStack.pop();
                }
            }
        }

        return sStack.equals(tStack);
    }
}

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (n == 0) {
//            return;
//        }
//
//        if (m == 0) {
//            for (int i = 0; i < nums2.length; i++) {
//                nums1[i] = nums2[i];
//            }
//            return;
//        }

        int pos1 = m - 1;
        int pos2 = n - 1;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (pos1 < 0) {
                nums1[i] = nums2[pos2];
                pos2--;
                continue;
            }
            if (pos2 < 0) {
                nums1[i] = nums1[pos1];
                pos1--;
                continue;
            }
            if (nums1[pos1] < nums2[pos2]) {
                nums1[i] = nums2[pos2];
                pos2--;
            } else {
                nums1[i] = nums1[pos1];
                pos1--;
            }
        }
    }
}
