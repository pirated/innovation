package com.algo.tree;

/**
 * Created by sanjay.nayak on 6/22/17.
 * NOt DOne
 */
public class SumBetweenLeafNodes {

    int sum = 0;
    private boolean sumBetweenTwoNodes(Node root, int s, int d) {

        if(root==null) return false;

        if(root.data==s || root.data ==d){
            return true;
        }


        if(root.left != null && sumBetweenTwoNodes(root.left,s,d)){
            sum+=root.data;
        }
        sum+=root.data;
        if(root.right != null  && sumBetweenTwoNodes(root.right,s,d)){
            sum+=root.data;
        }
       // sumBetweenTwoNodes(root.left,s,d) + sumBetweenTwoNodes(root.right,s,d);
       // System.out.print("Sum :: "+sum);
        sum = 0;
        return false;
    }

    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(-15);
        tree.root.left = new Node(5);
        tree.root.left.left = new Node(-8);
        tree.root.left.right = new Node(1);
        tree.root.left.left.left = new Node(2);
        tree.root.left.left.right = new Node(6);

        tree.root.right = new Node(6);
        tree.root.right.right = new Node(9);
        tree.root.right.left = new Node(3);
        tree.root.right.right.right = new Node(0);
        tree.root.right.right.left = new Node(4);
        tree.root.right.right.right.right = new Node(-1);
        tree.root.right.right.right.left = new Node(10);



        int a = 3;
        int b = 10;
       new SumBetweenLeafNodes().sumBetweenTwoNodes(tree.root,a,b);
       //System.out.print("Sum Between Nodes "+a+" and "+b+" is = "+sum);
    }


}
