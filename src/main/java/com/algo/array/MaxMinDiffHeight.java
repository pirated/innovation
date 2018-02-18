package com.algo.array;

/**
 * Created by sanjay.nayak on 6/19/17.
 */
/*
 Given heights of n towers and a value k. We need to either increase or decrease height of every
 tower by k (only once) where k > 0. The task is to minimize the difference between the heights
 of the longest and the shortest tower after modifications, and output this difference.
*/
public class MaxMinDiffHeight {

    public static void main(String args[]) {

        int[] heights = {1, 15, 10};
        int k = 6;
        int difference = new MaxMinDiffHeight().findMaxMinHeight(heights, k);
        System.out.print("Max Diff is : " + difference);
    }

    /*Try to bring the number close to k*/
    private int findMaxMinHeight(int[] heights, int k) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int magicValue = k;
        for (int i = 0; i < heights.length; i++) {

            int indexValue =0;
            int plusVariant = heights[i] + magicValue;
            int minusVariant = heights[i] - magicValue;

            if(heights[i]<min){
                 indexValue = heights[i]+k;
            }else{
                 indexValue = heights[i]-k;
            }

             //indexValue = minusVariant > magicValue ? minusVariant : plusVariant;

            min = Math.min(min, indexValue);
            max = Math.max(max, indexValue);
            magicValue = min;
        }
        return max - min;
    }
}
