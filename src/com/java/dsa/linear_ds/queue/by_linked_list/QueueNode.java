package com.java.dsa.linear_ds.queue.by_linked_list;

public class QueueNode {

    private int data;
    private QueueNode next;

    public QueueNode(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }
}
