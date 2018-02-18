package com.algo.string;

import java.util.Arrays;

/**
 * Created by sanjay.nayak on 1/26/18.
 */
public class LongestNonRepeatingSubstring {

    public static void main(String[] args) {
        String input = "ABCDABDEFGCABD";
        String output = longestNonRepeatingSubString(input);
        System.out.print("Output :: "+output);
    }

    private static String longestNonRepeatingSubString(String input) {
        char[] array = input.toCharArray();
        int[] ascii = new int[256];
        Arrays.fill(ascii,0);
        String result = new String();
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            int asciiValue = (int)array[i];
            if(ascii[asciiValue]==0){
                ascii[asciiValue] =  1;
            }else{
                result = input.substring(j,i).length()>result.length()?input.substring(j,i):result;
                j++;
            }
        }
        return result;
    }
}
