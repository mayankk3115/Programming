package com.programming.datastructure.btree;

public class BinarySearchTree {

    public BSTNode insertRecursive(BSTNode root, int data) {
        
        BSTNode newNode = new BSTNode(data);
        if (root == null) {
            root = newNode;
        }else if(root.getData()<data){
            root.setRight(insertRecursive(root.getRight(),data));
        } else if (root.getData()>data) {
            root.setLeft(insertRecursive(root.getLeft(),data));
        }
        return root;
    }

    public BSTNode insert(BSTNode root, int data) {
        return insertRecursive(root,data);
    }

    public void inOrder(BSTNode node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println("InOrder Traversal: " +node.getData());
            inOrder(node.getRight());
        }
    }

    public void preOrder(BSTNode node) {
        if (node != null) {
            System.out.println("PreOrder Traversal: " +node.getData());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void postOrder(BSTNode node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println("PostOrder Traversal: " +node.getData());
        }
    }

    public int findMax(BSTNode root) {
        int max = 0;
        if(root != null) {
            int maxl = findMax(root.getLeft());
            int maxr = findMax(root.getRight());

            if (maxl>maxr) {
                max = maxl;
            } else {
                max= maxr;
            }
            if (root.getData() > max) {
                max = root.getData();
            }
        }
        return max;
    }

    public boolean search(BSTNode root, int data) {
        if(root == null) {
            return false;
        }
        if(root.getData() == data) {
            return true;
        }
        return search(root.getLeft(), data) || search(root.getRight(),data);
    }

    public int heightOfTree(BSTNode root) {
        if (root == null){
            return 0;
        }
        int lDepth = heightOfTree(root.getLeft());
        int rDepth = heightOfTree(root.getRight());

        return lDepth>rDepth?lDepth+1 : rDepth+1;
    }


    public int sizeOfTree(BSTNode root) {
        int lSize = root.getLeft() == null ? 0 : sizeOfTree(root.getLeft());
        int rSize = root.getRight() == null ? 0 : sizeOfTree(root.getRight());

        return (lSize + rSize)+1;
    }

    public BSTNode findBST(BSTNode root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.getData()) {
            return findBST(root.getLeft(),data);
        } else if (data > root.getData()) {
            return findBST(root.getRight(), data);
        }
        return root;
    }

    public int findMinElement(BSTNode root) {

        if (root == null) {
            return 0;
        } else if(root.getLeft()==null) {
            return root.getData();
        }else {
           return findMinElement(root.getLeft());
        }
    }

    public int findMaxElement(BSTNode root) {

        if (root == null) {
            return 0;
        } else if(root.getRight()==null) {
            return root.getData();
        }else {
            return findMaxElement(root.getRight());
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bstTree = new BinarySearchTree();
        BSTNode root = bstTree.insert(null,10);
        bstTree.insert(root,13);
        bstTree.insert(root,99);
        bstTree.insert(root,11);
        bstTree.insert(root,8);
        bstTree.insert(root,9);
        bstTree.insert(root,64);

//        System.out.println(root.getData());
//        System.out.println(root.getLeft().getData());
//        System.out.println(root.getRight().getData());

//        bstTree.inOrder(root);
//        bstTree.preOrder(root);
//        bstTree.postOrder(root);

        System.out.println("Max Data is:" + bstTree.findMax(root));
        System.out.println("The element present " + bstTree.search(root,23));

        System.out.println("Height of tree is :" + bstTree.heightOfTree(root));
        System.out.println("Size of tree is :" + bstTree.sizeOfTree(root));

        BSTNode node = bstTree.findBST(root,11);
        System.out.println(node.getData());


        System.out.println("Min Element in Tree is :" + bstTree.findMinElement(root));
        System.out.println("Max Element in Tree is :" + bstTree.findMaxElement(root));
    }
}
