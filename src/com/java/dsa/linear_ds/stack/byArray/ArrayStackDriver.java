package com.java.dsa.linear_ds.stack.byArray;

public class ArrayStackDriver {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack();

        System.out.println("Initial Info ");
        System.out.println("The size of array "+stack.size());
        System.out.println("Is stack empty "+stack.isStackEmpty());
        System.out.println("Is stack full "+stack.isStackFull());


        System.out.println("After inserting item in stack");
        stack.push(10);
        stack.push(3);
        stack.push(11);



        stack.displayArrayStack();

        System.out.println("The top of stack is "+stack.top());


        System.out.println("Pop from stack "+stack.pop());

        System.out.println("Pop from stack "+stack.pop());

        System.out.println("Print stack after pop");
        stack.displayArrayStack();

        System.out.println("The top of stack is "+stack.top());
    }
}
