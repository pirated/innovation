package com.algo.array;

/**
 * Created by sanjay.nayak on 2/11/18.
 */
public class SearchInsertPosition {

    public static void main(String args[]) {
        int[] array = {1, 3, 5, 6};
        int number = 7;
        //int position = new SearchInsertPosition().findInsertPosition(array, number);
        int position = new SearchInsertPosition().searchIndx(array, number);
        System.out.print("Position :: " + position);
    }

    private int searchIndx(int[] array, int number) {
        int i = 0;
        int j = array.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (number < array[mid]) {
                j = mid - 1;
            } else if (number > array[mid]) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return i;
    }


}
