package com.java.dsa.linear_ds.stack.by_linked_list;

public class Stack {

    private StackNode top;
    private int size = 0;

    public Stack(){
        this.size = 0;
    }


    public int getSize(){
        return size;
    }

    public boolean isStackEmpty(){

        if (top == null){
            return true;
        }else {
            return false;
        }
    }

    public void displayListStack(){

        if (top == null){
            System.out.println("Stack is empty");
            return;
        }else {

            if (top != null){

                StackNode temp = top;

                while (temp != null){
                    System.out.println(temp.getData());
                    temp = temp.getNext();
                }
            }
        }
    }

    public void push(int data){

        if (top == null){
            StackNode node = new StackNode(data);
            top = node;
            size++;
        }else {
            StackNode node = new StackNode(data);
            node.setNext(top);
            top = node;
            size++;
        }
    }

    public int top(){

        int peak = -1;

        if (top == null){
            System.out.println("Stack is empty");
            return peak;
        }

        if (top != null){
            peak =  top.getData();
        }

        return peak;
    }

    public int pop(){

        int data = -1;

        if (top == null){
            System.out.println("Stack is empty");
            return data;
        }

        if (top != null && size > 0){

            data = top.getData();
            top = top.getNext();
            size--;
        }

        return data;
    }
}
