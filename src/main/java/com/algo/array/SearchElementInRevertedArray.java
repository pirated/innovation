package com.algo.array;

/**
 * Created by sanjay.nayak on 6/18/17.
 */
public class SearchElementInRevertedArray {

    public static void main(String args[]) {
        int[] array = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int element = 3;
        int index = new SearchElementInRevertedArray().findPivot(array, element);
        System.out.print("Element is at index :: "+index);
    }



    private int findPivot(int[] array, int element) {
        int length = array.length;
        int low = 0;
        int mid = (length - 1 / 2) + 1;
        int high = length - 1;
        int pivot = 0;

        for (int i = 0; i < length; i++) {

            if (element == array[mid])
                return pivot = mid;

            if (array[low] < array[mid]) {
                if (array[mid] > element && array[low] < element) {
                    mid = mid / 2 + 1;
                } else {
                    low = mid;
                    mid = high;
                }
            } else {
                low = mid;
                mid = high;
            }
        }
        return pivot;
    }
}
