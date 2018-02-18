package com.algo.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanjay.nayak on 6/23/17.
 */
public class SubsetsWithGivenSum {


    public static void main(String args[]) {

        int[] array = {1 ,2, 3, 4,
                5};
        int sum = 10;

        new SubsetsWithGivenSum().getSubSetWithSum(array, sum);
    }

    private void getSubSetWithSum(int[] array, int sum) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,null);
        int sumSoFar = 0;
        int count =0;

        for (int i = 0; i < array.length; i++) {

                if(map.containsKey(sum-array[i])){
                    count++;
                }else if(sumSoFar+ array[i]==sum){
                    count++;
                }
                map.put(array[i], null);

                if (sumSoFar < sum && sumSoFar + array[i] < sum) {
                    sumSoFar +=  array[i];
                }else{
                    sumSoFar = 0;
                }

            }

        System.out.print("Count : "+count);
    }
}
