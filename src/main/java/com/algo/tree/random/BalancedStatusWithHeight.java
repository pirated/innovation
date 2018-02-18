package com.algo.tree.random;


/**
 * Created by sanjay.nayak on 5/22/16.
 */
public class BalancedStatusWithHeight {

    private boolean balanced;
    private int height;

    public BalancedStatusWithHeight() {
    }

    public BalancedStatusWithHeight(int height, boolean balanced) {
        this.height = height;
        this.balanced = balanced;
    }

    public  boolean isBalanced(Node tree){
        return checkBalanced(tree).balanced;
    }

    public  BalancedStatusWithHeight checkBalanced(Node tree){

        if (tree==null)
            return new BalancedStatusWithHeight(-1,true);

        BalancedStatusWithHeight leftSide = checkBalanced(tree.left);
        if(!leftSide.balanced)
            return leftSide;

        BalancedStatusWithHeight rightSide = checkBalanced(tree.right);
        if(!rightSide.balanced)
            return rightSide;

        boolean isBalanced = Math.abs(leftSide.height-rightSide.height)<=1;
        int height = Math.max(leftSide.height,rightSide.height)+1;

        return new BalancedStatusWithHeight(height,isBalanced);
    }

    public boolean isBalanced() {
        return balanced;
    }

    public void setBalanced(boolean balanced) {
        this.balanced = balanced;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
