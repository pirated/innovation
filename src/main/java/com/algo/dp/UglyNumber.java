package com.algo.dp;

/**
 * Created by sanjay.nayak on 9/14/17.
 */
public class UglyNumber {


    public static void main(String args[]){
        int k=10;
        int[] set = {2,3,5};
        int uglyNumber = new UglyNumber().findKthUglyNUmber(set,k);
        System.out.print("Ugly Number ::: "+uglyNumber);
    }

    private int findKthUglyNUmber(int[] set ,int k) {

        boolean[] dp = new boolean[k*k];
        dp[0] = false;
        dp[1] = true;

        int count = 0;
        for (int i = 2; i < k*k; i++) {
            for (int j = 0; j < set.length ; j++) {

                if(k==count) {
                    count = i-2;
                    return i-2;
                }

                if(i%set[j]==0 && dp[i/set[j]]){
                    dp[i] = true;
                    count++;
                    break;
                }else if(!dp[i]){
                    dp[i] = false;
                }

            }
        }
        return count;
    }
}
