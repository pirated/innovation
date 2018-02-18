package com.algo.array;

/**
 * Created by sanjay.nayak on 11/8/16.
 */
public class MaxSumContigousSubarray {

    public static void main(String args[]){
        int[] array = {-2,-3,4,-1,-2,1,5,-3};
        int sum = findMaxContigousSubArray(array,array.length);
        System.out.print("max contiguous sum is : "+sum);
    }

    private static int findMaxContigousSubArray(int[] array, int length) {
        try{
            int maxEndingHere = 0;
            int maxEndingSoFar = 0;
            for (int i=0;i<length;i++){
                maxEndingHere = maxEndingHere+array[i];
                if(maxEndingHere<0){
                    maxEndingHere = 0;
                }
                if(maxEndingHere>maxEndingSoFar){
                    maxEndingSoFar = maxEndingHere;
                }
            }
            return maxEndingSoFar;
        }catch(Exception e){
            throw e;
        }
    }
}
