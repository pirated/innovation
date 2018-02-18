package com.algo.string;

/**
 * Created by sanjay.nayak on 6/15/17.
 */
public class LongestCommonPrefix {

    public static void main(String args[]) {

        String[] array = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String result = new LongestCommonPrefix().findLongestCommonPrefix(array);
        System.out.print("Common string is : "+result);
    }

    private String findLongestCommonPrefix(String[] input) {

        int[] ascii = new int[256];

        for (int i = 0; i < ascii.length; i++) {
            ascii[i] = 0;
        }

        for (String str : input) {

            char[] array = str.toCharArray();
            for (int i = 0; i < array.length; i++) {

                //if (ascii[(int) array[i]] == 0) {
                    ascii[(int) array[i]] += 1;
                //}
            }
        }

        String commonString = "";
        for (char key : input[0].toCharArray()) {

            if (ascii[(int) key] % input.length == 0) {
                commonString += key;
            }else {
                break;
            }
        }

        return commonString;
    }
}
