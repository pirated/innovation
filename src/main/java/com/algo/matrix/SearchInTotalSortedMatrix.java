package com.algo.matrix;

/**
 * Created by sanjay.nayak on 7/18/17.
 */
public class SearchInTotalSortedMatrix {

    public static void main(String args[]) {

        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

        int searchKey = 17;
        boolean found = findElement(matrix, searchKey);
        System.out.print("is found : " + found);
    }

    private static boolean findElement(int[][] matrix, int key) {

        if (key < matrix[0][0]) return false;

        for (int i = 0; i < matrix.length; i++) {
                if (key <= matrix[i][matrix.length-1]) {
                    return binarySearch(matrix[i], key);
                }
        }
        return false;
    }

    private static boolean binarySearch(int[] row, int key) {

        int low = 0;
        int high = row.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == row[mid])
                return true;
            if (key < row[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
