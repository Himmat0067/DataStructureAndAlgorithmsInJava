package com.java.dsa.linear_ds.linked_list.doubly;


/*
     1. Doubly Linked List Node
     2. It has two pointer that point left (prev) and right (next) to other node
     3. We can move forward and backward

     <-| |20| |->
 */

public class DLLNode {

    private int data;
    private DLLNode prev;
    private DLLNode next;

    public DLLNode(int data){
        this.data = data;
        prev = null;
        next = null;
    }

    public DLLNode(int data, DLLNode prev, DLLNode next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLLNode getPrev() {
        return prev;
    }

    public void setPrev(DLLNode prev) {
        this.prev = prev;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }
}
