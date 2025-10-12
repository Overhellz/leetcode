package com.github.rodiond26.stage_2.ten.p3_linked_list.theory;

public class MyLinkedList {

    MyNode head;
    int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        MyNode current = this.head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
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

        this.size++;

        if (index == 0) {
            MyNode dummy = new MyNode(val, this.head);
            this.head = dummy;
            return;
        }

        MyNode current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        MyNode oldNext = current.next;
        current.next = new MyNode(val, oldNext);
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        this.size--;

        if (index == 0) {
            this.head = this.head.next;
            return;
        }

        MyNode current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
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
