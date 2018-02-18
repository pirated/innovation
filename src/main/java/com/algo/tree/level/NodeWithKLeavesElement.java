package com.algo.tree.level;

/**
 * Created by sanjay.nayak on 12/27/16.
 */
public class NodeWithKLeavesElement {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(8);
        tree.root.left.left.left = new Node(9);
        tree.root.left.left.right = new Node(10);
        tree.root.right.left.left = new Node(11);
        tree.root.right.left.right = new Node(12);

        int k = 2;
        NodeWithKLeavesElement nwkle = new NodeWithKLeavesElement();
        nwkle.printNodeWithKLeavesElement(tree.root, k);
    }

    private int printNodeWithKLeavesElement(Node node, int k) {

        if (node == null) return 0;

        if (node.left == null && node.right == null) return 1;

        int count = printNodeWithKLeavesElement(node.left, k) +
                    printNodeWithKLeavesElement(node.right, k);

        if (count == k)
            System.out.print(node.data +"\n");

        return count;
    }
}
