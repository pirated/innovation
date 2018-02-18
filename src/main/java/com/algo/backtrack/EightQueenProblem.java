package com.algo.backtrack;

/**
 * Created by sanjay.nayak on 7/24/17.
 */
public class EightQueenProblem {

    public static void main(String args[]){
        int row = 7;
        int col = 7;
        int[][] chessBoard = new int[8][8];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
                chessBoard[i][j] = 0;
            }
        }
        int queen = 8;
        chessBoard = new EightQueenProblem().positionQueen(chessBoard,queen, row, col, 0 , 0);

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++) {
               System.out.println(chessBoard[i][j]);
            }
        }
    }

    private int [][]  positionQueen(int[][] chessBoard, int queen, int row, int col, int m, int n) {

        for (int i=m;i<row;i++){
            for (int j=n;j<col;j++) {
                if(i==row-1 || j==col-1)
                    positionQueen(chessBoard, queen, row, col, m-1,n-1);
                if(chessBoard[i][j]==0) {
                    chessBoard[i][j] = 2;
                    placeQueen(chessBoard,i,j,row,col);
                    break;
                }
            }
        }

        return chessBoard;
    }

    private void placeQueen(int[][] chessBoard,int i , int j, int row, int col) {

        for (int k = i; k <row ; k++) {
                chessBoard[i][k] = 1;
        }
        for (int k = j; k <row ; k++) {
            chessBoard[j][k] = 1;
        }
        for (int k = i,l=j; k <row & l<col; k++,l++) {
            chessBoard[k][l] = 1;
        }
    }
}
