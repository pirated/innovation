package com.algo.array;

/**
 * Created by sanjay.nayak on 6/18/17.
 */
public class MajorityElement {

    public static void main(String args[]){

        int [] array = {3,3,4,2,4,4,2,4,4};
        int majorityElement  = new MajorityElement().findMajorityElement(array);
        System.out.println("majorityElement :: "+majorityElement);
    }

    public int findMajorityElement(int[] array) {

        int majorityElement = array[0];
        int count =1;

        for (int i = 1; i < array.length; i++) {

            if(majorityElement==array[i]){
                count++;
            }else{
                count--;
            }

            //reset values
            if(count==0){
                count = 1;
                majorityElement = array[i];
            }
        }
        return majorityElement;
    }
}
