package com.algo.heap;

/**
 * Created by sanjay.nayak on 8/30/16.
 */
public class MaxHeapTest {

    public static void main(String args[]) throws Exception{

        MaxHeap mh = new MaxHeap(20);
        mh.insert(25);
        mh.insert(50);
        mh.insert(10);
        mh.insert(70);
        mh.print();
    }
}
