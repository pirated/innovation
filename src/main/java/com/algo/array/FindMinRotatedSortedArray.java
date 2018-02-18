package com.algo.array;

/**
 * Created by sanjay.nayak on 2/11/18.
 */
public class FindMinRotatedSortedArray {

    public static void main(String args[]) {
        int[] array = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 0, 1, 2, 3};
        int min = new FindMinRotatedSortedArray().finMin(array);
        System.out.print("Min :: " + array[min]);
    }

    //Find pivot and return pivot
    private int finMin(int[] array) {
        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] > array[mid + 1]) {
                return mid + 1;
            } else if (array[mid] < array[mid + 1]) {
                if (array[mid] < array[start]) {
                    end = mid + 1;
                } else {
                    start = mid - 1;
                }
            }
        }
        return mid + 1;
    }

}
