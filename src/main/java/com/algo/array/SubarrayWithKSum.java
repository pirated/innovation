package com.algo.array;

/**
 * Created by sanjay.nayak on 1/15/18.
 * Working code
 */
public class SubarrayWithKSum {

    public static void main(String args[]) {

       /* int sum = 12;
        int array[] = {1, 2, 3, 7, 5}; */
        int sum = 15;
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String result = new SubarrayWithKSum().subarrayWithSum(array, sum, array.length);
        System.out.print("result :: " + result);
    }

    private String subarrayWithSum(int[] array, int sum, int length) {

        int currentSum = array[0];
        int dp[] = new int[length];
        dp[0] = array[0];
        for (int i = 1; i < length; i++) {
            dp[i] = dp[i - 1] + array[i];
            if (dp[i]  == sum)
                return String.valueOf(0) + "::" + String.valueOf(i);
            else if (dp[i] > sum) {
                currentSum = dp[i];
                for (int j = 0; j < i; j++) {
                    if (currentSum == sum)
                        return String.valueOf(j) + "::" + String.valueOf(i);
                    else
                        currentSum -= dp[j];
                }
            }
        }
        return null;
    }

}
