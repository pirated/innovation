package com.algo.tree.views;

import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sanjay.nayak on 6/21/17.
 */
public class BottomView {


    public void printBottomView(Node root) {

        if (root == null) return;
        Queue<Node> q = new LinkedBlockingQueue<>();
        root.weight = 0;
        q.add(root);
        Map<Integer, Node> nodeMap = new TreeMap<>();

        while (!q.isEmpty()) {
            Node node = q.poll();
            int weight = node.weight;
            //insert weight wise nodes so the latest from below weight will replace the node on vertical
            // above weight
            nodeMap.put(weight, node);

            if (node.left != null) {
                node.left.weight = weight - 1;
                q.add(node.left);
            }
            if (node.right != null) {
                node.right.weight = weight + 1;
                q.add(node.right);
            }
        }

        nodeMap.forEach((k,v)->{
            System.out.println(""+v.data+" , ");
        });
    }
}
