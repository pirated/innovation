package com.algo.array;

/**
 * Created by sanjay.nayak on 6/27/17.
 *
 * Given a array of integers {-6,-3,-1,2,4,5}
 * which are sorted .Sort square of the numbers.
 * Output {1,4,9,16,25,36}
 */
public class SortSquareNumber {


    public static void main(String args[]) {

        int [] array = {-6,-3,-1,2,4,5};
        new SortSquareNumber().sortSquareNumbers(array);
    }

    private void sortSquareNumbers(int[] array) {

        int start = findFirstNegativeOccurance(array,0,array.length-1);
        int end = start+1;
        int startIndex = 0;

        for (int i = 0; i < array.length; i++) {

           if(absolute(array[start])< array[end]){
               swap(array,i,start);
               start--;
           }else{
               swap(array,end,i);
               end++;
           }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    private void swap(int[] array, int startIndex, int start) {
        int temp = array[startIndex];
        array[startIndex] = array[start]*array[start];
        array[start] = temp;
    }

    private int absolute(int i) {
        return  Math.abs(i);
    }

    private int findFirstNegativeOccurance(int[] row, int low, int high) {



        while(low<=high) {
            int mid = (low + high) / 2;
            // check if the middle element is first 1
            if (row[mid-1] < 0 && row[mid] > 0)
                return mid-1;
            else if (row[mid] >0)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
