package com.algo.array;

/**
 * Created by sanjay.nayak on 8/29/16.
 */
public class MaxProductSubarray {

    public static void main(String args[]){
       int input[] =  {-1, -2, -3, 4};
       int output[] = maximumProductSubarray(input,input.length-1);
    }

    private static int[] maximumProductSubarray(int[] input, int length) {

        int[] result = new int[]{};
        int minDividend =0;
        int product = 1;
        for(int i=0;i<length;i++){
            product = product*input[i];
        }

        int tempProduct = 1;
        int maxProduct = 0;
        int tempDividend = 1;
        for(int j=0;j<length;j++){

            if(input[j]==0 || input[j]==-1){
                minDividend = tempDividend;
                maxProduct = tempProduct;
                continue;
            }

            tempProduct = tempProduct*input[j];
            tempDividend = product/tempProduct;
            if(minDividend==0) {
                minDividend = tempDividend;
                maxProduct = tempProduct;
            } else if(tempDividend < minDividend){
                minDividend = tempDividend;
                maxProduct = tempProduct;
            }
        }
        System.out.println("max product is : "+maxProduct);
        return result;
    }
}
