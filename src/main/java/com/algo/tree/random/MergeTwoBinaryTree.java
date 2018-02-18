package com.algo.tree.random;

/**
 * Created by sanjay.nayak on 6/13/17.
 */



 class TreeNode {
    static int val;
    static TreeNode left;
    static TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MergeTwoBinaryTree {

     public static void main(String args[]){

         new MergeTwoBinaryTree().mergeTrees(new TreeNode(5),null);
     }


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {


        int value =   (t1 == null) ? t2.val : (t2 == null) ? t1.val : t1.val + t2.val;

        TreeNode t = new TreeNode(value);



        t.left = mergeTrees(t1.left, t2.left);
        t.right = mergeTrees(t1.right, t2.right);

        return t;

    }
}