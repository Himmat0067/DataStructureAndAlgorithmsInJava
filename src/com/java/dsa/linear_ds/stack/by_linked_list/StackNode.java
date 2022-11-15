package com.java.dsa.linear_ds.stack.by_linked_list;

public class StackNode {

    private int data;
    private StackNode next;

    public StackNode(int data){
        this.data = data;
    }

    public StackNode(int data, StackNode next){
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }
}
