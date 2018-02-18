package com.algo.array;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 2/12/18.
 */
public class LargestRectangleHistogram {

    public static void main(String args[]) {

        int[] array = {6, 2, 5, 4, 5, 1, 6, 7, 6};//{2, 1, 5, 6, 2, 3};
        int rectangle = largestRectangle(array);
        System.out.print("Rectangle :: " + rectangle);
    }

    private static int largestRectangle(int[] array) {
        int dp[] = new int[array.length];
        Arrays.fill(dp, 0);

        int max = 0;
        int len = 1;
        int finalLen = 0;

        for (int i = 1; i < array.length; i++) {
            int localMax = i == array.length - 1 ? Math.min(array[i], array[i - 1]) : Math.max(array[i - 1], array[i + 1]);
            dp[i] = Math.min(array[i], localMax);
            if (dp[i] == dp[i - 1]) {
                len++;
                if (dp[i] >= max && len >= finalLen) {
                    finalLen = len;
                    max = dp[i];
                }
            } else {
                len = 1;
            }
        }

        return max * finalLen;
    }

}
