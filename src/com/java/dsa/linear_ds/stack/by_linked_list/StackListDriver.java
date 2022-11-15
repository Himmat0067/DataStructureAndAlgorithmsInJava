package com.java.dsa.linear_ds.stack.by_linked_list;

public class StackListDriver {

    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println("Is stack empty =  "+stack.isStackEmpty());

        stack.push(12);
        stack.push(22);
        stack.push(7);

        System.out.println("Stack after push operation");
        stack.displayListStack();

        System.out.println("Checking stack is empty after some push =  "+stack.isStackEmpty());

        System.out.println("The top of the stack is "+stack.top());

        System.out.println("Stack after pop operation of "+stack.pop());
        System.out.println("Stack after pop operation of "+stack.pop());
        stack.displayListStack();

        System.out.println("Checking stack is empty after some push =  "+stack.isStackEmpty());

        System.out.println("The size of stack =  "+stack.getSize());




    }
}
