package com.mySpringboot.dataStructure.queues;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node tmp = first;
        while(tmp != null ) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: "+ first.value);
    }

    public void getBottom() {
        System.out.println("Bottom: "+ last.value);
    }

    public void getHeight() {
        System.out.println("Height: "+ length);
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            return null;
        }
        Node tmp = first;
        if (length == 1) {
            first = null;
            last = null;
        }else {
            first = first.next;
            tmp.next = null;
        }
        length--;
        return tmp;
    }
}
