package com.algo.array;

/**
 * Created by sanjay.nayak on 7/23/17.
 */
public class MaxSubarraySum {


    public static void main(String args[]) {
        int[] array = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        new MaxSubarraySum().findMaxAverage(array, k);
    }

    public double findMaxAverage(int[] nums, int k) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        double maxAverage = 0.0d;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i - 1] + nums[i];
            if (i >= k) {
                for(int j=i;j>=k;j--){
                    maxAverage = Math.max(maxAverage, dp[j]);
                }
                System.out.println("maxAverage : " + maxAverage);
                //maxAverage = Math.max(maxAverage, dp[i] - dp[i - k]);
            }
        }
        return maxAverage / k;
    }

}
