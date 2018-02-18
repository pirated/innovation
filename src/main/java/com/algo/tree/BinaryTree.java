package com.algo.tree;

class Node {
    int data;
    int level;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
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
        tree.root.left.left.left = new Node(2);
        tree.root.left.left.right = new Node(7);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(25);
        tree.root.right.right.right = new Node(80);
        tree.root.right.right.left = new Node(65);
        //tree.root.right.left.left = new Node(50);
        //tree.root.right.left.right = new Node(55);


              /*  50
                 /   \
              30       60
             /  \     /  \
           5   20   45    70
          /\  /  \        /  \
         2  7 10  25    65    80*/


        //new ProductSumLevelwise().getProductOfSumOfLeftNodesEachLevel(tree);
        //new SpecificLevelOrderTraversal().printSpecificLevelOrderTraversal(tree);
        //int NearestLeaf = new ClosestLeaf().findClosestLeaf(tree.root,60);
        //System.out.print("Nearest Leaf "+NearestLeaf);
        //new CousinNode().checkIfCousinNodes(tree.root,25,65);
        new LowestCommonAncestor().findLCA(tree.root,45,65);
//        new DiagonalPrint().printDigonally(tree.root, 0);
    }


}
