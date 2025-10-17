package com.github.rodiond26.stage_2.ten.p4_hash_map;

public class MyHashMap {

    private final int n = 1021;
    private final TheLinkedList[] buckets = new TheLinkedList[n];

    public MyHashMap() {
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new TheLinkedList();
        }
    }

    public void put(int key, int value) {
        int index = hash(key);
        buckets[index].put(key, value);
    }

    public int get(int key) {
        int index = hash(key);
        return buckets[index].get(key);
    }

    public void remove(int key) {
        int index = hash(key);
        buckets[index].remove(key);
    }

    private int hash(int x) {
        return x % n;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

class TheLinkedList {

    TheNode head;

    public TheLinkedList() {
        this.head = null;
    }

    public int get(int key) {
        TheNode curr = head;

        while (curr != null) {
            if (curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }
        return -1;
    }

    public void put(int key, int value) {
        TheNode curr = head;

        while (curr != null) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        TheNode dummy = new TheNode();
        dummy.key = key;
        dummy.value = value;
        dummy.next = head;
        head = dummy;
    }

    public void remove(int key) {
        if (head == null) {
            return;
        }

        if (head.key == key) {
            head = head.next;
            return;
        }

        TheNode curr = head;
        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

class TheNode {

    int key;
    int value;
    TheNode next;

    public TheNode() {
    }
}
