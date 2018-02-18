package com.algo.array;

/**
 * Created by sanjay.nayak on 6/1/17.
 */
public class TrappingRainWater {

    public static void main(String args[]) {

        int[] array = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int capacity = new TrappingRainWater().findWaterStorageCapacity(array);
        System.out.println("Capacity = " + capacity);
    }


    /* 1. Find maximum height of bar from the left end upto an index i in the array \text{left_max}.
       2. Find maximum height of bar from the right end upto an index i in the array \text{right_max}.
       3. Iterate over the \text{height} array and update ans:
       Add \min(\text{max_left}[i],\text{max_right}[i]) - \text{height}[i] to ans*/
    private int findWaterStorageCapacity(int[] height) {

        if (height == null) return 0;

        int capacity = 0;
        int size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];
        leftMax[0] =  height[0];
        rightMax[size-1] = height[size-1];

        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        for (int i = size-2; i >0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 1; i < size; i++) {
            capacity+= Math.min(leftMax[i],rightMax[i])-height[i];
        }

        return capacity;
    }
}
