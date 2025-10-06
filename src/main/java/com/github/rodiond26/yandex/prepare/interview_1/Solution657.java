package com.github.rodiond26.yandex.prepare.interview_1;

public class Solution657 {
    public boolean judgeCircle(String moves) {

        int[] current = {0, 0};

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                current[0] = current[0] - 1;
            }
            if (moves.charAt(i) == 'R') {
                current[0] = current[0] + 1;
            }
            if (moves.charAt(i) == 'U') {
                current[1] = current[1] + 1;
            }
            if (moves.charAt(i) == 'D') {
                current[1] = current[1] - 1;
            }
        }
        return current[0] == 0 && current[1] == 0;
    }
}
