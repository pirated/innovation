package com.algo.array;

/**
 * Created by sanjay.nayak on 6/28/17.
 */
public class UglyNumber {

    public static void main(String args[]){

        int n = 10;
        int limit = 200;
        int number = new UglyNumber().findUglyNumber(n,limit);
        System.out.print("Number : "+number);
    }

    private int findUglyNumber(int n, int limit) {

        int[] notUglyDP = new int[limit];
        notUglyDP[0] = 1;
        for (int i = 2; i < limit; i++) {
            notUglyDP[i] = -1;
        }
        int index = 0;
        for (int i = 2; i < limit; i++) {

            int p = i;
            boolean loop = true;
            while(loop) {

                if(index-1==n)
                    return notUglyDP[n-1];

                if( p==1){
                    notUglyDP[++index] = i;
                    loop = false;

                }
                if (p % 2 == 0) {
                    p = p/2;
                }else if (p % 3 == 0) {
                    p = p/3;
                }else if (p % 5 == 0) {
                    p = p/5;
                }else{
                    loop = false;
                }

            }
        }
        return notUglyDP[n];
    }
}
