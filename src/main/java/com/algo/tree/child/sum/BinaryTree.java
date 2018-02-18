package com.algo.tree.child.sum;
// Java program to print nodes at k distance from root

/* A binary tree node has data, pointer to left child
   and a pointer to right child */
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;


    /* Driver program to test above functions */
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(3);

              /* 26
                /  \
              10    3
             /  \    \
           4     6    3*/

        //System.out.println("L-R sum : " + new ValidateChildSum().validateLRSum(tree.root));
        System.out.println("Is foldable : " + new ValidateChildSum().foldedTree(tree.root));
        System.out.println("largest mirror tree start at Node : ");
    }
}
