package com.algo.array;

/**
 * Created by sanjay.nayak on 12/10/17.
 */
public class ReplaceOForMax1Series {

    public static void main(String args[]) {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1};
        int index = new ReplaceOForMax1Series().findIndexOfToReplace(array);
        System.out.print("Index :: "+index);
    }

    private int findIndexOfToReplace(int[] array) {

        int before = array[0];
        int index = -1;
        int max = 0;
        int max2 = max;

        for (int i = 1; i < array.length; i++) {

            if (array[i] == 1) {
                before++;
            } else if (array[i] == 0 && array[i - 1] == 1) {
                max += before;
                if(max>max2){
                    index = i;
                    max2 = max;
                }
            } else if (array[i] == 0 && array[i - 1] == 0) {
                before = 0;
                max = 0;
                max2 = 0;
            }
        }
        return index;
    }

}
