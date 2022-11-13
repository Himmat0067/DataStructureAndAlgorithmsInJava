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

    public int getSize(){
        return this.size;
    }


    // ==============================   PRINT OPERATION ===========================


    public void displayList(){

        SingleNode temp = head;

        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    // ==============================   INSERTION OPERATION ===========================


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

    // Insert At Specific Position
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

    // ==============================   DELETION OPERATION ===========================


    public int deleteAtBeginning(){

        int data = -1;
        if (head == null){
            return data;
        }

        if (head != null && size == 1){
            data = head.getData();
            head = tail = null;
            size=0;

        }

        if (head != null && size > 0){

            SingleNode temp = head;

            head = head.getNext();
            data = temp.getData();
            temp = null;
            size--;
        }

        return data;
    }


    public int deleteAtEnd(){

        int data = -1;

        if (head == null){
            return data;
        }

        if (head != null && size > 0){

            SingleNode temp = head;

            SingleNode node = head;

            while (temp.getNext().getNext() != null){
                temp = temp.getNext();
            }

            /*for (int i = 1; i < size-1; i++){
                temp = temp.getNext();
            }*/

           tail = temp;
           data = tail.getNext().getData();
           tail.setNext(null);
           size--;

        }

        return data;
    }


    // Delete at specific position

    public int deleteAtPosition(int position){
        int data = -1;

        if (head == null){
            return data;
        }

        if (position == 1){
            int d = deleteAtBeginning();
            return d;
        }

        if (head != null && size > 0){

            SingleNode  temp = head;

            for (int i = 1; i < position-1; i++){
                temp = temp.getNext();
            }

            SingleNode node = temp.getNext().getNext();
            temp.setNext(node);
            size--;

        }

        return data;
    }


    public void reverseLinkedList(){

        SingleNode prevNode = head;
        SingleNode currentNode = head.getNext();

        if (head == null && head.getNext() == null){
            return;
        }

        if (head != null && size > 0){

            while (currentNode != null){

                SingleNode nextNode = currentNode.getNext();
                currentNode.setNext(prevNode);

                // Update
                prevNode = currentNode;
                currentNode = nextNode;
            }

            head.setNext(null);
            head = prevNode;
        }
    }

}
