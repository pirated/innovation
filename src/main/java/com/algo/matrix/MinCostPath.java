package com.algo.matrix;

import java.awt.image.RescaleOp;

/**
 * Created by sanjay.nayak on 12/18/17.
 */
public class MinCostPath {


    public static void main(String args[]) {
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

        int m = 0;
        int n = 0;
        int length = matrix.length;
        int result = new MinCostPath().minCost(matrix, m, n);
        System.out.print("result :: "+ result);
    }

    /* Returns cost of minimum cost path from (0,0) to (m, n) in mat[R][C]*/
    int minCost(int[][] cost, int m, int n) {
        if (n < 0 || m < 0)
            return Integer.MAX_VALUE;
        else if (m == 0 && n == 0)
            return cost[m][n];
        else
            return cost[m][n] + Math.min(minCost(cost, m - 1, n - 1),
                    Math.min(minCost(cost, m - 1, n),
                            minCost(cost, m, n - 1)));
    }

    int minCostDP(int[][] cost, int m, int n) {
        int[][] dp = new int[cost.length][cost.length];
        for (int i = 0; i <cost.length ; i++) {
            dp[0][i] = cost[0][i]+dp[0][i-1];
        }
        for (int i = 0; i <cost.length ; i++) {
            dp[i][0] = cost[i][0]+dp[i-1][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = cost[i][j]+Math.max(Math.max(cost[i-1][j-1], cost[i][j-1]), cost[i-1][j]);
            }
        }
        return dp[cost.length-1][cost.length-1];
    }
}
