package com.algo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanjay.nayak on 6/22/17.
 */
public class LowestCommonAncestor {


    public int findLCA(Node root, int a, int b) {

        if (root == null) return -1;

       /* List<Node> ancestorA = new ArrayList<Node>();
        boolean aFound = findAncestors(root, a, ancestorA);
        List<Node> ancestorB = new ArrayList<Node>();
        boolean bFound = findAncestors(root, b, ancestorB);*/

        List<Node> ancestorA = new ArrayList<Node>();
        boolean aFound = findLowestCommonAncestor(root, a, ancestorA);
        List<Node> ancestorB = new ArrayList<Node>();
        boolean bFound = findLowestCommonAncestor(root, b, ancestorB);

        System.out.print("ancestorA :: " + ancestorA);
        System.out.print("ancestorB :: " + ancestorB);

        return 0;
    }

    private boolean findAncestors(Node node, int a, List<Node> list) {

        if (node.data == a)
            return true;

        list.add(node);

        if (node.left != null && findAncestors(node.left, a, list)) {
            return true;
        }
        if (node.right != null && findAncestors(node.right, a, list)) {
            return true;
        }

        list.remove(list.size() - 1);
        return false;
    }


    //test
    private boolean findLowestCommonAncestor(Node node, int searchKey, List<Node> ancestors) {

        if (node == null) return false;

        ancestors.add(node);

        if (node.left.data == searchKey || node.right.data == searchKey)
            return true;

        return findAncestors(node.left, searchKey, ancestors) ||
                findAncestors(node.right, searchKey, ancestors);
    }
}
