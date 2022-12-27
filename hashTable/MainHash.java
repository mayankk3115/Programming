package com.mySpringboot.dataStructure.hashTable;

import java.util.ArrayList;

public class MainHash {

    public static void main(String[] args) {

        HashTable ht = new HashTable();
        ht.set("Mak", 1);
        ht.set("Pri", 3);
        ht.set("Cha", 5);
        ht.set("Hri", 7);
        ht.set("Ram", 9);

        ht.printTable();
        System.out.println("\n");
        System.out.println("The value of given key is:" + ht.get("Pri"));

        System.out.println("The keys are:" + ht.keys());
    }

}
