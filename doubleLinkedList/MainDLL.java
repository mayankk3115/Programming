package com.mySpringboot.dataStructure.doubleLinkedList;

public class MainDLL {

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList(10);
        dll.getHead();
        dll.getTail();
        dll.getLength();

        dll.append(20);
        dll.append(30);
        dll.printList();

        System.out.println("Removed element is: " + dll.removeLast().value);
        System.out.println("After removing last element list");
        dll.printList();

        System.out.println("Prepend list");
        dll.prepend(90);
        dll.printList();

        System.out.println("Removed first element is: " + dll.removeFirst().value);
        dll.printList();

        System.out.println("Set value at index in list");
        dll.set(2, 100);
        dll.printList();

        System.out.println("Insert value at index in list");
        dll.insert(2, 500);
        dll.printList();

        System.out.println("Remove element at index in list");
        dll.remove(1);
        dll.printList();
    }
}
