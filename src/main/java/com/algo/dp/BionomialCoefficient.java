package com.algo.dp;

/**
 * Created by sanjay.nayak on 9/7/17.
 */
public class BionomialCoefficient {


    public static void main(String args[]) {
        int n = 5;
        int c = 2;
        int coefficient = new BionomialCoefficient().calculateBionomialCoefficient(n, c);
        System.out.print(" coefficient ::: " + coefficient);
    }

    private int calculateBionomialCoefficient(int n, int c) {

        //memoization :: top down
        int[][] dp = new int[n+1][c+1];
        dp[0][0] = dp[0][1] = 1;


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=c ; j++) {

                if (j == 0 || j == i)
                    dp[i][j] = 1;


                dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
            }
        }
        return dp[n][c];
    }
}
