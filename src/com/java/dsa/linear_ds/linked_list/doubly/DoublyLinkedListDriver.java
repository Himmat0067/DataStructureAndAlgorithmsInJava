package com.java.dsa.linear_ds.linked_list.doubly;

public class DoublyLinkedListDriver {

    public static void main(String[] args) {

        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.insertAtBeginningOf(9);
        linkedList.insertAtBeginningOf(10);
        linkedList.insertAtBeginningOf(12);

        System.out.println("Doubly Linked list after inserting item at beginning");
        linkedList.displayDLL();

        linkedList.insertAtEnd(22);
        linkedList.insertAtEnd(25);
        System.out.println("Doubly linked list after insert item at end");
        linkedList.displayDLL();


        linkedList.insertAtPosition(100,3);

        System.out.println("Doubly linked list after insert at middle");
        linkedList.displayDLL();

       /* System.out.println("Print doubly linked list reversed");
        linkedList.printReverse();*/


        int num = linkedList.deleteAtBeginning();
        System.out.println("Doubly linked list after deleting first node i.e "+num);
        linkedList.displayDLL();

        int num1 = linkedList.deleteAtEnd();
        System.out.println("Doubly linked list after deleting end node i.e "+num1);
        linkedList.displayDLL();

        int middle = linkedList.deleteAtPosition(3);
        System.out.println("Doubly linked list after deleting particular position node  i.e "+middle);
        linkedList.displayDLL();

    }
}
