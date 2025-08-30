# 0. Big O

Сложность алгоритмов оценивается:

- по времени - сколько операций займет выполнение алгоритма в зависимости от входных данных,
- по памяти - сколько памяти потребуется при выполнении алгоритма.

Big O - это оценка алгоритма при худшем случае.

**Big O - это верхняя оценка сложности алгоритма в зависимости от входных данных.**

**Амортизационный анализ** - это средняя производительность операций в худшем случае на протяжении длинной
последовательности операций несмотря на то, что отдельные операции могут быть дорогими, можно посчитать, но большинство
операций дешевые.

* Big O Cheatsheet https://www.bigocheatsheet.com/
* Code Visualizer https://pythontutor.com/java.html#mode=edit
* Exercises https://exercism.org/tracks/java

---

# 1. Arrays And Strings

| Level | Name            | Link | Repeatable |
|:-----:|:----------------|:-----|:----------:|
| Easy  | 1. Two Sum      |      |            |
| Easy  | 167. Two Sum II |      |            |

---

# 2. Two Pointers

---

# 3. Sliding Window

---

# 4. Prefix Sum

---

# 5. Hash Map / Set

---

# 6. Stack

---

# 7. Queue

---

# 8. Linked List

Tasks:

- Easy
    - 141.Linked List Cycle

---

# 9. Binary Tree - DFS

---

# 10. Binary Tree - BFS

---

# Binary Search Tree

---

# Graphs - DFS

---

# Graphs - BFS

---

# Heap / Priority Queue

---

# Binary Search

---

# Backtracking

---

# DP - 1D

---

# DP - Multidimensional

---

# Bit Manipulation

---

# Trie

---

# Intervals

---

# Monotonic Stack

---

## Fast And Slow Pointers

---

# Binary Tree

Алгоритм решения в общем случае:

1. Рассмотреть пустой root.
2. Рассмотреть root с 2 двумя листьями.
3. Рассмотреть более сложный root.

## DFS

- Если нам нужны связи между родственниками, то берем DFS.
- Если нужна максимальная глубина дерева.

TODO: каркас DFS

## BFS

- Если нам нужны значения, то больше подойдет BFS.
- Если надо посмотреть по уровням.
- Можно потерять структуру дерева.

---

# Trie

---

# Priority Queue

leetcode Priority Queue - Binary Heap

# Min Heap

---

# Intervals

---
---

# Graph

V - вершина графа (нода, Node)
E - грань графа (Edge)
Connected Component - компонент связности
Сложность обхода: O(V+E) - важны как вершины, так и грани.
Сложность по памяти: O(V) - храним только вершины

- Цикличный
- Ацикличный

Indegree/Outdegree - ссылки на вершину и ссылки на другие вершины

Граф можно задачть с помощью:

- HashMap
- AL - Список смежности (например, [[0,1], [], [0,2]])

Обход графа с помощью DFS - используем стек: по одному пути ныряем ддо куда можем, а потом выныриваем.
Обход графа с помощью BFS - используем очередь: кладем в очередь, вытаскиваем и кладем новые вершины.

BFS:

- поиск кратчайшего пути

---

# 0 Big O

Задачи:

| Level | Name                  | Link                                                | Repeatable |
|:-----:|:----------------------|:----------------------------------------------------|:----------:|
| Easy  | 509. Fibonacci Number | https://leetcode.com/problems/fibonacci-number/     |            |
| Easy  | 66. Plus One          | https://leetcode.com/problems/plus-one/description/ |            |

      https://leetcode.com/problems/two-sum/description/

* Medium
    * https://leetcode.com/problems/spiral-matrix/description/

# 1 Two pointers

* https://leetcode.com/problems/reverse-string/description/
* https://leetcode.com/problems/valid-palindrome/
* https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
* https://leetcode.com/problems/3sum/description/
* https://leetcode.com/problems/squares-of-a-sorted-array/description/
* https://leetcode.com/problems/container-with-most-water/
* https://leetcode.com/problems/move-zeroes/description/
* https://leetcode.com/problems/is-subsequence/
* https://leetcode.com/problems/backspace-string-compare/
* https://leetcode.com/problems/merge-sorted-array/

# 16 Graphs

Introduction to the A* Algorithm from Red Blob Games:
https://www.redblobgames.com/pathfinding/a-star/introduction.html

Taxicab geometry:
https://en.wikipedia.org/wiki/Taxicab_geometry

Computer Scientists Establish the Best Way to Traverse a Graph:
https://www.quantamagazine.org/computer-scientists-establish-the-best-way-to-traverse-a-graph-20241025/

# 18 Topological sort

A Gentle Introduction to Graph Neural Networks:
https://distill.pub/2021/gnn-intro/

___

# Etc

## Visualizers

- TODO

## LeetCode Problem books

- LeetCode 75 https://leetcode.com/studyplan/leetcode-75/
- NeetCode 150 https://leetcode.com/problem-list/rr2ss0g5/
- Grind 75 https://leetcode.com/problem-list/rab78cw1/
- Grind 169 https://leetcode.com/problem-list/rabvlt31/
- Blind 75 https://leetcode.com/problem-list/oizxjoit/
