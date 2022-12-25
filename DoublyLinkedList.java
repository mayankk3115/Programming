package com.mySpringboot.dataStructure.DoubleLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
            next=null;
            prev=null;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length=1;
    }

    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
//        Node tmp = head;
//        Node pre = head;
//        if (length == 0) {
//            return null;
//        } else {
//            while (tmp.next != null){
//                pre = tmp;
//                tmp = tmp.next;
//            }
//            tmp.prev = null;
//            pre.next = null;
//        }
//        return tmp;
        if (length == 0) {
            return null;
        }
        Node tmp = tail;
        if (length == 1) {
            head = null;
            tail =null;
        } else {
            tail= tmp.prev;
            tail.next = null;
            tmp.prev = null;
        }
        length--;
        return tmp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        Node tmp = head;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else{
            head = tmp.next;
            tmp.next = null;
            head.prev = null;
        }
        length--;
        return tmp;
    }

    public Node get(int index) {
        if (length <0 || index>=length){
            return null;
        }
        Node tmp = head;
        if(index < length/2) {
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
        } else {
            tmp = tail;
            for(int i= length-1; i>index; i--) {
                tmp = tmp.prev;
            }
        }
        return tmp;
    }

    public boolean set(int index, int value) {
        Node tmp = get(index);
        if(tmp!=null) {
            tmp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (length <0 || index>length){
            return false;
        } else if (index == 0 || index == length) {
            prepend(value);
            return true;
        }
        Node before = get(index-1);
        Node after = before.next;
        Node newNode = new Node(value);
        newNode.prev = before;
        newNode.next = after;
        before.next=newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if(index<0 || index>=length) {
            return null;
        }
        if (index==0){
            return removeFirst();
        }
        if (index == length-1) {
            return removeLast();
        }
        Node tmp = get(index);
        tmp.next.prev = tmp.prev;
        tmp.prev.next = tmp.next;
        tmp.next = null;
        tmp.prev = null;
        length--;
        return tmp;
    }
}
