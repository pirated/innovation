package com.algo.tree.duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sanjay.nayak on 3/13/17.
 */

public class FindDuplicateSubTree {

    private final String MARKER = "$";
    private Set<String> subTreeHash = new HashSet<>();

    public String isDuplicateSubtreePresent(Node root) {
        try {
            String hash = "";
            if (root == null)
                return hash + MARKER;

            String lStr = isDuplicateSubtreePresent(root.getLeft());
            if (lStr.compareTo(hash) == 0)
                return hash;

            String rStr = isDuplicateSubtreePresent(root.getRight());
            if (rStr.compareTo(hash) == 0)
                return hash;

            //serialize current subTree
            hash = hash + root.getData() + lStr + rStr;

            // If current subtree already exists in hash
            // table. [Note that size of a serialized tree
            // with single node is 3 as it has two marker
            // nodes.
            if (hash.length() > 3 &&
                    subTreeHash.contains(hash))
                return "";

            subTreeHash.add(hash);
            return hash;
        } catch (Exception e) {
            System.out.print("Exception in isDuplicateSubtreePresent() ::: " + e);
            throw e;
        }
    }

    public static void main(String args[]){

        FindDuplicateSubTree fdst = new FindDuplicateSubTree();
        Node node = new Node(1);
        node.setRight(new Node(3));
        node.setLeft(new Node(2));
        node.getLeft().setRight(new Node(5));
        node.getLeft().setLeft(new Node(4));
        node.getRight().setRight(new Node(2));
        node.getRight().getRight().setRight(new Node(5));
        node.getRight().getRight().setLeft(new Node(4));

        System.out.println("Node : "+node.toString());
        fdst.isDuplicateSubtreePresent(node);
    }
}
