package com.java.dsa.linear_ds.linked_list.singly;


/*
      This is the single node that hold data and points to next node
      This is the implementation of single node

      ex :  |12|*| -> |15||*| -> NULL
 */

public class SingleNode {

    private int data;

    private SingleNode next;

    public SingleNode(){

    }

    public SingleNode(int data){
        this.data = data;
    }

    public SingleNode(int data , SingleNode next){
        this.data = data;
        this.next = next;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    public void setNext(SingleNode next){
        this.next = next;
    }

    public SingleNode getNext(){
        return this.next;
    }

}
