package com.algo.heap;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 8/30/16.
 */
public class MaxHeap {

    private int[] heap;
    private int size;
    private int maxSize;
    /**
     * The number of children each node has
     **/
    private static final int d = 2;

    public MaxHeap(int maxSize) {

        this.size = size;
        this.maxSize = maxSize;
        heap = new int[maxSize + 1];
        heap[0] = Integer.MAX_VALUE;
    }

    public boolean isFull() {
        return size == maxSize ? true : false;
    }

    private int parent(int position) {
        return position / d;
    }

    private int leftChild(int position) {
        return position * 2;
    }

    private int rightChild(int position) {
        return position * 2 + 1;
    }

    public void insert(int element) throws Exception {

        int current = size;
        heap[size++] = element;

        while (heap[current] > parent(current)) {
            swap(current,parent(current));
            current = parent(current);
        }
    }

   public void swap(int current, int parent){
       int tmp = heap[current];
       heap[current] = heap[parent];
       heap[parent] = tmp;
   }

    public void print(){
        if(size==0)
            System.out.println("No element present in the heap.");
        Arrays.stream(heap).forEach(h->{System.out.println(h);});
    }
}
