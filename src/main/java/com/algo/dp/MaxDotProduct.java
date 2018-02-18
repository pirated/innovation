package com.algo.dp;

/**
 * Created by sanjay.nayak on 11/22/17.
 * <p>
 * Given a array A with N elements and array B with M elements. You have to insert (N-M) zeroes in
 * between array B such that the dot product of array A and array B is maximum.
 */

import static java.lang.Math.*;

public class MaxDotProduct {

    public static void main(String args[]) {
        int[] a = {1, 2, 3};
        int[] b = {4};
        new MaxDotProduct().findMaxDotProductSum(a, b, a.length, b.length);
    }

    private int findMaxDotProductSum(int[] a, int[] b, int aLength, int bLength) {

        int [][] dp = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < b.length; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <=a.length ; i++) {
            for (int j = 1; j <=b.length ; j++) {

                dp[i-1][j-1] = Math.max(dp[i][j-1], a[i-1]*b[j-1]);
            }
        }

        return 0;
    }

}
