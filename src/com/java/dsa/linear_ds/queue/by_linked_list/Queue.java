package com.java.dsa.linear_ds.queue.by_linked_list;

public class Queue {

    private QueueNode front;
    private QueueNode rare;
    private int size;

    public Queue(){
        size = 0;
    }


    public void displayQueue(){

        if (front != null && size > 0){
            QueueNode temp = front;
            while (temp != null){
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
    }

    public void enQueue(int data){

        if (rare == null){
            QueueNode node = new QueueNode(data);
            front = rare = node;
            size++;
            return;
        }

        if (rare != null && size > 0){

            QueueNode node = new QueueNode(data);
            rare.setNext(node);
            rare = node;
            size++;
        }
    }

    public int deQueue(){

        if (front != null && size > 0){

            QueueNode temp = front;
            front= front.getNext();
            int data = temp.getData();
            size--;
            return data;
        }else {
            System.out.println("Queue is empty");
        }

        return -1;
    }

    public boolean isQueueEmpty(){

        if (rare == null && size <= 0){
            return true;
        }else {
            return false;
        }
    }

    public int getFront(){

        if (front != null){
            return front.getData();
        }else {
            return -1;
        }
    }
}
