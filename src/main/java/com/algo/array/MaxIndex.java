package com.algo.array;

/**
 * Created by sanjay.nayak on 10/17/17.
 */
public class MaxIndex {

    public static  void main(String args[]){

        int [] array = {3, 5, 4, 2};
        int result = new MaxIndex().findMaxIndex(array);
        System.out.println("result :: "+result);
    }

    private int findMaxIndex(int[] array) {

        int maxDiff = 0;
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {

            if(array[i]<min){
                min = i;
            }else{
                maxDiff = Math.max(maxDiff,i - min);
            }
        }
        return maxDiff;
    }

}
