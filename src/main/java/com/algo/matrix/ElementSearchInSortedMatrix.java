package com.algo.matrix;

/**
 * Created by sanjay.nayak on 6/14/17.
 */
public class ElementSearchInSortedMatrix {

    public static void main(String args[]) {

        int[][] matrix = {
                {
                        10, 20, 30, 40
                },
                {
                        15, 25, 35, 45
                },
                {
                        27, 29, 37, 48
                },
                {
                        32, 33, 39, 50
                }
        };

        int searchKey = 29;
        findElement(matrix, searchKey);
    }

    private static void findElement(int[][] matrix, int element) {

        int size = matrix.length;

        for (int r = 0; r < size - 1; ) {
            for (int c = 0; c < size - 1; ) {

                if (element == matrix[r][c]) {
                    System.out.print("Element found at index :: [" + r + "],[" + c + "]");
                    break;
                }

                if (matrix[r + 1][c] >= matrix[r][c + 1]) {
                    if (element >= matrix[r + 1][c]) {
                        r++;
                    } else {
                        c++;
                    }
                } else if (matrix[r][c + 1] >= matrix[r + 1][c])
                    if (element >= matrix[r][c + 1]) {
                        c++;
                    } else {
                        r++;
                    }
            }
        }
    }
}
