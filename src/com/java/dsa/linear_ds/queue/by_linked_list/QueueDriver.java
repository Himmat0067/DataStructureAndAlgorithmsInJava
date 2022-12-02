package com.java.dsa.linear_ds.queue.by_linked_list;

public class QueueDriver {

    public static void main(String[] args) {

        Queue queue = new Queue();

        System.out.println("Is Queue is empty "+queue.isQueueEmpty());

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        System.out.println("After qnQueue data in queue");
        queue.displayQueue();


        System.out.println("Is Queue is empty "+queue.isQueueEmpty());


        System.out.println("After deQueue element = "+queue.deQueue());
        queue.displayQueue();

        int data = queue.getFront();

        if (data != -1){
            System.out.println("The front of queue is "+data);
        }else {
            System.out.println("Queue is empty");
        }
    }
}
