package com.github.rodiond26.yandex.prepare.interview_1;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> j = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            j.add(c);
        }

        int count = 0;
        for (char c : stones.toCharArray()) {
            if (j.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
