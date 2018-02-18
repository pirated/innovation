package com.algo.dp;

/**
 * Created by sanjay.nayak on 7/2/17.
 */
public class NumberOfWaysToReachDesination {


    public static void main(String args[]) {
        int n = 4;
        int m = 4;
        int[][] matrix = new int[m][n];
        new NumberOfWaysToReachDesination().findNumberOfWaysToReachEnd(m, n, matrix);
    }

    private int findNumberOfWaysToReachEnd(int m, int n, int[][] matrix) {

        if (m==0 || n==0)
            return 1;

        if(matrix[m][n]==0) {
            int rightMove = m==0?0:findNumberOfWaysToReachEnd(m - 1, n, matrix);
            int downMove = n==0?0:findNumberOfWaysToReachEnd(m, n - 1, matrix);

            matrix[m][n] = rightMove + downMove;
        }

        return matrix[m][n];
    }

}
