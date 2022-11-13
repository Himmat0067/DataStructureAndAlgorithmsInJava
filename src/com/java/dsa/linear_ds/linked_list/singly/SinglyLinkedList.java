package com.java.dsa.linear_ds.linked_list.singly;

public class SinglyLinkedList {

    // head is alway point to first node
    private SingleNode head;

    // tail is last node
    private SingleNode tail;

    private int size;


    public SinglyLinkedList(){
        this.size = 0;
    }


    // Print Linked List

    public void displayList(){

        SingleNode temp = head;

        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }



    // Insert At End
    public void insertAtEnd(int data){

        if (head == null && size <= 0){

            SingleNode node = new SingleNode(data);
            head = tail = node;
            size++;

        }else {

            SingleNode newNode = new SingleNode(data);

            // Set tails next is new node
            tail.setNext(newNode);

            // now new node is tail
            tail = newNode;

            // Increase size
            size++;
        }
    }


    // Insert node at Beginning
    public void insertAtBeginning(int data){

        // If List is empty at start
        if (head == null){
            insertAtEnd(data);
            return;
        }else {

            // Create new node
            SingleNode node = new SingleNode(data);

            // New node's next is head which is first node
            node.setNext(head);

            // Then new node become head
            head = node;
            size++;
        }
    }

    public void insertAtPosition(int data,int position){

        if (position < 0){
            position = 0;
        }

        if (head == null){
            insertAtEnd(data);
            return;
        }

        if (position == 0 || position == 1){
           insertAtBeginning(data);
        }else {

            int i = 1;
            SingleNode temp = head;

            while (i < position - 1){
                temp = temp.getNext();
                i++;
            }

            SingleNode node = new SingleNode(data);

            node.setNext(temp.getNext());
            temp.setNext(node);
            size++;
        }
    }


}
