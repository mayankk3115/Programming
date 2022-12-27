package com.mySpringboot.dataStructure.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node tmp = root;
        while(true) {
            if (newNode.value == tmp.value){
                return false;
            }
            if (newNode.value < tmp.value) {
                if (tmp.left == null) {
                    tmp.left = newNode;
                    return true;
                }
                tmp = tmp.left;
            }
                else {
                    if(tmp.right == null) {
                        tmp.right = newNode;
                        return true;
                    }
                    tmp = tmp.right;
                }
            }
    }

    public boolean contains(int value) {
        Node tmp = root;
        while(tmp != null) {
             if (value < tmp.value) {
                //move right
                 tmp = tmp.left;
            } else if (value > tmp.value){
                //move left
                 tmp = tmp.right;
            } else {
                 //equals->return true
                 return true;
             }
        }
        return false;
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);
        while(queue.size() > 0) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode) {
                results.add(currentNode.value);
                if(currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if(currentNode.left != null ) {
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        new Traverse(root);
        return results;
    }

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left!=null){
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right!=null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }
}
