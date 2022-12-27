package com.mySpringboot.dataStructure.stack;

public class Stack {

    private Node top;
    private int height;

    class Node {
         int value;
         Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height=1;
    }

    public void printStack() {
        Node tmp = top;
        while(tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void getTop() {
        System.out.println("Top element is: " + top.value);
    }

    public void getHeight() {
        System.out.println("Height is: " + height);
    }

    public void push(int value) {
        Node newNode= new Node(value);

        if (height == 0) {
            top = newNode;
        } else{
            newNode.next=top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        Node tmp = top;
        if (height == 0) {
            return null;
        }
        top = top.next;
        tmp.next = null;
        height--;
        return tmp;
    }
}
