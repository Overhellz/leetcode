package com.github.rodiond26.lru;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private int capacity;
    private Map<Integer, Node> data;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.data = new HashMap<>();
        this.head = new Node();
        this.tail = new Node();
        this.head.next = tail;
        this.tail.prev = head;
    }

    public int get(int key) {
        if (data.containsKey(key)) {
            Node node = data.get(key);
            this.remove(data.get(key));
            this.addToHead(data.get(key));
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (data.containsKey(key)) {
            Node node = data.get(key);
            this.remove(data.get(key));
            this.addToHead(data.get(key));
            node.value = value;
        } else {
            if (data.size() >= capacity) {
                Node node = this.tail.prev;
                this.remove(node);
                data.remove(node.key);
            }

            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            this.addToHead(newNode);
            data.put(key, newNode);
        }
    }

    private void addToHead(Node node) {
        node.next = this.head.next;
        node.prev = this.head;
        this.head.next.prev = node;
        this.head.next = node;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

class Node {
    int key;
    int value;
    Node next;
    Node prev;
}

class Solution146 {
}
