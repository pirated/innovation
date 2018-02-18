package com.algo.array;

/**
 * Created by sanjay.nayak on 6/27/17.
 */
public class FrequencyOfNumber {

    public static void main(String args[]){

        int a[] = {2,2,2,2,2,2,4,4,4,4,10,10,10,18,18,20,20,20,20,20};
        int b = 10;
        new FrequencyOfNumber().findFrequencyOfNumber(a,b);
    }

    private void findFrequencyOfNumber(int[] a, int b) {

        int occurence = findLastOccurence(a,b)-findFirstOccurence(a,b);
        System.out.print("occurence of "+b+" is : "+occurence  );
    }

    private int findFirstOccurence(int[] a, int b) {

        int low = 0;
        int high = a.length-1;

        while(low<=high){

            int mid = (low+high)/2;
            if(a[mid]==b && a[mid-1]!=b){
                return mid;
            }else if(a[mid]<b){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    private int findLastOccurence(int[] a, int b) {
        int low = findFirstOccurence(a, b);
        int high = a.length-1;

        while(low<=high){

            int mid = (low+high)/2;
            if(a[mid]==b && a[mid+1]!=b){
                return mid;
            }else if(a[mid]<=b){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
