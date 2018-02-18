package com.algo.array;

/**
 * Created by sanjay.nayak on 6/29/17.
 */
public class MaxSizeSquareSubMatrix {

    public static void main(String args[]){

        int M[][] = {{0, 1, 1, 0, 1},
                    {1, 1, 0, 1, 0},
                    {0, 1, 1, 1, 0},
                    {1, 1, 1, 1, 0},
                    {1, 1, 1, 1, 1},
                    {0, 0, 0, 0, 0}};

        printMaxSubSquare(M, 6,5);
    }

    private static void printMaxSubSquare(int[][] matrix, int r , int c) {

        int[][] sum = new int[6][5];

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                sum[i][j] = 0; // initialize sum matrix
                if(matrix[i][j]==1) {
                    int min = Math.min(Math.min(matrix[i][j - 1], matrix[i - 1][j]), matrix[i - 1][j - 1])+1;
                    sum[i][j] = min;
                }
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {

            System.out.print(sum[i][j]+" ");
            }
        }

    }
}
