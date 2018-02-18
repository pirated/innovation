package com.algo.array;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 7/26/17.
 * <p>
 * Given an array of n positive integers. Write a program to find the sum of maximum sum
 * subsequence of the given array such that the integers in the subsequence are sorted in
 * åincreasing order.
 */
public class MaxIncreasingSubsequence {

    public static void main(String args[]) {
        int[] array2 = {3, 10, 2, 1, 20};
        int sum2 = findMaxIncreasingSubsequenceDP(array2,array2.length);

        System.out.print("max contiguous sum is : " + sum2);
    }



    private static int findMaxIncreasingSubsequenceDP(int[] array, int length) {

        int[] dp = new int[length];
        for (int i = 0; i < length; i++) {
            dp[i] = 0;
        }

        dp[0] = array[0];
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++){
                if(array[i]>array[j] && dp[j]>dp[i]){
                    dp[i]+= dp[j];
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }


}
