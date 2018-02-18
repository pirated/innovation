package com.algo.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sanjay.nayak on 10/18/17.
 */
public class DiagonalPrint {

    public void printDigonally(Node root, int level) {

        Queue<Node> q = new LinkedList<>();
        root.level = 0;
        q.add(root);

        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.data + ",");
            if (node.right != null)
                q.add(node.right);
        }

    }

}
