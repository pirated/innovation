package com.algo.heap;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 1/18/18.
 */
public class Heap {

    public static final int d = 2;
    private int heapSize;
    private int[] heap;

    public void init(int capacity){
        heapSize=0;
        heap = new int[capacity];
        Arrays.fill(heap,-1);
    }

    public boolean isEmpty(){
        return heapSize==0;
    }

    public boolean isFull(){
        return heapSize==heap.length;
    }

    public void insert(int element) throws Exception {
        if(isFull())
            throw new Exception("Heap is full");
        heap[heapSize++] = element;
        heapifyUp(heapSize-1);
    }

    private void heapifyUp(int limit) {

    }
}
