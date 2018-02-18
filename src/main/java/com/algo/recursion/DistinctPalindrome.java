package com.algo.recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sanjay.nayak on 12/14/17.
 */
public class DistinctPalindrome {

    Set<String> set = new HashSet<>();
    int first = 0;
    int second = 1;

    public static void main(String args[]) {
        String str = "abaaa";
       int result = new DistinctPalindrome().numberOfDistinctPalindrome(str, 0, str.length());
       System.out.print("Result : "+result);
    }

    private int numberOfDistinctPalindrome(String str, int start, int end) {

        if (isPalindrome(str)) {
            set.add(str);
        }

        numberOfDistinctPalindrome(str.substring(start, end), start++, end--);
        return set.size();

    }

    private boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
