# LeetCode

---

# 0. Big O (Большое О)

Сложность алгоритмов оценивается:

- по времени - сколько операций займет выполнение алгоритма в зависимости от входных данных,
- по памяти - сколько памяти потребуется при выполнении алгоритма.

Big O - это оценка алгоритма при худшем случае.

**Big O - это верхняя оценка сложности алгоритма в зависимости от входных данных.**

**Амортизационный анализ** - это средняя производительность операций в худшем случае на протяжении длинной
последовательности операций несмотря на то, что отдельные операции могут быть дорогими, можно посчитать, но большинство
операций дешевые.

* Big O Cheatsheet https://www.bigocheatsheet.com/

---

# 1. Two Pointers (Два указателя)

3 типа задач:

* Указатели в начале и в конце.
* Указатели в начале, первый указатель бежит быстрее второго указателя.
* Указатели бегут параллельно в разных массивах.

| Level  | Name                                    | Link                                                               | Done | Repeatable |
|:------:|:----------------------------------------|:-------------------------------------------------------------------|:----:|:----------:|
|  Easy  | 344. Reverse String                     | https://leetcode.com/problems/reverse-string/                      | Done |            |
|  Easy  | 125. Valid Palindrome                   | https://leetcode.com/problems/valid-palindrome/                    | Done |            |
| Medium | 167. Two Sum II - Input Array Is Sorted | https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/    | Done |            |
| Medium | 15. 3Sum                                | https://leetcode.com/problems/3sum/                                | Done |            |
|  Easy  | 977. Squares of a Sorted Array          | https://leetcode.com/problems/squares-of-a-sorted-array/           | Done |            |
| Medium | 11. Container With Most Water           | https://leetcode.com/problems/container-with-most-water/           | Done |     *      |
|  Easy  | 26. Remove Duplicates from Sorted Array | https://leetcode.com/problems/remove-duplicates-from-sorted-array/ | Done |            |
|  Easy  | 283.Move Zeroes                         | https://leetcode.com/problems/move-zeroes/                         | Done |            |
|  Easy  | 392. Is Subsequence                     | https://leetcode.com/problems/is-subsequence/                      | Done |     *      |
|  Easy  | 844. Backspace String Compare           | https://leetcode.com/problems/backspace-string-compare/            | Done |            |
|  Easy  | 88. Merge Sorted Array                  | https://leetcode.com/problems/merge-sorted-array/                  | Done |            |

---

# 2. Sliding Window (Скользящее окно)

Необходимо хранить текущее состояние окна.

2 типа задач:

* Окно с фиксированным размером.
* Окно с изменяемым размером.

Нужно ответить на 2 вопроса:

* Что такое состояние окна?
* Как сжимать окно?

| Level  | Name                                                     | Link                                                                             | Done | Repeatable |
|:------:|:---------------------------------------------------------|:---------------------------------------------------------------------------------|:----:|:----------:|
|  Easy  | 643. Maximum Average Subarray I                          | https://leetcode.com/problems/maximum-average-subarray-i/                        | Done |            |
| Medium | 209. Minimum Size Subarray Sum                           | https://leetcode.com/problems/minimum-size-subarray-sum/                         | Done |     *      |
| Medium | 1004. Max Consecutive Ones III                           | https://leetcode.com/problems/max-consecutive-ones-iii/                          | Done |     *      |
| Medium | 1493. Longest Subarray of 1's After Deleting One Element | https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/ | Done |     *      |
| Medium | 904. Fruit Into Baskets                                  | https://leetcode.com/problems/fruit-into-baskets/                                | Done |     *      |

---

# 3. Linked List (Связный список)

Linked List (Связный список) - это набор Node (узлов), которые содержат в себе какие-то данные и связаны в цепочку.

Head - начало (голова) связного спика, tail - конец (хвост) списка.

Типовые задачи:

- найти середину Linked List,
- найти N-ноду в Linked List,
- реверс Linked List,
- слить два Linked List в один.

| Level  | Name                                          | Link                                                                   | Done | Repeatable |
|:------:|:----------------------------------------------|:-----------------------------------------------------------------------|:----:|:----------:|
| Medium | 707. Design Linked List                       | https://leetcode.com/problems/design-linked-list/                      | Done |    ***     |
|  Easy  | 876. Middle of the Linked List                | https://leetcode.com/problems/middle-of-the-linked-list/               | Done |     *      |
| Medium | 2095. Delete the Middle Node of a Linked List | https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/ | Done |     *      |
|  Easy  | 206. Reverse Linked List                      | https://leetcode.com/problems/reverse-linked-list/                     | Done |    ***     |
|  Easy  | 234. Palindrome Linked List                   | https://leetcode.com/problems/palindrome-linked-list/                  | Done |     *      |
|  Easy  | 83. Remove Duplicates from Sorted List        | https://leetcode.com/problems/remove-duplicates-from-sorted-list/      | Done |     *      |
| Medium | 19. Remove Nth Node From End of List          | https://leetcode.com/problems/remove-nth-node-from-end-of-list/        | Done |    ***     |
| Medium | 24. Swap Nodes in Pairs                       | https://leetcode.com/problems/swap-nodes-in-pairs/                     | Done |     *      |
|  Easy  | 21. Merge Two Sorted Lists                    | https://leetcode.com/problems/merge-two-sorted-lists/                  | Done |     *      |
|  Easy  | 141. Linked List Cycle                        | https://leetcode.com/problems/linked-list-cycle/                       | Done |     *      |

---

# 4. Hash Map (Хеш-таблица)

- В основе работы структуры данных лежит использование хеш-функции.
- Коллизия - в одном бакете несколько значений.
- При изменении количества бакетов все значения перехешируются.
- Load Factor - процент заполнения текущих бакетов.

| Level | Name                | Link                                          | Done | Repeatable |
|:-----:|:--------------------|:----------------------------------------------|:----:|:----------:|
| Easy  | 706. Design HashMap | https://leetcode.com/problems/design-hashmap/ | Done |    ***     |

---

# 5. LRU

- LRU (Least Recently Used) - наименее недавно использованный элемент.
- При запросе элемента из кеша или добавлении нового элемента в кеш может удалиться из кеша элемент, который был
  наиболее давно использован.

| Level  | Name           | Link                                     | Done | Repeatable |
|:------:|:---------------|:-----------------------------------------|:----:|:----------:|
| Medium | 146. LRU Cache | https://leetcode.com/problems/lru-cache/ | Done |     *      |

---

# 6. Stack, Queue (Стек, очередь)

- Stack - LIFO
- Queue - однонаправленная очередь, представляет собой структуру данных, которая строится по принципу FIFO (
  first-in-first-out).
- Deque - двунаправленная очередь, которая может работать и как обычная однонаправленная очередь по принципу FIFO, и как
  Stack по принципу LIFO (last-in-first-out).

| Level  | Name                                           | Link                                                                    | Done | Repeatable |
|:------:|:-----------------------------------------------|:------------------------------------------------------------------------|:----:|:----------:|
|  Easy  | 20. Valid Parentheses                          | https://leetcode.com/problems/valid-parentheses/                        | Done |     *      |
|  Easy  | 1047. Remove All Adjacent Duplicates In String | https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/ | Done |     *      |
| Medium | 2390. Removing Stars From a String             | https://leetcode.com/problems/removing-stars-from-a-string/             | Done |     *      |
| Medium | 71. Simplify Path                              | https://leetcode.com/problems/simplify-path/                            | Done |            |
|  Easy  | 933. Number of Recent Calls                    | https://leetcode.com/problems/number-of-recent-calls/                   | Done |            |

---

# 7. Binary Tree, DFS (Двоичное дерево, DFS)

Двоичное дерево:

- `root` - голова
- `left leaf` и `right leaf` - листочки дерева
- `поддерево`
- `ветка` - от корня до листочка
- `уровни дерева`

`DFS` (Deep First Search) - **поиск в глубину** (ныряем максимально глубоко сначала в левую ветку, а потом в правую,
затем
всплываем и опять ныряем и т. д.).

- Сложность по вызовам - O(N)
- Сложность по памяти - O(N)
- Рекурсия с callstack решает за нас последовательность вызовов
- Если нам нужны связи между родственниками, то берем DFS.
- Если нужна максимальная глубина дерева.

* Обход двоичного дерева с помощью рекурсии:

```text
def dfs(node):
    if not node:
        return
    // print(node.val) => pre order
    dfs(node.left)
    // print(node.val) => in order
    dfs(node.right)
    // print(node.val) => post order
    return
```

* Обход двоичного дерева с помощью стека:

```text
def dfs(node):
    stack <- node
    
    while stack:
        node <- stack
        stack <- node.right
        stack <- node.left
        print(node.val)

    return
```

| Level | Name                              | Link                                                        | Done | Repeatable |
|:-----:|:----------------------------------|:------------------------------------------------------------|:----:|:----------:|
| Easy  | 104. Maximum Depth of Binary Tree | https://leetcode.com/problems/maximum-depth-of-binary-tree/ | Done |     *      |
| Easy  | 226. Invert Binary Tree           | https://leetcode.com/problems/invert-binary-tree/           | Done |    ***     |
| Easy  | 100. Same Tree                    | https://leetcode.com/problems/same-tree/                    | Done |     *      |
| Easy  | 101. Symmetric Tree               | https://leetcode.com/problems/symmetric-tree/               | Done |    ***     |
| Easy  | 112. Path Sum                     | https://leetcode.com/problems/path-sum/                     | Done |     *      |

---

# 8. Binary Search Tree (Двоичное дерево поиска, BST)

Алгоритм решения в общем случае:

1. Рассмотреть пустой root.
2. Рассмотреть root с 2 двумя листьями.
3. Рассмотреть более сложный root.

| Level  | Name                                  | Link                                                            | Done | Repeatable |
|:------:|:--------------------------------------|:----------------------------------------------------------------|:----:|:----------:|
|  Easy  | 700. Search in a Binary Search Tree   | https://leetcode.com/problems/search-in-a-binary-search-tree/   | Done |     *      |
| Medium | 701. Insert into a Binary Search Tree | https://leetcode.com/problems/insert-into-a-binary-search-tree/ | Done |     *      |
| Medium | 98. Validate Binary Search Tree       | https://leetcode.com/problems/validate-binary-search-tree/      | Done |     *      |
|  Easy  | 110. Balanced Binary Tree             | https://leetcode.com/problems/balanced-binary-tree/             | Done |     *      |

---

# 9. Binary Tree, BFS (Двоичное дерево, BFS)

BFS (Breadth First Search) - **поиск в ширину**.

- Рассматриваем дерево по слоям/этажам.
- Обход двоичного дерева с помощью очереди.
- Сложность по времени O(N) - обойти каждую ноду один раз.
- Сложность по памяти O(N) - в худшем случае будет лежать весь самый нижний этаж двоичного дерева = n/2.
- Если нам нужны значения, то больше подойдет BFS.
- Если надо посмотреть по уровням.
- Можно потерять структуру дерева.

```text
def bfs(node):
if not node:
return

    q = deque
    q.push(root)
    
    while q:
        level_size = len(q)
        for _ in range(level_size)
        node = q.popleft()
        q.push(node.left)
        q.push(node.right)
    return
```

| Level  | Name                                                | Link                                                                          | Done | Repeatable |
|:------:|:----------------------------------------------------|:------------------------------------------------------------------------------|:----:|:----------:|
| Medium | 102. Binary Tree Level Order Traversal              | https://leetcode.com/problems/binary-tree-level-order-traversal/              | Done |     *      |
| Medium | 515. Find Largest Value in Each Tree Row            | https://leetcode.com/problems/find-largest-value-in-each-tree-row/            | Done |            |
| Medium | 199. Binary Tree Right Side View                    | https://leetcode.com/problems/binary-tree-right-side-view/                    | Done |            |
| Medium | 117. Populating Next Right Pointers in Each Node II | https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/ | Done |     *      |
| Medium | 236. Lowest Common Ancestor of a Binary Tree        | https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/        | Done |    ***     |
| Medium | 1325. Delete Leaves With a Given Value              | https://leetcode.com/problems/delete-leaves-with-a-given-value/               | Done |    ***     |
| Medium | 1302. Deepest Leaves Sum                            | https://leetcode.com/problems/deepest-leaves-sum/                             | Done |            |
|  Easy  | 543. Diameter of Binary Tree                        | https://leetcode.com/problems/diameter-of-binary-tree/                        | Done |     *      |
| Medium | 103. Binary Tree Zigzag Level Order Traversal       | https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/       | Done |    ***     |

---

# 10. Trie, Autocomplete (Префиксное дерево)

- Trie - префиксное дерево
- Поиск происходит за O(N).
- Вставка происходит за O(N).

| Level  | Name                              | Link                                                      | Done | Repeatable |
|:------:|:----------------------------------|:----------------------------------------------------------|:----:|:----------:|
| Medium | 208. Implement Trie (Prefix Tree) | https://leetcode.com/problems/implement-trie-prefix-tree/ | Done |     *      |
| Medium | 1268. Search Suggestions System   | https://leetcode.com/problems/search-suggestions-system/  | Done |     *      |

---

# 11. Heap (Куча, Двоичная куча, Очередь с приоритетом), part 1

Priority Queue и Binary Heap

- Binary Heap - это одна из реализаций Priority Queue - ментально представляем себе дерево, а на самом деле это массив.

- Complete Binary Tree - пока не заполнен текущий этаж полностью, нельзя переходить на следующий этаж. Этаж должен
  заполняться слева направо.

- Виды Binary Heap:
    - **Max Heap** - значение в каждой ноде должно быть больше или равно значению в детях.
    - **Min Heap** - значение в каждой ноде должно быть меньше или равно значению в детях.

- В основе лежит массив:
- Значения i должны быть непрерывны и соответствовать формуле:
    - `i >= 2i + 1`
    - `i >= 2i + 2`

| Level  | Name                                 | Link                                                           | Done | Repeatable |
|:------:|:-------------------------------------|:---------------------------------------------------------------|:----:|:----------:|
| Medium | 215. Kth Largest Element in an Array | https://leetcode.com/problems/kth-largest-element-in-an-array/ |  *   |     *      |
|  Easy  | 703. Kth Largest Element in a Stream | https://leetcode.com/problems/kth-largest-element-in-a-stream/ |  *   |     *      |
| Medium | 347. Top K Frequent Elements         | https://leetcode.com/problems/top-k-frequent-elements/         |  *   |     *      |
| Medium | 451. Sort Characters By Frequency    | https://leetcode.com/problems/sort-characters-by-frequency/    |  *   |     *      |

---

# 11. Heap (Куча, Двоичная куча, Очередь с приоритетом), part 2

| Level  | Name                                      | Link                                                               | Done | Repeatable |
|:------:|:------------------------------------------|:-------------------------------------------------------------------|:----:|:----------:|
|  Easy  | 1046. Last Stone Weight                   | https://leetcode.com/problems/last-stone-weight/                   |      |            |
|  Hard  | 502. IPO                                  | https://leetcode.com/problems/ipo/                                 |      |            |
|  Hard  | 295. Find Median from Data Stream         | https://leetcode.com/problems/find-median-from-data-stream/        |      |            |
| Medium | 1962. Remove Stones to Minimize the Total | https://leetcode.com/problems/remove-stones-to-minimize-the-total/ |      |            |
|  Hard  | 23. Merge k Sorted Lists                  | https://leetcode.com/problems/merge-k-sorted-lists/                |      |            |

---

# 13. Intervals

- Смотрим в хронологическом порядке.
- Отсортировать по дате начала митинга.
- Начал следующего митинга происходит после окончания предыдущего интервала.

| Level  | Name                | Link                                           | Done | Repeatable |
|:------:|:--------------------|:-----------------------------------------------|:----:|:----------:|
| Medium | 56. Merge Intervals | https://leetcode.com/problems/merge-intervals/ | Done |            |
| Medium | 57. Insert Interval | https://leetcode.com/problems/insert-interval/ | TODO |            |
|        |                     |                                                |      |            |

---

# 14. Graph

Структура графа:

- V (vertex) - **вершина графа** (Node)
- E (edge) - **ребра графа** (Edge)

Виды графов:

- **направленный** (от одной вершины к другой) (directed).
- **ненаправленный** (undirected)

Connected Component - **компонент связности** - граф может состоять из компонент, которые могут быть друг с другом не
связаны (например, 2 треугольника, островное государство - государство, которое состояит из несвязанных островов).

Сложность обхода: O(V+E) - важны как вершины, так и грани.
Сложность по памяти: O(V) - храним только вершины

Граф может быть

- Цикличный
- Ацикличный

Indegree/Outdegree - ссылки на вершину и ссылки на другие вершины
Indegree - количество входов вершины
Outdegree - количество выходов из вершины

Граф можно задачть с помощью:

- HashMap <Вершина, Соседи>
- AL - Список смежности (например, [[0,1], [], [0,2]])
- Массива

Обход графа с помощью DFS - используем стек: по одному пути ныряем ддо куда можем, а потом выныриваем.
Обход графа с помощью BFS - используем очередь: кладем в очередь, вытаскиваем и кладем новые вершины.

BFS:

- поиск кратчайшего пути
- открыть замок с помощью комбинаций

| Level  | Name                                                         | Link                                                                                  | Done | Repeatable |
|:------:|:-------------------------------------------------------------|:--------------------------------------------------------------------------------------|:----:|:----------:|
| Medium | 752. Open the Lock                                           | https://leetcode.com/problems/open-the-lock/                                          |      |            |
| Medium | 433. Minimum Genetic Mutation                                | https://leetcode.com/problems/minimum-genetic-mutation/                               |      |            |
| Medium | 994. Rotting Oranges                                         | https://leetcode.com/problems/rotting-oranges/                                        |      |            |
| Medium | 2101. Detonate the Maximum Bombs                             | https://leetcode.com/problems/detonate-the-maximum-bombs/                             |      |            |
| Medium | 841. Keys and Rooms                                          | https://leetcode.com/problems/keys-and-rooms/                                         | Done |     *      |
|  Easy  | 1971. Find if Path Exists in Graph                           | https://leetcode.com/problems/find-if-path-exists-in-graph/                           | Done |            |
| Medium | 133. Clone Graph                                             | https://leetcode.com/problems/clone-graph/                                            | TODO |            |
| Medium | 1557. Minimum Number of Vertices to Reach All Nodes          | https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/          | Done |            |
| Medium | 547. Number of Provinces                                     | https://leetcode.com/problems/number-of-provinces/                                    | TODO |            |
| Medium | 200. Number of Islands                                       | https://leetcode.com/problems/number-of-islands/                                      | Done |            |
| Medium | 1466. Reorder Routes to Make All Paths Lead to the City Zero | https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/ | TODO |            |
| Medium | 695. Max Area of Island                                      | https://leetcode.com/problems/max-area-of-island/                                     | TODO |            |
| Medium | 2368. Reachable Nodes With Restrictions                      | https://leetcode.com/problems/reachable-nodes-with-restrictions/                      | TODO |            |
| Medium | 542. 01 Matrix                                               | https://leetcode.com/problems/01-matrix/                                              |      |            |

994
1129
1926



---

# 17. Dijkstra

Поиск кратчайшего пути

---

# 18. Topological sort

---

# 20. Backtracking

46
77


---

# 16. Dynamic Programming

Dynamic Programming

- Top Down - кеш в fib(n)
- Bottom Up -мМожно строить снизу вверх как в массиве.

Решение:

1. Найти основную зависимость решения - базовый случай.
2. Навешать кеш на пересекающиеся решения.
3. Раскуртиться от базового случая снизу вверх Bottom Up.
4. А зачем хранить все решения в кеше, если нужны только текущие.

| Level | Name                                                      | Link | Done | Repeatable |
|:-----:|:----------------------------------------------------------|:-----|:----:|:----------:|
|       | 509                                                       |      |      |            |
|       | 70                                                        |      |      |            |
|       | 746                                                       |      |      |            |
|       | 322                                                       |      |      |            |
|       | 198                                                       |      |      |            |
|       | 91 добавить кеш                                           |      |      |            |
|       | 62                                                        |      |      |            |
|       | 64                                                        |      |      |            |
|       | 72 Расстояние Левенштейна + добавить кеш  конспект отсюда |      |      |            |

---

# 0 Big O

Задачи:

| Level | Name         | Link                                    | Repeatable |
|:-----:|:-------------|:----------------------------------------|:----------:|
| Easy  | 66. Plus One | https://leetcode.com/problems/plus-one/ |            |

___

# Etc

https://leetcode.com/explore/learn/

* Code Visualizer https://pythontutor.com/java.html#mode=edit
* LRU Cache Visualizer https://lrucache.netlify.app/
* Trie (Prefix Tree) Visualizer https://www.cs.usfca.edu/~galles/visualization/Trie.html
* Exercises https://exercism.org/tracks/java

## LeetCode Problem books

- LeetCode 75 https://leetcode.com/studyplan/leetcode-75/
- NeetCode 150 https://leetcode.com/problem-list/rr2ss0g5/
- Grind 75 https://leetcode.com/problem-list/rab78cw1/
- Grind 169 https://leetcode.com/problem-list/rabvlt31/
- Blind 75 https://leetcode.com/problem-list/oizxjoit/
- Top 100 Liked https://leetcode.com/studyplan/top-100-liked/
- Top Interview 150 https://leetcode.com/studyplan/top-interview-150/

---

| #  | Lecture                     | Watched | Exercises |  
|:--:|:----------------------------|:-------:|:---------:| 
| 0  | Big O                       |         |           |         
| -- | --------------------------- | ------- | --------- |       
| 1  | Two Pointers                |  Done   |   Done    |          
| 2  | Sliding Window              |  Done   |   Done    |         
| 3  | Linked List                 |  Done   |   Done    |        
| 4  | Hash Map                    |    .    |     .     |       
| 5  | LRU                         |         |           |       
| 6  | Stack, Queue                |         |           |      
| -- | --------------------------- | ------- | --------- |       
| 7  | Binary Tree, DFS            |  Done   |   Done    |       
| 8  | Binary Search Tree          |  Done   |   Done    |       
| 9  | Binary Tree, BFS            |  Done   |   Done    |       
| 10 | Trie, Autocomplete          |  Done   |   Done    |       
| 11 | Heap. Part 1                |    .    |   Done    |       
| 12 | Heap. Part 2                |    .    |     .     |       
| 13 | Intervals                   |         |           |       
| -- | --------------------------- | ------- | --------- |       
| 14 | Graph. Intro                |         |           |       
| 15 | Graph. Part 1               |         |           |       
| 16 | Graph. Part 2               |         |           |       
| 17 | Dijkstra                    |         |           |       
| 18 | Topological sort. Part 1    |         |           |       
| 19 | Topological sort. Part 2    |         |           |       
| 20 | Backtracking. Part 1        |         |           |       
| 21 | Backtracking. Part 2        |         |           |       
| 22 | Dynamic Programming. Part 1 |         |           |       
| 23 | Dynamic Programming. Part 2 |         |           |       
