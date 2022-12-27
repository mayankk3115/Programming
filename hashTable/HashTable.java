package com.mySpringboot.dataStructure.hashTable;

import java.util.ArrayList;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for(int i=0; i< dataMap.length; i++) {
            System.out.println(i + ":");
            Node tmp = dataMap[i];
            while(tmp !=null) {
                System.out.println("{" + tmp.key + "=" + tmp.value + "}");
                tmp = tmp.next;
            }
        }
    }

    private int hashing(String key) {
        int hash = 0;
        char[] ch = key.toCharArray();
        for(int i=0; i<ch.length; i++) {
            int asciiValue = ch[i];
            hash = (hash + asciiValue *23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hashing(key);
        Node newNode = new Node(key,value);
        if(dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node tmp = dataMap[index];
            while(tmp.next!=null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hashing(key);
        Node tmp = dataMap[index];
        while(tmp != null) {
            if (tmp.key == key) return tmp.value;
            tmp = tmp.next;
        }
        return 0;
    }

    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i=0 ; i<dataMap.length; i++){
            Node tmp = dataMap[i];
            while(tmp!=null) {
                allKeys.add(tmp.key);
                tmp=tmp.next;
            }
        }
        return allKeys;
    }
}
