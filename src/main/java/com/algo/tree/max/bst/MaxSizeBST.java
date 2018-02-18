package com.algo.tree.max.bst;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sanjay.nayak on 5/16/17.
 */
public class MaxSizeBST {


    public int findDistance(Node root, int x) {

        if (root == null) return -1;
        int dist = -1;

        if ((root.data == x) ||
                (dist = findDistance(root.left, x)) >= 0 ||
                (dist = findDistance(root.right, x)) >= 0)
            return dist + 1;

        return dist;
    }


    public String printMaxSizeBST(Node root) throws Exception {

        if (root == null) return null;
        if (root.left == null && root.right == null) return String.valueOf(root.data);
        String output = new String();

        Queue<Node> q = new LinkedBlockingQueue<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = (Node) q.poll();
            if (validate(node)) {
                output += node.data + "->";
            } else {
                output = "";
            }
            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
        }

        return output;
    }

    private boolean validate(Node node) {
        return (node.left == null && node.right == null) || (node.left.data < node.data && node.right.data > node.data);
    }
}
