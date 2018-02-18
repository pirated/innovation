package com.algo.dp;

/**
 * Created by sanjay.nayak on 7/25/17.
 */
public class LargestSumSubarray {
    
    public static void main(String args[]){
        int[] array = {3, -4, 9, -8, 8, 7};
        int sum = findLargestSumArray(array,array.length);
        System.out.print("largest contiguous sum is : "+sum);
    }

    private static int findLargestSumArray(int[] array, int length) {

        int endingHere = 0;
        int sumSoFar = 0;
        for (int i = 0; i <length ; i++) {
            endingHere+= array[i];

            if(endingHere<0){
                endingHere = 0;
            }
            if(endingHere>sumSoFar){
                sumSoFar = endingHere;
            }
        }
        return sumSoFar;
    }

}
