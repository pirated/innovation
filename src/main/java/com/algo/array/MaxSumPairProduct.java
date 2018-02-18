package com.algo.array;

/**
 * Created by sanjay.nayak on 12/16/17.
 */
public class MaxSumPairProduct {

    public static void main(String args[]) {

        int[] array = {-1, 4, 5, -7, -4, 9, 0};
        int maxSum = new MaxSumPairProduct().getMaxSumPairwiseProduct(array);
        System.out.println("max sum :: " + maxSum);
    }

    private int getMaxSumPairwiseProduct(int[] array) {

        int[] dp = new int[array.length];
        dp[0] = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                int max = Math.max(array[i], array[i] * array[j]);
                if (array[i] * array[j] > array[i]) {
                    max = array[i] * array[j];
                    if (max > dp[i]) {
                        dp[i] = max;
                    }
                    array[j] = 0;
                } else {
                    dp[i] = array[j];
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            sum += dp[i];
        }
        return sum;
    }

}
