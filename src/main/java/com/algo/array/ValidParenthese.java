package com.algo.array;

import java.util.Stack;

/**
 * Created by sanjay.nayak on 1/16/18.
 */
public class ValidParenthese {

    public static void main(String args[]) {

        char[] paras = new String("((()").toCharArray();
        new ValidParenthese().longestValidParenthese(paras);
    }

    private void longestValidParenthese(char[] paras) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int result = 0;

        for (int i=0;i<paras.length;i++){

            if(paras[i]=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(!stack.isEmpty()){
                    result = Math.max(result,i-stack.peek());
                }else{
                    stack.push(i);
                }
            }
        }
    }
}
