package com.algo.array;

import java.util.Collections;

/**
 * Created by sanjay.nayak on 7/8/17.
 */
public class FirstMissingPositiveNumber {

    public static void main(String args[]) {

        int array[] = {3, 5, 4, -1, 5, 1, -1};//{3, 4, 0, 2};
        int result = new FirstMissingPositiveNumber().findFirstMissingPositiveNumber(array);
        System.out.print("Result : " + result);
    }

    private int findFirstMissingPositiveNumber(int[] array) {
        int n = array.length;
        int i = 0;
        while (i < n) {
            if (array[i] > 0 && array[i]<n && array[array[i]-1] != array[i]) {
               int temp =  array[array[i]-1];
               array[array[i]-1] =  array[i];
               array[i] = temp;
            }else{
                i++;
            }
        }

        for (i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
            if (array[i] != array[i + 1]) {
                return i + 1;
            }
        }
        return Integer.MAX_VALUE;
    }
}
