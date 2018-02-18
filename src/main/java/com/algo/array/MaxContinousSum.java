package com.algo.array;

/**
 * Created by sanjay.nayak on 2/16/18.
 */
public class MaxContinousSum {

    public static void main(String args[]) {

        int[] array = {-2, 5, -1, 4, -3};
        int result = new MaxContinousSum().findMaxContinousSum(array);
        System.out.print("Result :: " + result);
    }

    private int findMaxContinousSum(int[] array) {

        int maxEndingHere = 0;
        int sumSoFar = 0;

        for (int i = 0; i < array.length; i++) {
            maxEndingHere += array[i];
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            if (maxEndingHere > sumSoFar) {
                sumSoFar = maxEndingHere;
            }
        }
        return sumSoFar;
    }

}
