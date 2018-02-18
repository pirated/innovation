package com.algo.tree;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sanjay.nayak on 6/20/17.
 */
public class ProductSumLevelwise {


    public void getProductOfSumOfLeftNodesEachLevel(BinaryTree tree) {

        Node root = tree.root;
        if (root == null) return;
        if (root.left == null && root.right == null) return;

        root.level = 0;
        Queue<Node> q = new LinkedBlockingQueue<>();
        q.add(root);
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int output = 1;

        while (!q.isEmpty()) {


            Node node = (Node) q.poll();
            int level = node.level;

            if (node.left == null && node.right == null) {

                if (map.containsKey(level)) {
                    map.get(level).add(node.data);
                } else {
                    Set<Integer> set = new HashSet<>();
                    set.add(node.data);
                    map.put(level, set);
                }
            }

            if (node.right != null) {
                node.right.level = level + 1;
                q.add(node.right);
            }
            if (node.left != null) {
                node.left.level = level + 1;
                q.add(node.left);
            }


        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.print(" Level :: " + entry.getKey() + " , value :: " + entry.getValue());
            int sum = 0;
            Set<Integer> set = (Set<Integer>) entry.getValue();
            for (Integer val : set) {
                sum += val;
            }
            System.out.print(" Level :: " + entry.getKey() + " , sum :: " + sum);
            output = output * sum;
            System.out.print("output :: " + output);
        }
        System.out.print("Reuslt :: " + output);
    }
}
