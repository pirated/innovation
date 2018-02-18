package com.algo.dp;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 8/30/17.
 */
public class CoinChange {


    public static void main(String args[]){

        CoinChange cc = new CoinChange();
        int[] coins =  {9, 6, 5, 1};//{1,2,3};
        int length = coins.length;
        int sum = 15;//4;
      //int minCoins = cc.getMinNumberOfCoins(coins,length,sum);
        int minCoins = cc.minCoins(coins,length,sum);
      System.out.print("Min coins required ::: "+minCoins);
    }

    private int getMinNumberOfCoins(int[] coins, int length, int sum) {

        int[] table = new int[sum+1];
        Arrays.fill(table,Integer.MAX_VALUE);
        table[0]=0;

        // Compute minimum coins required for all
        // values from 1 to V
        for(int i=1;i<=sum;i++){
            // Go through all coins smaller than i
            for(int j=0;j<length;j++){
                if(coins[j]<=i){
                    int sub_res = table[i-coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
            }
        }
        return table[sum];
    }

    private int minCoins(int[] coins, int length, int sum){
        int[] dp = new int[sum+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= sum ; i++) {
            for ( int j = 0; j < coins.length; j++) {

                if(coins[j]<=i) {
                    int temp = dp[i - coins[j]];
                    if (temp!=Integer.MAX_VALUE && temp+1 < dp[i]) {
                        dp[i] = temp + 1;
                    }
                }
            }
        }
        return dp[sum];
    }

}
