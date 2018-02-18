package com.algo.matrix;

/**
 * Created by sanjay.nayak on 6/25/17.
 */
public class ShortestPathInBinaryMaze {

    int rLimit = 0;
    int cLimit = 0;
    int path = 0;

    public static void main(String args[]) {

        int[][] matrix={{1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1, 1, 1, 0, 1, 1},
                        {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                        {1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
                        {1, 0, 1, 1, 1, 1, 0, 1, 0, 0},
                        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                        {1, 0, 1, 1, 1, 1, 0, 1, 1, 1},
                        {1, 1, 0, 0, 0, 0, 1, 0, 0, 1}};

        int[] source = {0, 0};
        int[] destination = {3, 4};
        int row = 9;
        int column = 10;

        int path = new ShortestPathInBinaryMaze().findShortestPath(matrix, source, destination, row, column);
    }

    private int findShortestPath(int[][] matrix, int[] s, int[] d, int r, int c) {

        rLimit = r;
        cLimit = c;
        boolean[][] visited = new boolean[r][c];
        return findShortestPathRec(matrix, s, d, visited, s[0], s[1]);
    }

    private int findShortestPathRec(int[][] matrix, int[] s, int[] d, boolean[][] visited, int r, int c) {


        if ((r >= rLimit || c >= cLimit ) || (r < 0 || c < 0 )) {
            return 0;
        }

        System.out.print("row : " + r + " , column : " + c + "\n");
        if (r == d[0] && c == d[1]) {
            System.out.print("Path found at : "+path+" \n");
            return path;
        }

        if (matrix[r][c] == 1 && !visited[r][c]) {
            path++;
            visited[r][c] = true;
        } else {
            visited[r][c] = true;
            return 0;
        }

        if (matrix[r + 1][c] != 0)
            findShortestPathRec(matrix, s, d, visited, r + 1, c);
        if (matrix[r][c + 1] != 0)
            findShortestPathRec(matrix, s, d, visited, r, c + 1);
        if(r>0 && matrix[r-1][c] !=0)
            findShortestPathRec(matrix, s, d, visited, r-1, c);
        if(c>0 && matrix[r][c-1] !=0)
            findShortestPathRec(matrix, s, d, visited, r-1, c);

        return  path;
    }
}
