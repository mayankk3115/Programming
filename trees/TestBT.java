package com.mySpringboot.dataStructure.trees;

public class TestBT {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("Root :" + bst.root);
        bst.insert(43);
        bst.insert(34);
        bst.insert(47);
        bst.insert(21);
        bst.insert(39);
        bst.insert(49);
        bst.insert(46);

        System.out.println(bst.root.left.right.value);

        System.out.println(bst.contains(51));

        System.out.println("BFS:" + bst.BFS()+ "\n");
        System.out.println("Preorder:" + bst.DFSPreOrder()+ "\n");
        System.out.println("Postorder:" +bst.DFSPostOrder()+ "\n");
        System.out.println("Inorder:" +bst.DFSInOrder()+ "\n");

    }
}
