package com.algo.tree.path.nsteps;


import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sanjay.nayak on 8/20/16.
 */

public class Tree {


    private Node root;

    public Tree() {
        root = null;
    }


    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        insert(root, value);
    }

    private void insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return;
        }

        if (node.getData() < value) {
            if(node.getRight()==null)
                node.setRight(new Node(value));
            insert(node.getRight(), value);
        } else if (node.getData() > value) {
            if(node.getLeft()==null)
                node.setLeft(new Node(value));
            insert(node.getLeft(), value);
        }
    }

    public void display(Node root,String side) {
        if (root != null) {
            System.out.print(side+" -> " + root.getData() + "\n");
            display(root.getLeft(),"left");
            display(root.getRight(),"right");
        }
    }

    public void bfs() {
        Queue<Node> q = new LinkedBlockingQueue<Node>();
        Node item;
        if (root != null) {
            q.add(root);
            System.out.println(root.getData());
            while (!q.isEmpty()) {
                item = (Node) q.remove();
                if (item != null) {
                    if (item.getLeft() != null && item.getData() > item.getLeft().getData()) {
                        System.out.println("left -> " + root.getData());
                        q.add(item.getLeft());
                    }
                    if (item.getRight() != null && item.getData() > item.getRight().getData()) {
                        System.out.println("right -> " + root.getData());
                        q.add(item.getRight());
                    }
                }
            }
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
