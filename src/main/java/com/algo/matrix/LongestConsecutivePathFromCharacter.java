package com.algo.matrix;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sanjay.nayak on 6/25/17.
 */
public class LongestConsecutivePathFromCharacter {

    List<Character> list = new LinkedList<>();

    public static void main(String args[]) {

        char mat[][] = {{'a', 'c', 'd'},
                        {'h', 'b', 'e'},
                        {'i', 'g', 'f'}};
        char init = 'a';
        int row = 3;
        int column = 3;
        List<Character> result = new LongestConsecutivePathFromCharacter().findLongestPath(mat, init, row, column, new int[row][column]);
        System.out.print("Output :: " + result);
    }

    private List<Character> findLongestPath(char[][] mat, char init, int r, int c, int[][] dp) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == init) {
                    return findPathFromSource(mat, (int)init, i, j, r-1, c-1, dp);
                }
            }
        }
        return null;
    }

    private List<Character> findPathFromSource(char[][] mat, int init, int i, int j, int r, int c, int[][] dp) {

        if (init  == (int)mat[i][j]) {
            list.add(mat[i][j]);
            init = init+1;
        } else {
            return list;
        }

        if (i <r)
            findPathFromSource(mat, init, i + 1, j, r, c, dp);
        if (i < r && j < c)
            findPathFromSource(mat, init, i + 1, j + 1, r, c, dp);
        if (j < c)
            findPathFromSource(mat, init, i, j + 1, r, c, dp);
        if (i > 0)
            findPathFromSource(mat, init, i - 1, j, r, c, dp);
        if (i >0 && j > 0)
            findPathFromSource(mat, init, i - 1, j - 1, r, c, dp);
        if (j > 0)
            findPathFromSource(mat, init, i, j - 1, r, c, dp);
        if(i < r && j>0)
            findPathFromSource(mat, init, i+1, j - 1, r, c, dp);
        if(j < c && i>0)
            findPathFromSource(mat, init, i-1, j + 1, r, c, dp);


        return list;
    }
}
