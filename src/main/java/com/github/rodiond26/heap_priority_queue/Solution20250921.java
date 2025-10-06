package com.github.rodiond26.heap_priority_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class Solution20250921 {
}

class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (num > pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }
        return pq.poll();
    }
}

class Solution703 {
}

class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int size;

    public KthLargest(int k, int[] nums) {
        this.size = k;
        for (int num : nums) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (num > pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }
    }

    public int add(int val) {
        if (pq.size() < this.size) {
            pq.offer(val);
        } else if (val > pq.peek()) {
            pq.poll();
            pq.offer(val);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

class Solution347 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int count = map.get(num) + 1;
                map.put(num, count);
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            pq.add(pair);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().val;
        }

        return result;
    }
}

class Pair implements Comparable<Pair> {
    int val;
    int count;

    public Pair() {
    }

    public Pair(int val, int count) {
        this.val = val;
        this.count = count;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.count, other.count);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) return false;
        Pair pair = (Pair) other;
        return val == pair.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }
}

class Solution451 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int count = map.get(ch) + 1;
                map.put(ch, count);
            }
        }
//        System.out.println(map);

        PriorityQueue<Pair2> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Pair2 pair = new Pair2(entry.getKey(), entry.getValue());
            pq.add(pair);
        }
//        System.out.println(pq);


        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Pair2 pair = pq.poll();
            sb.append(pair.toString());
        }
        return sb.toString();
    }

//    public static void main(String[] args) {
//        Solution451 s = new Solution451();
//        String result = s.frequencySort("tree");
//        System.out.println(result);
//    }
}

class Pair2 implements Comparable<Pair2> {
    char ch;
    int count;

    public Pair2() {
    }

    public Pair2(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }

    @Override
    public int compareTo(Pair2 other) {
        return Integer.compare(other.count, this.count );
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) return false;
        Pair2 pair = (Pair2) other;
        return ch == pair.ch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(this.ch);
        }
        return sb.toString();
    }
}

class SolutionSolution1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int stone : stones) {
            pq.add(-stone);
        }

        while (!pq.isEmpty()) {
            int stone1 = pq.poll();
            if (!pq.isEmpty()) {
                int stone2 = pq.poll();
                int diff = stone1 - stone2;
                if (diff != 0) {
                    pq.add(-Math.abs(diff));
                }
            } else {
                return -stone1;
            }
        }
        if (pq.isEmpty()) {
            return 0;
        } else {
            return pq.poll();
        }
    }
}
