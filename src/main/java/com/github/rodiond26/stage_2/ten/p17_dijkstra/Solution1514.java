package com.github.rodiond26.stage_2.ten.p17_dijkstra;

import java.util.*;

class Solution1514 {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        // Граф: узел -> список [сосед, вероятность]
        Map<Integer, List<double[]>> graph = new HashMap<>();

        // Инициализируем граф
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        // Заполняем граф
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];

            graph.get(u).add(new double[]{v, prob});
            graph.get(v).add(new double[]{u, prob});
        }

        // Массив максимальных вероятностей
        double[] maxProb = new double[n];
        Arrays.fill(maxProb, 0.0);
        maxProb[start] = 1.0;

        // Приоритетная очередь для максимизации
        // Храним пары [узел, вероятность] для правильной проверки
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[1], a[1]));
        pq.offer(new double[]{start, 1.0});

        while (!pq.isEmpty()) {
            double[] current = pq.poll();
            int node = (int) current[0];
            double prob = current[1];

            // Правильная проверка: если текущая вероятность меньше
            // максимальной найденной для этого узла
            if (prob < maxProb[node]) {
                continue;
            }

            // Обрабатываем всех соседей
            for (double[] neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                int nextNode = (int) neighbor[0];
                double newProb = prob * neighbor[1];

                if (newProb > maxProb[nextNode]) {
                    maxProb[nextNode] = newProb;
                    pq.offer(new double[]{nextNode, newProb});
                }
            }
        }

        return maxProb[end];
    }
}
