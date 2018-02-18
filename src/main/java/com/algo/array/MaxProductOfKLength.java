package com.algo.array;

/**
 * Created by sanjay.nayak on 8/13/16.
 * <p>
 * Given an array consisting of n positive integers, and an integer k. Find the largest product subarray of size k, i.e.,
 * find maximum produce of k contiguous elements in the array where k <= n.
 */
public class MaxProductOfKLength {


    public static void main(String args[]) {

        int array[] = {1, 5, 9, 8, 2, 4, 1, 8, 1, 2};
        int k = 6;
        getMaxProductGivenLength(array,k);
    }

    private static void getMaxProductGivenLength(int[] array, int k) {

        int max = 1;
        int startIndex = 0;
        int endIndex = k-1;

        for (int i=0;i<k;i++){
            max = max*array[i];
        }

        for(int i=k,j=0;i<array.length-1;i++,j++){
            int tempMax = (max*array[i])/array[j];
            if(tempMax>max){
                max = tempMax;
                startIndex = j+1;
                endIndex = i;
            }
        }
        System.out.println("startIndex : "+startIndex+" , endIndex : "+endIndex);
        System.out.println("start : "+array[startIndex]+" , end : "+array[endIndex] + " max product : "+max);
    }
}
