package com.github.rodiond26.stage_2.ten.p16_graph;

import java.util.*;

class Solution752 {
    public int openLock(String[] deadends, String target) {
        String start = "0000";
        if (target.equals(start)) {
            return 0;
        }

        Set<String> seen = new HashSet<>(Arrays.asList(deadends));
        if (seen.contains(target) || seen.contains(start)) {
            return -1;
        }

        Queue<String> queue = new ArrayDeque<>();
        queue.add(start);
        seen.add(start);
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            count++;

            for (int j = 0; j < size; j++) {
                String currentString = queue.poll();

                for (int i = 0; i < 4; i++) {
                    char original = currentString.charAt(i);
                    char upChar = toUpChar(original);
                    String upString = currentString.substring(0, i) + upChar + currentString.substring(i + 1);
                    if (upString.equals(target)) {
                        return count;
                    }
                    if (!seen.contains(upString)) {
                        seen.add(upString);
                        queue.add(upString);
                    }

                    char downChar = toDownChar(original);
                    String downString = currentString.substring(0, i) + downChar + currentString.substring(i + 1);
                    if (downString.equals(target)) {
                        return count;
                    }
                    if (!seen.contains(downString)) {
                        seen.add(downString);
                        queue.add(downString);
                    }
                }
            }
        }
        return -1;
    }

    private char toUpChar(char original) {
        return original == '9' ? '0' : (char) (original + 1);
    }

    private char toDownChar(char original) {
        return original == '0' ? '9' : (char) (original - 1);
    }
}
