package com.algo.stack;

import java.util.Stack;

/**
 * Created by sanjay.nayak on 2/10/18.
 */
public class StackOperations  extends Stack<Integer> {

    private static Stack<Integer> max = new Stack<>();

    StackOperations(){
        super();
    }


    public static void main(String args[]) {

        StackOperations sop = new StackOperations();
        sop.push(10);
        sop.push(2);
        sop.push(15);
        sop.push(26);
        sop.push(9);
        System.out.print("POP-MAX :: "+sop.popMax()+"\n");
        System.out.print("POP-MAX :: "+sop.popMax()+"\n");
        System.out.print("POP-MAX :: "+sop.popMax()+"\n");
    }

    public Integer push(Integer item){
        if(isEmpty()) {
            super.push(item);
            max.push(item);
        }else{
            super.push(item);
            int currentMax = max.pop();
            max.push(currentMax);
            if(item>currentMax){
                max.push(item);
            }else{
                max.push(currentMax);
            }
        }
        return item;
    }

    /* SpecialStack's member method to insert an element to it. This method
      makes sure that the min stack is also updated with appropriate minimum
      values */
    public Integer pop()
    {
        int x = super.pop();
        max.pop();
        return x;
    }

    /* SpecialStack's member method to get minimum element from it. */
    int popMax()
    {
        int x = max.pop();
        //max.push(x);
        return x;
    }
}
