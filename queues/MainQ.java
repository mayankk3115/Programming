package com.mySpringboot.dataStructure.queues;

public class MainQ {

    public static void main(String[] args) {

        Queue queue = new Queue(10);
        queue.getTop();
        queue.getBottom();
        queue.getHeight();
        queue.printQueue();

        queue.enqueue(87);
        queue.enqueue(98);
        queue.enqueue(77);
        queue.enqueue(68);
        queue.printQueue();

        System.out.println("Element removed is: " + queue.dequeue().value);
        queue.printQueue();
    }
}
