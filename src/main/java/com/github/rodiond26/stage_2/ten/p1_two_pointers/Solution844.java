package com.github.rodiond26.stage_2.ten.p1_two_pointers;

import java.util.Objects;

public class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        String str1 = backSpaceString(s);
        String str2 = backSpaceString(t);

        return Objects.equals(str1, str2);
    }

    private String backSpaceString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '#' && !sb.isEmpty()) {
                sb.deleteCharAt(sb.length() - 1);
            } else if (ch == '#') {
                continue;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
