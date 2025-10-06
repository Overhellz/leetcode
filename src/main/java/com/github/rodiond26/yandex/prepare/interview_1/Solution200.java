package com.github.rodiond26.yandex.prepare.interview_1;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution200 {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.add(new int[]{i, j});

                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        if (isValid(current[0], current[1], grid)) {
                            grid[current[0]][current[1]] = '0';
                            queue.add(new int[]{current[0] - 1, current[1]});
                            queue.add(new int[]{current[0] + 1, current[1]});
                            queue.add(new int[]{current[0], current[1] - 1});
                            queue.add(new int[]{current[0], current[1] + 1});
                        }
                    }
                }
            }
        }
        return count;
    }

    private boolean isValid(int x, int y, char[][] grid) {
        return x >= 0 && x < grid.length
                && y >= 0 && y < grid[0].length
                && grid[x][y] == '1';
    }
}

/*
Binary Search

Search in Rotated Sorted Array (№ 33) - часто встречается на собеседованиях

Hash Table
Two Sum (№ 1) - самая базовая и популярная

Longest Substring Without Repeating Characters (№ 3) - проверяет понимание sliding window + hash table

Queue
Implement Queue using Stacks (№ 232) - проверяет понимание структур данных

Sliding Window Maximum (№ 239) - сложная, но популярная TODO



DFS

Validate Binary Search Tree (№ 98) - популярно на деревьях

BFS
Binary Tree Level Order Traversal (№ 102) - базовая BFS по дереву

Word Ladder (№ 127) - сложная BFS в графе

Two Pointers

Container With Most Water (№ 11) - классическая задача

Sliding Window
Longest Substring Without Repeating Characters (№ 3) - уже упоминалась, но ключевая для темы

Minimum Window Substring (№ 76) - сложная, но частый вопрос

Tree
Binary Tree Level Order Traversal (№ 102) - BFS по дереву

Serialize and Deserialize Binary Tree (№ 297) - проверяет глубокое понимание деревьев




 */