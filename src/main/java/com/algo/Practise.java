package com.algo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanjay.nayak on 2/6/18.
 */
public class Practise {


    public static void main(String args[]) {

        int[] twoSum = {2,7,11,15};
        int twoSumTarget = 13;
        //twoSum(twoSum,twoSumTarget);
        twoSumSortedArray(twoSum,twoSumTarget);
    }

    private static void twoSum(int[] twoSum, int twoSumTarget) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < twoSum.length ; i++) {
            if(map.containsKey(twoSum[i])){
                result[0] = twoSum[map.get(twoSum[i])];
                result[1] = twoSum[i];
                System.out.print("Numbers : "+result[0]+" , "+result[1]);
                break;
            }else{
                map.put(twoSumTarget-twoSum[i],i);
            }
        }
    }

    private static void twoSumSortedArray(int[] array, int target) {

        int endIndex = array.length-1;
        for (int startIndex = 0; startIndex < array.length & endIndex>0 ; startIndex++) {
            int sum = array[startIndex]+array[endIndex];
            if(sum==target){
                System.out.print("Numbers : "+array[startIndex]+" , "+array[endIndex]);
                break;
            }else if(sum>target){
                endIndex--;
                startIndex--;
            }
        }
    }
}
