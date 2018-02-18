package com.algo.tree;

/**
 * Created by sanjay.nayak on 9/3/17.
 * <p>
 * The diameter of a tree is the number of nodes on the longest path between two leaves in the tree.
 */
public class DiameterOfTree {

    public static void main(String args[]) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
//        tree.root.left.left.left = new Node(2);
//        tree.root.left.left.right = new Node(6);

        tree.root.right = new Node(3);
//        tree.root.right.right = new Node(9);
//        tree.root.right.left = new Node(3);
//        tree.root.right.right.right = new Node(0);
//        tree.root.right.right.left = new Node(4);
//        tree.root.right.right.right.right = new Node(-1);
//        tree.root.right.right.right.left = new Node(10);

        int diameter = findDiameterLength(tree.root, Integer.MIN_VALUE);
        System.out.print("Diameter :: " + diameter);
    }

    static int diameter = 0;
    private static int findDiameterLength(Node node, int diameter) {
        if(node.left==null && node.right==null){
            return 0;
        }

        int left = findDiameterLength(node.left,diameter);
        int right = findDiameterLength(node.right,diameter);

        diameter = Math.max(diameter, left+right+1);

        return Integer.max(left,right)+1;
    }
}
