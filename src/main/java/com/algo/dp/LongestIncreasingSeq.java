package com.algo.dp;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 9/7/17.
 */
public class LongestIncreasingSeq {

    public static void main(String args[]) {

        int[] array = {50, 3, 10, 7, 40, 80};
        int length = array.length;
        int seq = new LongestIncreasingSeq().findLongestIncreasingSeqLength(array, length);
        System.out.print("Longest seq size ::: " + seq);
    }

    private int findLongestIncreasingSeqLength(int[] array, int length) {

        //DP :: tabulation :: bottom up approach
        int[] dp = new int[length];
        Arrays.fill(dp,1);
        //dp[0] = 0;

        for (int i = 1; i < length; i++) {
            for (int j = 0; j <= i ; j++) {
                if(array[i]>array[j] && dp[i]<=dp[j]){
                    dp[i] = dp[j]+1;
                }

            }
        }

        return dp[length-1];
    }
}
