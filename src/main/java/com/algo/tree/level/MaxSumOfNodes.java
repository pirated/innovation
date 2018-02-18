package com.algo.tree.level;


import com.algo.tree.level.BinaryTree;
import com.algo.tree.level.Node;
import com.algo.tree.level.NodeWithKLeavesElement;

/**
 * Created by sanjay.nayak on 12/29/16.
 * Maximum sum of nodes in Binary tree such that no two are adjacent
 */
public class MaxSumOfNodes {

    public static void main(String[] args) {
        if(true == !true) {
            System.out.print("value " +true);
        }else{
            System.out.print("value " +false);
        }
        /*BinaryTree2 tree = new BinaryTree2();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(8);
        tree.root.left.left.left = new Node(9);
        tree.root.left.left.right = new Node(10);
        tree.root.right.left.left = new Node(11);
        tree.root.right.left.right = new Node(12);

       int sum = findNodesMaxSum(tree.root);
        System.out.print("sum = "+sum);*/
    }

    static int sum = 0;
    private static int findNodesMaxSum(Node node) {
        if(node==null)
            return 0;

        if(node.left!=null && node.left.data>node.data)
            sum = sum+findNodesMaxSum(node.left);
        else
            sum = sum+node.data;

        if(node.right!=null && node.right.data>node.data)
            sum = sum+findNodesMaxSum(node.right);
        else
            sum = sum+node.data;

        return sum;
    }
}
