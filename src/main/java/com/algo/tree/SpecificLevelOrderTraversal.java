package com.algo.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sanjay.nayak on 6/21/17.
 */
public class SpecificLevelOrderTraversal {

    public void printSpecificLevelOrderTraversal(BinaryTree tree) {

        Node root = tree.root;
        if (root == null) return;
        root.level = 0;
        Queue<Node> q = new LinkedBlockingQueue<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node node = (Node) q.poll();
            System.out.print(node.data+" , ");

            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }

        }
    }
}
