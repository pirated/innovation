package com.algo.dp;

/**
 * Created by sanjay.nayak on 8/30/17.
 */
public class SubsetSumProblem {

    public static void main(String args[]) {

        SubsetSumProblem ssb = new SubsetSumProblem();
        int[] array = {3, 34, 4, 12, 5, 2};
        int length = array.length;
        int sum = 9;
        //boolean subset = ssb.getSubsetRec(array, length, sum);
        //System.out.print("Is Subset Sum Present ::: " + subset);

        boolean subsetDP = ssb.getSubsetDP(array, length, sum);
        System.out.print("Is Subset Sum Present ::: " + subsetDP);
    }

    private boolean getSubsetDP(int[] values, int length, int sum) {

        boolean[][] dp = new boolean[sum + 1][length + 1];

        // if target sum is 0 , then we can use 0 set to sum up to 0 target sum
        for (int i = 0; i <= sum; i++) {
            dp[i][0] = false;
        }

        //if value is empty then we can not add up to any sum
        for (int i = 0; i <= length; i++) {
            dp[0][i] = true;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= length; j++) {

                if (values[j-1] >= i) {
                    dp[i][j] = dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j] || dp[i - values[j-1]][j - 1];
                }
            }
        }
        return dp[sum][length];
    }

    private boolean getSubsetRec(int[] array, int length, int sum) {

        if (sum == 0)
            return true;

        if (length < 0 || sum < 0)
            return false;


        return getSubsetRec(array, length - 1, sum) || getSubsetRec(array, length - 1, sum - array[length]);

    }

}
