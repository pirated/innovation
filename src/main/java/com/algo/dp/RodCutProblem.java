package com.algo.dp;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 9/10/17.
 * <p>
 * Given a rod of length n inches and an array of prices that contains prices of all pieces of
 * size smaller than n. Determine the maximum value obtainable by cutting up the rod and selling the pieces.
 * For example, if length of the rod is 8 and the values of different pieces are given as following,
 * then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)
 * length   | 1   2   3   4   5   6   7   8
 * --------------------------------------------
 * price    | 1   5   8   9  10  17  17  20
 */
public class RodCutProblem {

    public static void main(String args[]) {

        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int length = prices.length;

        int price = new RodCutProblem().findMaxValue(prices, length);
        System.out.print("Maximum price ::: " + price);
    }

    private int findMaxValue(int[] prices, int length) {

        int[] dp = new int[length + 1];
        dp[0] = 0;
        Arrays.fill(dp, Integer.MIN_VALUE);

        for (int i = 1; i <= length; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {

                maxValue = Integer.max(prices[j], dp[i - j - 1]);
                dp[i] = maxValue;
            }
        }
        return dp[length];
    }

}
