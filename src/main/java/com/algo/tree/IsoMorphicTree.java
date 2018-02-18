package com.algo.tree;

/**
 * Created by sanjay.nayak on 6/23/17.
 */
public class IsoMorphicTree {


    public static void main(String args[]) {

        BinaryTree tree = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(8);

        tree2.root = new Node(1);
        tree2.root.left = new Node(3);
        tree2.root.right = new Node(2);
        tree2.root.right.left = new Node(4);
        tree2.root.right.right = new Node(5);
        tree2.root.left.right = new Node(6);
        tree2.root.right.right.left = new Node(8);
        tree2.root.right.right.right = new Node(7);

        if (new IsoMorphicTree().isIsomorphic(tree.root, tree2.root) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public boolean isIsomorphic(Node n1, Node n2) {

        // Both roots are NULL, trees isomorphic by definition
        if (n1 == null && n2 == null)
            return true;

        // Exactly one of the n1 and n2 is NULL, trees not isomorphic
        if (n1 == null || n2 == null)
            return false;

        if (n1.data != n2.data)
            return false;

        return (isIsomorphic(n1.left, n2.left) &&
                isIsomorphic(n1.right, n2.right))
                || (isIsomorphic(n1.left, n2.right) &&
                isIsomorphic(n1.right, n2.left));
    }


}
