package com.java.dsa.linear_ds.linked_list.singly;

public class SinglyLinkedListDriver {

    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();


        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(11);
        linkedList.insertAtEnd(12);

        linkedList.displayList();

        linkedList.insertAtBeginning(100);
        linkedList.insertAtBeginning(20);
        System.out.println("After insert At Beginning");
        linkedList.displayList();


        linkedList.insertAtPosition(1000,3);
        linkedList.insertAtPosition(2000,1);

        System.out.println("After inserting At Specific position");

        linkedList.displayList();
    }
}
