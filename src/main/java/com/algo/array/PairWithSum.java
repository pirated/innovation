package com.algo.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanjay.nayak on 6/18/17.
 */
public class PairWithSum {

    public static void main(String args[]){

        int [] array = {1, 4, 45, 6, 10, -8};
        int sum = 16;
        new PairWithSum().findPairWithSumK(array, sum);
    }

    private void findPairWithSumK(int[] array, int sum) {
        int m=0;int n=0;
        Map<Integer,Integer> local = new HashMap<>(array.length);
        for (int i = 0; i < array.length; i++) {
            int find = array[i]<sum?sum-array[i]: array[i]-sum;
            if(local.containsKey(find)){
                m = array[i];
                n = find;
            }
            local.put(array[i],null);

        }
        System.out.println(m+"+"+n+"="+sum);
    }


}
