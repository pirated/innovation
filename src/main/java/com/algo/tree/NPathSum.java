package com.algo.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sanjay.nayak on 7/11/17.
 */
public class NPathSum {

    /* Driver program to test above functions */
    public static void main(String args[]) throws Exception {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(20);
        tree.root.right.right = new Node(70);
        tree.root.right.left = new Node(45);
        tree.root.left.left.left = new Node(2);
        tree.root.left.left.right = new Node(7);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(25);
        tree.root.right.right.right = new Node(80);
        tree.root.right.right.left = new Node(65);

              /*  50
                 /    \
              30       60
             /  \     /  \
           5   20   45    70
          /\  /  \        /  \
         2  7 10  25    65    80*/


        new NPathSum().printAllPathWithSum(tree.root, 80);
    }

    private void printAllPathWithSum(Node root, int sum) {
        checkSum(root, sum, 0);
    }

    List<Integer> nodes = new LinkedList<>();
    private boolean checkSum(Node node, int sum, int current) {
        current += node.data;
        if (current == sum) {
            System.out.println("Nodes : "+nodes);
            return true;
        } else if(current<sum){
            nodes.add(node.data);
        } else if (current > sum) {
            nodes.remove(nodes.size()-1);
            return false;
        }

        return (node.left!=null && checkSum(node.left, sum, node.left.data)) ||
                (node.right!=null && checkSum(node.right, sum, node.right.data));
    }
}
