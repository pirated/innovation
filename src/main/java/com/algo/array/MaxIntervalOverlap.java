package com.algo.array;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 2/14/18.
 */
public class MaxIntervalOverlap {


    public static void main(String[] args) {
        int arrl[] = {1, 2, 10, 5, 5};
        int exit[] = {4, 5, 12, 9, 12};
        int n = arrl.length ;
        int result = new MaxIntervalOverlap().findMaxGuests(arrl, exit, n);
        System.out.print("result :: "+result);
    }

    private int findMaxGuests(int[] arrl, int[] exit, int n) {
// Sort arrival and exit arrays
        Arrays.sort(arrl);
        Arrays.sort(exit);

        // guests_in indicates number of guests at a time
        int guests_in = 1, max_guests = 1, time = arrl[0];
        int i = 1, j = 0;

        // Similar to merge in merge sort to process
        // all events in sorted order
        while (i < n && j < n) {
            // If next event in sorted order is arrival,
            // increment count of guests
            if (arrl[i] <= exit[j]) {
                guests_in++;

                // Update max_guests if needed
                if (guests_in > max_guests) {
                    max_guests = guests_in;
                    time = arrl[i];
                }
                i++; //increment index of arrival array
            } else // If event is exit, decrement count
            { // of guests.
                guests_in--;
                j++;
            }
        }
        return max_guests;
    }
}
