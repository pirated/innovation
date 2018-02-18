package com.algo.graph.snaleladder;

/**
 * Created by sanjay.nayak on 6/26/17.
 */
public class SnakeLadderTest {

    public static void main(String args[]){

        // Let us construct the board given in above diagram
        int N = 30;
        int moves[] = new int[N];
        for (int i = 0; i < N; i++)
            moves[i] = -1;

        // Ladders
        moves[2] = 21;
        moves[4] = 7;
        moves[10] = 25;
        moves[19] = 28;

        // Snakes
        moves[26] = 0;
        moves[20] = 8;
        moves[16] = 3;
        moves[18] = 6;

        System.out.println("Min Dice throws required is " +
                new SnakeLadder().getMinDiceThrows(moves, N));

    }
}
