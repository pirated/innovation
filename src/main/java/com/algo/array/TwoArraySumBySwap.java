package com.algo.array;

/**
 * Created by sanjay.nayak on 7/6/17.
 */
/*Find a pair of elements swapping which makes sum of two arrays same*/
public class TwoArraySumBySwap {

    public static void main(String args[]) {

        int a[] = {4, 1, 2, 1, 1, 2};//{5, 7, 4, 6};
        int b[] = {3, 6, 3, 3};//{1, 2, 3, 8};
        new TwoArraySumBySwap().printElementToSwapForSameArraySum(a, b);
    }

    private void printElementToSwapForSameArraySum(int[] a, int[] b) {

        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
        }

        for (int i = 0; i < b.length; i++) {
            sumB += b[i];
        }

        int length = a.length < b.length ? a.length : b.length;

        int aIndx = a.length - 1;
        int bIndx = b.length - 1;

        while (true && bIndx>0 && aIndx>0) {

            int withoutElementA = sumA - a[aIndx];
            int withoutElementB = sumB - b[bIndx];

            if (withoutElementA + b[bIndx] == withoutElementB + a[aIndx]) {
                System.out.print("a = " + a[aIndx] + " , b = " + b[bIndx]);
                break;
            }

            if (withoutElementA + b[bIndx] > withoutElementB + a[aIndx]) {
                bIndx--;
            } else {
                aIndx--;
            }
        }
    }
}
