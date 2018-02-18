package com.algo.array;

/**
 * Created by sanjay.nayak on 11/13/17.
 * <p>
 * sort an araay consiting of [0 2 1 2 0]
 */
public class SortArray {

    public static void main(String args[]) {

        int[] array = {0, 2, 1, 2, 0}; // 0, 2, 1,0,1,1,0 2, 0
        SortArray sortArray = new SortArray();
        sortArray.sort(array);

    }

    private void sort(int[] array) {

       int start = 0;
       int mid = 0;
       int pivot = 1;
       int temp;
       int end = array.length-1;

       while (start<end){

           if(array[mid]<pivot) { // If current element is 0
               temp = array[start];
               array[start] = array[mid];
               array[mid] = temp;
               mid++;
               start++;
           }else if(array[mid]>pivot){ // If current element is 2
               temp = array[end];
               array[end] = array[mid];
               array[mid] = temp;
               end--;
           }else{
               mid++;
           }
       }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
