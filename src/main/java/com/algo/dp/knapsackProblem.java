package com.algo.dp;

/**
 * Created by sanjay.nayak on 9/10/17.
 */
public class knapsackProblem {


    public static void main(String args[]) {

        int[] value = {10, 20, 30};
        int[] weight = {60, 100, 120};
        int capacity = 50;
        int n = value.length;
        int Knapsack = new knapsackProblem().findMaxValue(value, weight, capacity, n);
        System.out.print("Knapsack ::: " + Knapsack);
    }

    private int findMaxValue(int[] value, int[] weight, int capacity, int n) {

        int[][] table = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n + 1; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0) {
                    table[i][w] = 0;
                } else if (weight[i - 1] <= w) {
                    table[i][w] = Math.max(table[i - 1][w], value[i - 1] + table[i - 1][w - weight[i - 1]]);
                } else {
                    table[i][w] = table[i - 1][w];
                }
            }
        }
        return table[n][capacity];
    }
}
