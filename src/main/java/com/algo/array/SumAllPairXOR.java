package com.algo.array;

/**
 * Created by sanjay.nayak on 1/26/18.
 */
public class SumAllPairXOR {

    public static void main(String args[]) {
        int[] array = {5, 9, 7, 6};//{7, 3, 5};
        int result = new SumAllPairXOR().sumOfAllPairXOR(array);
        System.out.print("Result :: " + result);
    }

    private int sumOfAllPairXOR(int[] array) {
        int result = 0;

        if(array.length==0) return result;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                result+= array[i]^array[j];
            }
        }
        return result;
    }

}
