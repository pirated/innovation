package com.algo.array;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 2/12/18.
 */
public class SearchRange {

    public static void main(String args[]) {
        int array[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = new SearchRange().findRange(array, target);
        Arrays.stream(result).forEach(item -> System.out.print(item + " "));
    }

    private int[] findRange(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start) + (end-start) / 2;
            if (target == array[mid]) {
                //TODO :: handle left and right match
                return new int[]{array[mid], array[mid + 1]};
            } else if (target > array[mid] && target > array[mid + 1]) {
                end = mid - 1;
            } else {
                //less than & less than
                start = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
