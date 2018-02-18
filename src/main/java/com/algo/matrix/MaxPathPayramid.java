package com.algo.matrix;

/**
 * Created by sanjay.nayak on 6/25/17.
 */
public class MaxPathPayramid {

    int rLimit = 4;
    int cLimit = 4;
    int path = 0;

    public static void main(String args[]) {

        int[][] matrix={{58, 0,  0,  0},
                        {98, 48, 0,  0},
                        {95, 30, 96, 0},
                        {77, 71, 26, 67}};

        int[] source = {0, 0};
        int[] destination = {3, 4};
        int row = 4;
        int column = 4;

        int path = new MaxPathPayramid().findShortestPath(matrix, source, destination, row, column);
        System.out.print("max sum path : "+path);
    }

    private int findShortestPath(int[][] matrix, int[] s, int[] d, int r, int c) {

        rLimit = r;
        cLimit = c;
        boolean[][] visited = new boolean[r][c];
        return findShortestPathRec(matrix, s, d, visited, s[0], s[1]);
    }

    private int findShortestPathRec(int[][] matrix, int[] s, int[] d, boolean[][] visited, int r, int c) {

        if ((r >= rLimit || c >= cLimit ) || matrix[r][c]==0 || (r < 0 || c < 0 )) {
            System.out.print("circuit breaker\n");
            return path;
        }


        System.out.print("row : " + r + " , column : " + c + ", matrix : "+matrix[r][c]+"\n");

        if (matrix[r][c] !=0 && !visited[r][c]) {
            path += matrix[r][c];
        }
        visited[r][c] = true;

        return  Math.max(findShortestPathRec(matrix, s, d, visited, r + 1, c),findShortestPathRec(matrix, s, d, visited, r+1, c + 1));
    }
}
