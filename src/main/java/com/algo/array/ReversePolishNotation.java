package com.algo.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by sanjay.nayak on 2/12/18.
 */
public class ReversePolishNotation {

    Stack<Integer> stack = new Stack();

    public static void main(String args[]) {

        String[] notations = {"+", "-", "*", "/"};
        String[] array = {"2", "1", "+", "3", "*"};
        String[] array2 = {"4", "13", "5", "/", "+"};
        int result = new ReversePolishNotation().evaluate(array2, notations);
        System.out.print("result :: " + result);
    }

    private int evaluate(String[] array, String[] notations) {

        Map<String, String> map = new HashMap<>();

        Arrays.stream(notations).forEach(notation -> {
            map.put(notation, notation);
        });

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int result = getMathmeticalResult(stack.pop(), stack.pop(), array[i]);
                stack.push(result);
            } else {
                stack.push(Integer.valueOf(array[i]));
            }
        }
        return stack.pop();
    }

    private int getMathmeticalResult(Integer value2, Integer value1, String notation) {

        switch (notation) {
            case "+":
                return value1 + value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }

    }

}
