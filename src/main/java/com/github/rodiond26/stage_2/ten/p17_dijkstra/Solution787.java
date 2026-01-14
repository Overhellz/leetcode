package com.github.rodiond26.stage_2.ten.p17_dijkstra;

import java.util.*;

class Solution787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Граф: узел -> список [сосед, цена]
        Map<Integer, List<int[]>> graph = new HashMap<>();

        // Инициализируем граф
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        // Заполняем граф
        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int price = flight[2];
            graph.get(from).add(new int[]{to, price});
        }

        // Массив для хранения минимальных цен с учетом остановок
        // dist[node][stops] = минимальная цена до node с stops остановками
        int[][] dist = new int[n][k + 2];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        dist[src][0] = 0;

        // Приоритетная очередь: [цена, узел, остановки]
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, src, 0}); // [цена, узел, использованные остановки]

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int price = current[0];
            int node = current[1];
            int stops = current[2];

            // Если достигли конечного узла
            if (node == dst) {
                return price;
            }

            // Если использовали все доступные остановки
            if (stops > k) {
                continue;
            }

            // Проверяем всех соседей
            for (int[] neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                int nextNode = neighbor[0];
                int nextPrice = price + neighbor[1];

                // Если нашли более дешевый путь с текущим или меньшим количеством остановок
                if (nextPrice < dist[nextNode][stops + 1]) {
                    dist[nextNode][stops + 1] = nextPrice;
                    pq.offer(new int[]{nextPrice, nextNode, stops + 1});
                }
            }
        }

        // Проверяем все возможные пути до dst
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i <= k + 1; i++) {
            minPrice = Math.min(minPrice, dist[dst][i]);
        }

        return minPrice == Integer.MAX_VALUE ? -1 : minPrice;
    }
}
