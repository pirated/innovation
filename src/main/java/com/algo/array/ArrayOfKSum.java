package com.algo.array;

/**
 * Created by sanjay.nayak on 7/25/17.
 * Given an unsorted array of non-negative integers,
 * find a continuous sub-array which adds to a given number.
 */
public class ArrayOfKSum {

    public static void main(String args[]) {
        int[] array = {1, 4, 0, 0, 3, 10, 5};//{1,2,3,7,5};
        int k = 7;//12;
        findArrayWithKSum(array, k);
    }


    private static void findArrayWithKSum1(int[] array, int k) {
        int sumSoFar = 0;
        int sumEndingHere = array[0];
        for (int i = 1; i < array.length; i++) {
            if (sumSoFar < k) {
                sumSoFar += array[i];
            }
            sumEndingHere += array[i - 1];
        }
    }

    private static void findArrayWithKSum(int[] array, int k) {
        int fist = 0;
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            dp[i] = dp[i - 1] + array[i];

            if (dp[i] > k) {
                dp[i] = dp[i] - array[fist];
                fist++;
            }
            if (dp[i] == k) {
                System.out.print(fist + "," + i);
                break;
            }


        }
    }
}
