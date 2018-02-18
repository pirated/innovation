package com.algo.dp;

/**
 * Created by sanjay.nayak on 8/9/17.

 Given a seq of n integers, you need to find a sequence of size k
 with min sum. If no seq return -1
 */
public class NonDecreasingSeqKSizeMinSum {

    public static void main(String args[]){
        int[] array = {58,12,11,12,82,30,20,77,16,86};
        int k=3;
        //output = 39(11,12,16)
        int seq = findSmallestSumSeqOfSizeK(array,k);
    }

    private static int findSmallestSumSeqOfSizeK(int[] array, int k) {
        int dp [] = new int[array.length];
        dp[array.length-1] = array[array.length-1];
        for (int i = array.length-2; i>0 ; i--) {
            for (int j = i+1; j < array.length-1 ; j++) {
                if(array[i] < array[j] || dp[i]>array[j]){
                    dp[i] = Math.min(array[j],dp[i]);
                }
            }
        }
        return -1;
    }

}
