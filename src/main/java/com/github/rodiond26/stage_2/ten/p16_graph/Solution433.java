package com.github.rodiond26.stage_2.ten.p16_graph;

import java.util.*;

class Solution433 {

    public int minMutation(String startGene, String endGene, String[] bank) {

        Set<String> geneBank = new HashSet<>(Arrays.asList(bank));

        if (!geneBank.contains(endGene)) {
            return -1;
        }

        char[] mutations = {'A', 'C', 'G', 'T'};

        Queue<String> queue = new ArrayDeque<>();
        queue.offer(startGene);

        Set<String> visited = new HashSet<>();
        visited.add(startGene);

        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String currentGene = queue.poll();

                if (currentGene.equals(endGene)) {
                    return steps;
                }

                char[] geneChars = currentGene.toCharArray();

                for (int j = 0; j < geneChars.length; j++) {
                    char originalChar = geneChars[j];

                    for (char mutation : mutations) {
                        if (mutation == originalChar) {
                            continue;
                        }

                        geneChars[j] = mutation;
                        String mutatedGene = new String(geneChars);

                        if (geneBank.contains(mutatedGene) && !visited.contains(mutatedGene)) {
                            queue.offer(mutatedGene);
                            visited.add(mutatedGene);
                        }
                    }

                    geneChars[j] = originalChar;
                }
            }

            steps++;
        }

        return -1;
    }
}
