package com.algo.array;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 2/10/18.
 */
public class MinSizeSubarraySum {

    public static void main(String args[]) {
        int[] array = {2, 3, 1, 2, 4, 3};
        int sum = 7;
        int result = new MinSizeSubarraySum().findMinLengthSubarrayWithSum(array, sum);
        System.out.print("Result :: "+result);
    }

    private int findMinLengthSubarrayWithSum(int[] array, int sum) {

        int[] dp = new int[array.length];
        Arrays.fill(dp, 0);
        dp[0] = array[0];
        int size = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            dp[i] = dp[i - 1] + array[i];
            if (dp[i] > sum) {
                for (int j = 0; j < i; j++) {
                    if(dp[i]-dp[j]==sum){
                        size =  i-j<size?i-j:size;
                    }
                }
            }
        }
        return size;
    }

}
