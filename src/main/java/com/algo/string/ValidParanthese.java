package com.algo.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by sanjay.nayak on 2/12/18.
 */
public class ValidParanthese {

    public static void main(String args[]) {
        String input = "[()]{}{[()()]()}";
        Map<Character,Character> valids = new HashMap<>();
        valids.put('{','}');
        valids.put('[',']');
        valids.put('(',')');

        valids.put('}','{');
        valids.put(']','[');
        valids.put(')','(');

        boolean isValid = new ValidParanthese().isValid(input,valids);
        System.out.print("IsValid :: " + isValid);
    }

    private boolean isValid(String input, Map<Character,Character> valids) {
        Stack<Character> stack = new Stack<>();
        stack.push(input.charAt(0));

        for (int i = 1; i < input.length(); i++) {

            if (!stack.isEmpty() && valids.get(input.charAt(i))==stack.peek()) {
                stack.pop();
            } else {
                stack.push(input.charAt(i));
            }
        }
        return stack.isEmpty();
    }

}
