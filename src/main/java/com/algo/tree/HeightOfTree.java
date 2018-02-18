package com.algo.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sanjay.nayak on 6/23/17.
 */
public class HeightOfTree {

    public static void main(String args[]) {

        BinaryTree tree = new BinaryTree();
        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(8);
        
        int height = findHeightRec(tree.root);
        System.out.print("Height :: "+height);
    }


    private static int findHeightRec(Node node){

        if(node==null)
            return 0;

        return 1+Math.max(findHeightRec(node.right),findHeightRec(node.left));
    }


    private static int finHeightOfBinaryTree(Node root) {

        if(root==null)
            return 0;

        Queue<Node> q = new LinkedBlockingQueue<>();
        q.add(root);
        int height = 0;

        while (true){

            Node node = q.poll();
            if(q.isEmpty()){
                return height;
            }

            while(!q.isEmpty()){

                Node innerNode = q.poll();
                if(innerNode.left!=null)
                    q.add(innerNode.left);
                if(innerNode.right!=null)
                    q.add(innerNode.right);
            }
        }
    }
}
