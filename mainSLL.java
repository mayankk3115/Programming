package com.mySpringboot.dataStructure.SingleLinkedList;

public class mainSLL {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        System.out.println("\nAfter remove Linked List:");
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println("\nPrepend List:");
        myLinkedList.prepend(10);
        myLinkedList.printList();

        System.out.println("\nremove First:");
        System.out.println(myLinkedList.removeFirst().value);

        myLinkedList.append(30);
        myLinkedList.append(40);
        myLinkedList.append(50);
        System.out.println("\nAfter remove Linked List:");
        System.out.println(myLinkedList.get(2).value);

        myLinkedList.set(1, 50);
        System.out.println("\nAfter set Linked List:");
        myLinkedList.printList();

        myLinkedList.insert(2, 100);
        System.out.println("\nAdding at Index Linked List:");
        myLinkedList.printList();

        myLinkedList.remove(1);
        System.out.println("\nRemove at Index Linked List:");
        myLinkedList.printList();

        myLinkedList.reverseList();
        System.out.println("\nAfter reverse Linked List:");
        myLinkedList.printList();

    }
}
