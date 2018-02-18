package com.algo.array;

/**
 * Created by sanjay.nayak on 6/19/17.
 */
public class MaxSumWithNoTwoAdjacent {
    public static void main(String args[]) {
        int a[] = {5, 5, 10, 100, 10, 5};
        int maxsum = new MaxSumWithNoTwoAdjacent().findMaxSumWithNoTwoAdjacent(a);
        System.out.print("Max sum with no two adjacent : " + maxsum);
    }

    private int findMaxSumWithNoTwoAdjacent(int[] arr) {
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i;

        for (i = 1; i < arr.length; i++)
        {
            /* current max excluding i */
            excl_new = (incl > excl) ? incl : excl;

            /* current max including i */
            incl = excl + arr[i];
            excl = excl_new;
        }

        /* return max of incl and excl */
        return ((incl > excl) ? incl : excl);
    }
}
