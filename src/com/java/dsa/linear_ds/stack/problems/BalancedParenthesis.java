package com.java.dsa.linear_ds.stack.problems;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the expression");
        String exp = scanner.nextLine();

        boolean result = isExpressionIsBalanced(exp);

        if (result){
            System.out.println("The expression is balanced");
        }else {
            System.out.println("Expression is not balanced");
        }
    }

    private static boolean isExpressionIsBalanced(String exp) {

        if (exp == null && exp.length() == 0){
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++){

            char ch = exp.charAt(i);

            if (ch == '(' || ch == '{' || ch == '['){

                stack.push(ch);

            }else if (ch == ')'){

                return handleClosing(stack, '(');

            }else if (ch == ']'){

                return handleClosing(stack, '[');

            }else if (ch == '}'){

                return handleClosing(stack, '{');
            }
        }


        if (stack.size() == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean handleClosing(Stack<Character> stack, char corresponding){

        if (stack.size() == 0){
            return false;
        }else if (stack.peek() != corresponding){
            return false;
        }else {
            stack.pop();
            return true;
        }
    }
}
