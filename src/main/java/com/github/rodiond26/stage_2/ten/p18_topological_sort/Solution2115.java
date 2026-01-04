package com.github.rodiond26.stage_2.ten.p18_topological_sort;

import java.util.*;

class Solution2115 {

    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {

        List<String> result = new ArrayList<>();

        // Множество доступных ингредиентов
        Set<String> available = new HashSet<>(Arrays.asList(supplies));

        // Граф зависимостей: рецепт -> список его ингредиентов
        Map<String, List<String>> graph = new HashMap<>();

        // Счетчик зависимостей для каждого рецепта
        Map<String, Integer> indegree = new HashMap<>();

        // Инициализация графа и счетчиков
        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            List<String> ingList = ingredients.get(i);

            // Считаем сколько ингредиентов пока отсутствуют
            int count = 0;
            for (String ing : ingList) {
                if (!available.contains(ing)) {
                    count++;
                }
            }

            indegree.put(recipe, count);

            // Добавляем зависимости в граф
            for (String ing : ingList) {
                if (!available.contains(ing)) {
                    graph.putIfAbsent(ing, new ArrayList<>());
                    graph.get(ing).add(recipe);
                }
            }
        }

        // Очередь для топологической сортировки
        Queue<String> queue = new LinkedList<>();

        // Добавляем рецепты, которые можно приготовить сразу
        for (String recipe : recipes) {
            if (indegree.get(recipe) == 0) {
                queue.offer(recipe);
                result.add(recipe);
            }
        }

        // Обрабатываем очередь
        while (!queue.isEmpty()) {
            String current = queue.poll();

            // Если у этого рецепта есть зависимости на другие рецепты
            if (graph.containsKey(current)) {
                for (String dependentRecipe : graph.get(current)) {
                    // Уменьшаем счетчик зависимостей
                    indegree.put(dependentRecipe, indegree.get(dependentRecipe) - 1);

                    // Если все зависимости удовлетворены
                    if (indegree.get(dependentRecipe) == 0) {
                        queue.offer(dependentRecipe);
                        result.add(dependentRecipe);
                    }
                }
            }
        }

        return result;
    }
}
