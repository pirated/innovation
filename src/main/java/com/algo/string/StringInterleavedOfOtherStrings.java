package com.algo.string;

/**
 * Created by sanjay.nayak on 7/8/17.
 */
public class StringInterleavedOfOtherStrings {
    int i = 0;
    int j = 0;
    int k = 0;

    public static void main(String args[]) {
        String A = "XXY";
        String B = "XXZ";
        String C = "XXZXXXY";

      /* boolean result =  new StringInterleavedOfOtherStrings().findIfStringInterleacedOfOThereString(A,B,C);
       System.out.print("Result :"+ result);*/
       // boolean result = new StringInterleavedOfOtherStrings().findIfStringInterleacedOfOThereStringDP(A.toCharArray(), B.toCharArray(), C.toCharArray());
        //System.out.print("Result :" + result);
    }


    private boolean findIfStringInterleacedOfOThereString(String a, String b, String c) {

        if (a == null || b == null) return true;
        return (a.charAt(i) == c.charAt(k)) & findIfStringInterleacedOfOThereString(a.substring(++i), b, c.substring(k++)) &&
                (b.charAt(j) == c.charAt(k)) & findIfStringInterleacedOfOThereString(a, b.substring(++j), c.substring(k++));
    }

   /* private boolean findIfStringInterleacedOfOThereStringDP(char[] a, char[] b, char[] c) {

        int m = a.length;
        int n = b.length;
        boolean[][] dp = new boolean[m+1][n+1];

        for (int l = 0; l < m ; l++) {
            for (int o = 0; o < n ; o++) {


            }
            for (int o = 0; o < ; o++) {
                
            }
        }
        return false;
    }*/


}
