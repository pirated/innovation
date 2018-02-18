package com.algo.string;

/**
 * Created by sanjay.nayak on 12/17/17.
 */
public class StringPermutation {

    public static void main(String args[]) {

        String str = "ABC";
        //new StringPermutation().permutations(str, 0, str.length() - 1);
        new StringPermutation().permutation("", str);
    }

    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);

        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i)
                        + word.substring(i + 1, word.length()));
            }
        }
    }

}
