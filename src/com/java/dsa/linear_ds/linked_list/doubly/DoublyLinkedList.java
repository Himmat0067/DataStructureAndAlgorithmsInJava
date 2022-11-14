package com.java.dsa.linear_ds.linked_list.doubly;

/*
      Doubly Linked List
 */

import java.util.Date;

public class DoublyLinkedList {

    private DLLNode head;
    private DLLNode tail;
    private int size;

    public DoublyLinkedList(){
        this.size = 0;
        head = null;
        tail = null;
    }

    public int getSize(){
        return size;
    }


    public void displayDLL(){

        DLLNode temp = head;

        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }


    public void printReverse(){

        if (tail != null && size > 0){

            DLLNode temp = tail;

            while (temp != null){
                System.out.println(temp.getData());
                temp = temp.getPrev();
            }
        }
    }


//******************* Doubly Linked List Operations ******************************

    // Insert At Beginning
    public void insertAtBeginningOf(int data){

       if (head == null){
           DLLNode node = new DLLNode(data);
           head = tail = node;
           size++;
           return;
       }

       if (head != null && size > 0){

           DLLNode node = new DLLNode(data);

           node.setNext(head);
           node.setPrev(null);
           head.setPrev(node);
           head = node;
           size++;
       }
    }


    public void insertAtEnd(int data){

        if (head == null){
            DLLNode node = new DLLNode(data);
            head = tail = node;
            size++;
            return;
        }

        if (head != null && size > 0){

            DLLNode temp = head;

            while (temp.getNext() != null){
                temp = temp.getNext();
            }

            DLLNode node = new DLLNode(data);

            node.setNext(null);
            node.setPrev(temp);
            temp.setNext(node);
            tail = node;
            size++;
        }

    }

    public void insertAtPosition(int data ,int position){

        if (head == null){
            DLLNode node = new DLLNode(data);
            head = tail = node;
            size++;
            return;
        }

        if (head != null && size > 0){

            DLLNode temp = head;
            int i = 1;

            while (i < position - 1){
                temp = temp.getNext();
                i++;
            }

            DLLNode node = new DLLNode(data);

            node.setNext(temp.getNext());
            node.setPrev(temp);
            temp.setNext(node);
            node.getNext().setPrev(node);
            size++;

        }

    }


 // ====================== Deleting Node Operation ============================

    public int deleteAtBeginning(){
        int data = -1;

        if (head == null || size <= 0){
            System.out.println("List is empty");
            return data;
        }

        if (head != null && size > 0){

            DLLNode temp = head;

            data = head.getData();
            head = head.getNext();
            head.setPrev(null);
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

            // Approach 1

           DLLNode prev = head;
           DLLNode next = head.getNext();

           while (next.getNext() != null){
               prev = prev.getNext();
               next = next.getNext();
           }

           data = next.getData();
           prev.setNext(null);
           size--;


            // Approach 2

           /* DLLNode temp = head;

            while (temp.getNext().getNext() != null){
                temp = temp.getNext();
            }

            data = temp.getNext().getData();
            temp.setNext(null);
            size--;*/
        }

        return data;
    }

    public int deleteAtPosition(int position){

        int data = -1;

        if(head == null){
            return data;
        }

        if (head != null && size > 0){

            DLLNode temp = head;

            if (position == 1){
                return deleteAtBeginning();
            }

            if (position == size){
                return deleteAtEnd();
            }

            // 10
            //100
            //9
            //22
            int  i = 1;
            while (i < position-1){
                temp = temp.getNext();
                i++;
            }

            data = temp.getNext().getData();
            temp.setNext(temp.getNext().getNext());
            temp.getNext().setPrev(temp);
            size--;
        }

        return data;
    }

}
