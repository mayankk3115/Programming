package com.mySpringboot.dataStructure.stack;

public class MainS {

    public static void main(String[] args) {

        Stack stack =  new Stack(10);
        stack.getTop();
        stack.getHeight();
        System.out.println("Stack is:");
        stack.printStack();

        stack.push(20);
        stack.push(30);
        stack.printStack();

        System.out.println("Element popped is: " + stack.pop().value);
        stack.printStack();

    }
}
