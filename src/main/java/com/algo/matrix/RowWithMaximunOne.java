package com.algo.matrix;

/**
 * Created by sanjay.nayak on 6/25/17.
 */
public class RowWithMaximunOne {

    int maxNumberofROw = -1;
    int maxRow = -1;

    public static void main(String args[]) {
        int[][] matrix = {{0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        int row = new RowWithMaximunOne().findRowWithMaxOnes(matrix, 4, 4);
        System.out.print("row :: " + row);
    }

    private int findRowWithMaxOnes(int[][] matrix, int r, int c) {

        for (int i = 0; i < r; i++) {
            int c1 = findFirstOccurance(matrix[i], 0, c-1);
            int tempMaxNumberofROw = Math.max(maxNumberofROw, c1);
            if (tempMaxNumberofROw != maxNumberofROw) {
                maxRow = i;
            }
        }

        return maxRow;
    }

    private int findFirstOccurance(int[] row, int low, int high) {

        int mid = (low + high) / 2;


        // check if the middle element is first 1
        if (mid==0 || row[mid - 1] == 0 && row[mid] == 1)
            return mid;
        else if (row[mid] == 0)
            return findFirstOccurance(row, (mid + 1), high);
        else
            return findFirstOccurance(row, low, (mid - 1));
    }


}

