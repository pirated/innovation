package com.algo.dp;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 9/14/17.
 */
public class CuttingRod {

    public static void main(String args[]) {
        int length = 8;
        int[] values = {1, 5, 8, 9, 10, 17, 17, 20};
        int maxValueInCutting = new CuttingRod().findMaxValueInCutting(values, length);
        System.out.print("Max Value ::: " + maxValueInCutting);
    }

    private int findMaxValueInCutting(int[] values, int length) {

        int dp[] = new int[length + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i - 1], values[j] + dp[i - j - 1]);
            }
        }
        return dp[length];
    }
}
