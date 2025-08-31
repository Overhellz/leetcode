package com.github.rodiond26.linked_list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LinkedListSolution {
}

class Solution141_1 {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, ListNode> map = new HashMap<>();
        return hasCycle(head, map);
    }

    private boolean hasCycle(ListNode head, Map<ListNode, ListNode> map) {
        if (head == null || head.next == null) {
            return false;
        }
        if (map.containsKey(head)) {
            return true;
        } else {
            map.put(head, head.next);
            return hasCycle(head.next, map);
        }
    }
}

class Solution141_2 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        return hasCycle(head, set);
    }

    private boolean hasCycle(ListNode head, Set<ListNode> set) {
        if (head == null || head.next == null) {
            return false;
        }
        if (set.contains(head)) {
            return true;
        } else {
            set.add(head);
            return hasCycle(head.next, set);
        }
    }
}

class Solution141_3_correct {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode first = head;
        ListNode second = head;
        while (true) {
            if (second.next == null || second.next.next == null) {
                return false;
            }
            if (second.next == first) {
                return true;
            }
            first = first.next;
            second = second.next.next;
        }
    }
}

class Solution707 {
}

class MyLinkedList {

    private Node head;
    private int size;

    private class Node {
        int val;
        Node next;

        public Node() {
            this.val = 0;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= this.size) {
            return -1;
        }

        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            Node newNode = new Node();
            newNode.val = val;
            newNode.next = this.head;
            this.head = newNode;
            size++;
            return;
        }

        Node current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node oldNext = current.next;
        Node newNode = new Node();
        newNode.val = val;
        newNode.next = oldNext;

        current.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        size--;
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
