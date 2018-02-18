package com.algo.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanjay.nayak on 6/21/17.
 */
public class ClosestLeaf {

    public int findClosestLeaf(Node node, int k) {
        List<Node> list = new ArrayList<Node>();
        return findClosest(node, k, list);
    }


    public int findClosest(Node node, int k, List<Node> list) {

        if (node == null) return Integer.MAX_VALUE;
       /*store all ancestor until key if found*/
        list.add(node);
        int closest = 0;
        if (node.data == k) {
            closest = findClosetOfAncestor(node);
            for (Node ancestor : list) {
                closest = Math.min(closest, findClosetOfAncestor(ancestor));
            }
        }

        return Math.min(findClosest(node.left, k, list), findClosest(node.right, k, list));
    }

    private int findClosetOfAncestor(Node node) {

        if (node.left == null && node.right == null)
            return 0;

        return 1+Math.min(findClosetOfAncestor(node.left), findClosetOfAncestor(node.right));
    }
}
