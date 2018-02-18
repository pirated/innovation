package com.algo.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by sanjay.nayak on 2/12/18.
 */
public class LongestValidParanthese {

    public static void main(String args[]) {
        String input = "()(()))))";
        Map<Character,Character> valids = new HashMap<>();
        valids.put('(',')');
        valids.put(')','(');

        int maxLength = new LongestValidParanthese().isValid(input,valids);
        System.out.print("maxLength :: " + maxLength);
    }

    private int isValid(String input, Map<Character,Character> valids) {
        Stack<Item> stack = new Stack<>();
        stack.push(new Item(input.charAt(0),0));
        int maxLength = 0;

        for (int i = 1; i < input.length(); i++) {
            if (!stack.isEmpty() && valids.get(input.charAt(i))==stack.peek().getSign()) {
                Item item = stack.pop();
                maxLength = Math.max(maxLength, i-item.getPosition());

            } else {
                stack.push(new Item(input.charAt(i),i));
            }
        }
        return maxLength;
    }

    class Item{
        Character sign;
        int position;

        public Item(Character sign, int position) {
            this.sign = sign;
            this.position = position;
        }

        public Character getSign() {
            return sign;
        }

        public void setSign(Character sign) {
            this.sign = sign;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
    }
}


