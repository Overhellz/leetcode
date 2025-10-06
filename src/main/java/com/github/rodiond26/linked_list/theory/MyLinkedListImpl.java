package com.github.rodiond26.linked_list.theory;

import lombok.ToString;

@ToString
public class MyLinkedListImpl {

    private Node head;
    private int size;

    private class Node {
        int val;
        Node next;

        public Node() {
            this.val = 0;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public MyLinkedListImpl() {
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

    public static void main(String[] args) {
        MyLinkedListImpl myLinkedList = new MyLinkedListImpl();
        System.out.println(myLinkedList);

        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        System.out.println(myLinkedList);
    }
}
