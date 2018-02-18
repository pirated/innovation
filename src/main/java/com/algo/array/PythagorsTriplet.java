package com.algo.array;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 6/19/17.
 */
public class PythagorsTriplet {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 6, 5};
        boolean result = new PythagorsTriplet().isPythagorsTripletPresent(array);

        System.out.print("Is pythagors triplet present ::" +result);

    }

    private boolean isPythagorsTripletPresent(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]*array[i];
        }

        //sort the array
        Arrays.sort(array);

        for (int i = array.length-1; i >1 ; i--) {

            if(array[i]==array[i-1]+array[i-2])
                return true;
        }
        return false;
    }
}
