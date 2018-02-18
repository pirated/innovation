package com.algo.dp;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by sanjay.nayak on 8/10/17.
 */
public class LongestIncSeq {

    public static void main(String args[]){
       int n=9;
       int A[]={5, 11, 3, 15, 11, 25, 20, 30, 40};
       
       int result = findLargestIncSeq(A,n);
       System.out.print("result ::: "+result);
    }

    private static int findLargestIncSeq(int[] a, int n) {
        int dp[] = new int[n];
        Arrays.fill(dp,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    //System.out.print("a[] ::: "+a[i]+" a[j] ::: "+a[j]);
                    //System.out.print("dp[] ::: "+dp[i]+" dp[j] ::: "+dp[j]);
                    dp[i] = 1+Math.max(dp[j],dp[i]);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }

}
