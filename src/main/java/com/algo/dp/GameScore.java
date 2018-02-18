package com.algo.dp;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 10/4/17.
 * Count number of ways to reach a given score in a game
 *
 * Input: n = 20
 Output: 4
 There are following 4 ways to reach 20
 (10, 10)
 (5, 5, 10)
 (5, 5, 5, 5)
 (3, 3, 3, 3, 3, 5)
 */
public class GameScore {

    public static void main(String args[]){

        int[] scores = {3,5,10};
        int n = 20;
        int ways = new GameScore().findNumberOfWaysToReachScore(scores,n);
        System.out.print("Number of ways :: "+ways);
    }

    private int findNumberOfWaysToReachScore(int[] scores, int n) {

        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < scores.length ; j++) {
                if(scores[j]<=i){
                    int res = dp[i-scores[j]];
                    if(res!=Integer.MIN_VALUE && res > dp[i]){
                        dp[i] = res+1;
                    }
                }
            }
        }

        return dp[n];
    }

}
