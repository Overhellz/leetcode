package com.github.rodiond26;

import java.util.ArrayList;
import java.util.List;

public class Task1768 {
}

class Solution5 {
    public String mergeAlternately(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1.length() > minLength) {
            result.append(word1.substring(minLength));
        }
        if (word2.length() > minLength) {
            result.append(word2.substring(minLength));
        }
        return result.toString();
    }
}

class Solution6 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}

class Solution7 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1;
                count++;
                continue;
            }
            if (flowerbed[i - 1] > 0) {
                continue;
            }
            if (flowerbed[i - 1] == 0 && flowerbed[i] > 0) {
                continue;
            }
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] > 0) {
                continue;
            }
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                count++;
            }

        }
        if (flowerbed.length >= 2 && flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            count++;
        }
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            count++;
        }
        return count >= n;
    }

    public static void main(String[] args) {
        Solution7 s = new Solution7();
        int[] flowerbed = {1, 0, 0, 0, 1, 0, 0};
        boolean r = s.canPlaceFlowers(flowerbed, 2);
        System.out.println(r);
    }
}

class Solution8 {
    String vowels = "aeiouAEIOU";

    public String reverseVowels(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                len++;
            }
        }

        char[] chars = new char[len];
        int index = len - 1;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                chars[index] = s.charAt(i);
                index--;
            }
        }

        index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                result.append(chars[index]);
                index++;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    boolean isVowel(char ch) {
        return vowels.indexOf(ch) != -1;
    }
}

class Solution9 {
    public String reverseWords(String s) {
        String[] parts = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = parts.length - 1; i > 0; i--) {
            result.append(parts[i]).append(" ");
        }
        result.append(parts[0]);
        return result.toString().trim();
    }
}

class Solution10 {
    public int compress(char[] chars) {
        if (chars.length <= 1) {
            return chars.length;
        }

        StringBuilder result = new StringBuilder();
        char currentChar = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (currentChar == chars[i]) {
                count++;
                continue;
            }

            result.append(currentChar);
            if (count > 1) {
                result.append(count);
            }

            currentChar = chars[i];
            count = 1;
        }

        result.append(currentChar);
        if (count > 1) {
            result.append(count);
        }

        for (int i = 0; i < result.toString().length(); i++) {
            chars[i] = result.charAt(i);
        }

        System.out.println(result);
        return result.toString().length();
    }

    public static void main(String[] args) {
        Solution10 s = new Solution10();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] chars2 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int result = s.compress(chars);
        System.out.println(result);
        int result2 = s.compress(chars2);
        System.out.println(result2);
    }
}

class Solution11_2 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        for (int i = 0; i < nums.length-2; i++) {
            if ((nums[i]< nums[i+1]) && (nums[i + 1] < nums[i + 2])) {
                return true;
            }
        }
        return false;
    }
}