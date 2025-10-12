package com.github.rodiond26.stage_2.ten.p3_linked_list.theory;

public class MyNode {
    int value;
    MyNode next;

    public MyNode() {
    }

    public MyNode(int value) {
        this.value = value;
    }

    public MyNode(int value, MyNode next) {
        this.value = value;
        this.next = next;
    }
}
