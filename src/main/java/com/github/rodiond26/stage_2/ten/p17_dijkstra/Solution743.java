package com.github.rodiond26.stage_2.ten.p17_dijkstra;

import java.util.*;
import java.util.List;
import java.util.Map;

class Solution743 {
    public int networkDelayTime(int[][] times, int n, int k) {

        // Создаем граф в виде HashMap: узел -> список соседей с весами
        Map<Integer, List<int[]>> graph = new HashMap<>();

        // Инициализируем граф
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        // Заполняем граф
        for (int[] time : times) {
            int sourceNode = time[0];
            int targetNode = time[1];
            int nodeTime = time[2];
            graph.get(sourceNode).add(new int[]{targetNode, nodeTime});
        }

        // Массив для хранения минимальных расстояний
        int[] distances = new int[n + 1];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[k] = 0;

        // Приоритетная очередь для алгоритма Дейкстры
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int time = current[1];

            // Если нашли более короткий путь ранее, пропускаем
            if (time > distances[node]) {
                continue;
            }

            // Проверяем всех соседей
            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int nextTime = time + neighbor[1];

                if (nextTime < distances[nextNode]) {
                    distances[nextNode] = nextTime;
                    pq.offer(new int[]{nextNode, nextTime});
                }
            }
        }

        // Находим максимальное время доставки
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (distances[i] == Integer.MAX_VALUE) {
                return -1; // Не все узлы достижимы
            }
            maxTime = Math.max(maxTime, distances[i]);
        }

        return maxTime;
    }
}
