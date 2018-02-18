package com.algo.tree.duplicate;

import com.algo.tree.path.nsteps.Tree;

/**
 * Created by sanjay.nayak on 8/20/16.
 */

class Node{

    Node left,right;
    int data;

    public Node(int data){
        this.data=data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
public class BTTest {

    public static void main(String[] args) {

        Tree bt = new Tree();
        bt.insert(11);
        bt.insert(2);
        bt.insert(13);
        bt.insert(41);
        bt.insert(51);
        bt.insert(61);
        bt.insert(70);
        bt.insert(18);
        bt.insert(90);

        bt.display(bt.getRoot(), "root");
        bt.bfs();
    }
}
