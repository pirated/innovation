package com.algo.array;

/**
 * Created by sanjay.nayak on 5/31/17.
 */
public class CircularArray {

    public static void main(String args[]){
        int[] array = {2, -1, 1, 2, 2};
       System.out.print("Output :: "+new CircularArray().circularArrayLoop(array));
    }

    public boolean circularArrayLoop(int[] nums) {

        boolean circle = false;
        int length = nums.length;

        for (int i = 0; i <= length; ) {

            if ((i + nums[i]) < length) {
                if (nums[i] < 0) {
                    i = i + nums[i];
                    if(i<0)
                        return false;
                } else {
                    i = i + nums[i];
                }

            } else {
                //i = i+nums[i]-length;
                //circle = true;
                return true;
            }
        }
        return circle;
    }

}
