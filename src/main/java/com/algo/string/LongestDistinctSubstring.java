package com.algo.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanjay.nayak on 7/23/17.
 */
public class LongestDistinctSubstring {

    public static void main(String args[]) {
        //String str = "abababcdefababcdab";
        String str = "geeksforgeeks";
       int result =  new LongestDistinctSubstring().findDistinctSubstring(str);
       System.out.println("count :: "+result);
    }

    private int findDistinctSubstring(String str) {

        char[] array = str.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        int count  = 0;
        int maxSeq = 0;
        for (int i = 0; i < array.length; i++) {

            Character ch = array[i];
            if(map.containsKey(ch)){
                maxSeq = Math.max(maxSeq,count);
                count = 0;
                map.clear();
            }else {
               count++;
               map.put(ch,ch);
            }
            maxSeq = Math.max(maxSeq,count);
        }
        return maxSeq;
    }
}
