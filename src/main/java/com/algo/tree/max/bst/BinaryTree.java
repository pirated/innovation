package com.algo.tree.max.bst;
// Java program to print nodes at k distance from root

import com.algo.tree.child.sum.ValidateChildSum;

/* A binary tree node has data, pointer to left child
   and a pointer to right child */
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class BinaryTree {
    Node root;


    /* Driver program to test above functions */
    public static void main(String args[]) throws Exception {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(20);
        tree.root.right.right = new Node(70);
        tree.root.right.left = new Node(45);
        tree.root.right.right.right = new Node(80);
        tree.root.right.right.left = new Node(65);

              /*  50
                 /    \
              30       60
             /  \     /  \
            5   20   45    70
                          /  \
                        65    80*/

        System.out.println("MAX BST :: " + new MaxSizeBST().printMaxSizeBST(tree.root));
    }
}
