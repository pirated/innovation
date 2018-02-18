package com.algo.array;

/**
 * Created by sanjay.nayak on 2/11/18.
 */
public class MedianTwoSortedArray {

    public static void main(String args[]) {

        int a[] = {2,4,15};
        int b[] = {5, 8, 10, 20};
        int median  = new MedianTwoSortedArray().findMedian(a, b, a.length, b.length);
        System.out.print("Median :: "+median);
    }

    private int findMedian(int[] a, int[] b, int aLength, int bLength) {
        //int dp[] = new int[aLength+bLength];
        int medianPosition = (aLength + bLength) % 2 == 0 ? (aLength + bLength) / 2 : (aLength + bLength) / 2 + 1;
        int[] dp = new int[aLength + bLength];

        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < dp.length; i++) {

            if (i == medianPosition)
                return dp[i - 1];

            if (aIndex < aLength) {
                if (bIndex < bLength) {
                    if(a[aIndex]<b[bIndex]){
                        dp[i] = a[aIndex++];
                    }else{
                        dp[i] = b[bIndex++];
                    }
                } else {
                    dp[i] = a[aIndex++];
                }
            } else if (bIndex < bLength) {
                dp[i] = b[bIndex++];
            }
        }
        return dp[medianPosition - 1];
    }

}
