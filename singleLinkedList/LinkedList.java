package com.mySpringboot.dataStructure.singleLinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }

    public void printList() {
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0)
        {
            return null;
        }
        Node prev = head;
        Node tmp = head;
        while (tmp.next != null) {
            prev = tmp;
            tmp = tmp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return tmp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail= newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {

        if (length == 0) {
            return null;
        }
        else {
            Node tmp = head;
            head = head.next;
            tmp.next = null;
            length--;
            if (length == 0){
                tail = null;
            }
            return tmp;
        }
    }

    public Node get(int index) {

        if (index < 0 || index>= length) {
            return null;
        }

        Node tmp = head;
        for (int i=0; i< index ; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public boolean set(int index, int value) {
        Node tmp = get(index);
        if (tmp != null) {
            tmp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index == 0) {
            prepend(value);
            return true;
        }
        else if(index == length) {
            append(value);
            return true;
        }
        else {
            Node newNode = new Node(value);
            Node tmp = get(index-1);
            newNode.next = tmp.next;
            tmp.next = newNode ;
            length++;
            return true;
        }
    }

    public Node remove(int index) {
         if(index < 0 || index >= length) {
             return null;
         } else if (index == 0) {
             return removeFirst();
         } else if (index == length-1) {
             return removeLast();
         } else {
             Node prev = get(index-1);
             Node tmp = prev.next;
             prev.next = tmp.next;
             tmp.next = null;
             length--;
             return tmp;
         }
    }

    public void reverseList() {
        Node tmp = head;
        head = tail;
        tail = tmp;

        Node after = tmp.next;
        Node before = null;

        for (int i=0; i<length; i++) {
            after = tmp.next;
            tmp.next = before;
            before = tmp;
            tmp = after;
        }
    }
}
