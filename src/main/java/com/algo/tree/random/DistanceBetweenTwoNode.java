package com.algo.tree.random;

/**
 * Created by sanjay.nayak on 6/5/17.
 */
public class DistanceBetweenTwoNode {


    public int distance(Node current, int s, int d) {

        int dis = 0;
        if (current.data == s || current.data == d)
            return dis;
        else {
            dis += distance( current.left, s, d);
            dis += distance( current.right, s, d);
        }

        return dis;
    }
}
