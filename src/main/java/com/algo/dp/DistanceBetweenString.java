package com.algo.dp;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 7/2/17.
 */
public class DistanceBetweenString {

    public static void main(String args[]) {

        String a = "Carthorse";
        String b = "Orchestra";
        int result = new DistanceBetweenString().levenanthDistance(a, b);
        System.out.print("result :: "+result);
    }

    private int levenanthDistance(String a, String b) {

        int[][] distanceArray = new int[a.length()][b.length()];
        for (int[] row : distanceArray) {
            Arrays.fill(row, -1);
        }
        return computeDistanceBetweenPrefixes(a, a.length() - 1, b, b.length() - 1, distanceArray);
    }

    private int computeDistanceBetweenPrefixes(String a, int aIdx, String b, int bIdx, int[][] distanceArray) {

        if (aIdx < 0)
            return bIdx + 1;

        if (bIdx < 0)
            return aIdx + 1;

        if (distanceArray[aIdx][bIdx] == -1) {
            if (a.charAt(aIdx) == b.charAt(bIdx)) {
                distanceArray[aIdx][bIdx] = computeDistanceBetweenPrefixes(a, aIdx - 1, b, bIdx - 1, distanceArray);
            } else {

                int substitueLast = computeDistanceBetweenPrefixes(a, aIdx - 1, b, bIdx - 1, distanceArray);

                int addLst = computeDistanceBetweenPrefixes(a, aIdx , b, bIdx-1, distanceArray);

                int deletelast = computeDistanceBetweenPrefixes(a, aIdx-1, b, bIdx, distanceArray);

                distanceArray[aIdx][bIdx] = 1 + Math.min(substitueLast, Math.min(addLst, deletelast));
            }
        }
        return distanceArray[aIdx][bIdx];
    }
}
