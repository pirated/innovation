package com.algo.tree;

/**
 * Created by sanjay.nayak on 6/22/17.
 */
public class PrintKDistanceNodes {

    int rootToTargetDistance = 0;

    public boolean printKDistanceNodesFunc(Node root, Node target, int k, int distance, boolean isPresent){
        if(root==null) return true;
        if(root.data==target.data){
            isPresent = true;
            rootToTargetDistance =  distance;
            distance = 0;
        }
        if(distance==k){
            System.out.print("Element at distance :: "+distance+" is :: "+root.data);
        }
       return printKDistanceNodesFunc(root.left,target,k, distance+1, isPresent) && printKDistanceNodesFunc(root.right,target,k, distance+1, isPresent);
    }


    public void printKDistantNodes(Node root, Node target, int k){
        boolean isPresent = false;
        if(printKDistanceNodesFunc(root.left,target,k, 0,isPresent )){
            printKDistanceElementInOtherHalf(root.right,1);

        }else {
            printKDistanceNodesFunc(root.right, target, k, 0, isPresent);
            printKDistanceElementInOtherHalf(root.left, 1);
        }
    }

    private void printKDistanceElementInOtherHalf(Node node, int distance) {
        if(distance==rootToTargetDistance-1){
            System.out.print(" Other half Element at distance :: "+distance+" is :: "+node.data);
        }
        printKDistanceElementInOtherHalf(node.left,distance+1);
        printKDistanceElementInOtherHalf(node.right,distance+1);

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

        new PrintKDistanceNodes().printKDistanceNodesFunc(tree.root,  tree.root.left, 2, 0, false);
        //System.out.print("Sum Between Nodes "+a+" and "+b+" is = "+sum);
    }
}
