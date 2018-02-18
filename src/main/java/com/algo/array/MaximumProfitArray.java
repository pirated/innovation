package com.algo.array;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanjay.nayak on 4/29/17.
 */
public class MaximumProfitArray {

    public static void main(String args[]){
        double[] array = {2, 30, 15, 10, 8, 25, 80};
        System.out.println(maxProfitSingleTx(array));
        //System.out.println(maxProfitDoubleTx(array));
    }



    public static double maxProfitSingleTx(double[] a){

        double min = Integer.MAX_VALUE;
        double max = 0;

        for (int i = 0; i < a.length; i++) {
            min = Math.min(min,a[i]);
            max = Math.max(max,a[i]);
        }
     return max-min;
    }



    public static double maxProfit(double[] prices){
        double maxProfit = 0.0;
        double minPrice = Double.MAX_VALUE;

        for(double price : prices){
            maxProfit = Math.max(maxProfit, price-minPrice);
            minPrice = Math.min(minPrice,price);
        }
        return maxProfit;
    }

    public static void maxTwoProfitZone(double[] prices){
        double maxProfit = 0.0;
        double minPrice = Double.MAX_VALUE;
        double maxProfit1 = 0.0;

        for(double price : prices){
            maxProfit = Math.max(maxProfit, price-minPrice);
            minPrice = Math.min(minPrice,price);
            maxProfit1 =  Math.max(maxProfit,maxProfit1);
        }
        System.out.println(maxProfit1+"::"+maxProfit);
    }
}
