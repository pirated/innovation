package com.algo.tree.child.sum;

/**
 * Created by sanjay.nayak on 5/3/17.
 */
public class ValidateChildSum {

    public int validateLRSum(Node node) {

        if(node.left==null && node.right==null)
            return node.data;

        System.out.println("NODE "+node.data+" :: LEFT "+node.left.data+" :: RIGHT "+node.right.data);

        if (node.data == validateLRSum(node.left) + validateLRSum(node.right))
            return node.data;
        else {
            System.out.println("Mismatch");
            return -1;
        }

    }


    public boolean foldedTree(Node node){
     return checkIfFoldable(node.left,node.right);
    }

    public boolean checkIfFoldable(Node left,Node right){

        if(left==null && right == null)
            return true;

        if((left==null && right!=null)||(right==null&&left!=null))
            return false;



       return checkIfFoldable(left.left,right.right) && checkIfFoldable(left.right,right.left);
    }
}
