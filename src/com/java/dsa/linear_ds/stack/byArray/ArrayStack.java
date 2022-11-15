package com.java.dsa.linear_ds.stack.byArray;

public class ArrayStack {

    private static int Capacity = 10;

    private int[] stack;

    private int top = -1;
    private int size = 0;

    public ArrayStack(){
        this(Capacity);
    }

    public ArrayStack(int capacity){
        Capacity = capacity;
        stack = new int[Capacity];
    }

    public boolean isStackFull(){

        if (size() == Capacity){
            return true;
        }else{
            return false;
        }
    }

    public boolean isStackEmpty(){

        return top > -1 ? false : true;
    }

    public int size(){
        return size;
    }

    public void displayArrayStack(){

        if (top != -1){

            for (int i = 0; i < size(); i++){
                System.out.println(stack[i]);
            }
        }
    }

    public void push(int data){

        if (top == -1){
            stack[++top] = data;
        }else {
            stack[++top] = data;
        }
        size++;
    }

    public int pop(){

        if (top == -1){
            System.out.println("Stack is empty");
        }else {

            if (top > -1){
                size--;
                return stack[top--];

            }
        }

        return -1;
    }

    public int top(){

        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }else {
            return stack[top];
        }
    }
}
