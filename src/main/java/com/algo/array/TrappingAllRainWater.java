package com.algo.array;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 2/11/18.
 */
public class TrappingAllRainWater {

    public static void main(String args[]) {
        int[] array = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};//expt output : 6
        int water = new TrappingAllRainWater().trappedWater(array);
        System.out.print(water);
    }

    private int trappedWater(int[] array) {
        int[] left = new int[array.length];
        int[] right = new int[array.length];
        Arrays.fill(left, 0);
        Arrays.fill(right, 0);
        left[0] = array[0];
        right[array.length-1] = array[array.length-1];

        for (int i = 1; i < array.length; i++) {
            left[i] = Math.max(array[i], left[i-1]);
        }
        for (int i = array.length-2; i >0 ; i--) {
            right[i] = Math.max(array[i], right[i+1]);
        }
        int water = 0;
        for (int i = 1; i < array.length - 1; i++) {

            int capacity =  Math.min(right[i],left[i]) - array[i];
            if(capacity>0){
                water += capacity;
            }
        }
        return water;
    }

}
