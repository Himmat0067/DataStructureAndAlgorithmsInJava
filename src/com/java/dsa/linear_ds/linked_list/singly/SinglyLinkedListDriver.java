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


        int data = linkedList.deleteAtBeginning();
        System.out.println("The "+data+" removed from list");
        linkedList.displayList();


        int data1 = linkedList.deleteAtEnd();
        System.out.println("The "+data1+" removed from list");
        linkedList.displayList();

        System.out.println("The count of node in list is "+linkedList.getSize());


        linkedList.deleteAtPosition(3);
        System.out.println("Removed the specific position");
        linkedList.displayList();


        linkedList.reverseLinkedList();
        System.out.println("After list reverse");
        linkedList.displayList();

    }
}
