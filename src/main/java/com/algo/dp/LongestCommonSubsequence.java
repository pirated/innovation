package com.algo.dp;

/**
 * Created by sanjay.nayak on 9/12/16.
 */
public class LongestCommonSubsequence {


    public static int minDistance(String word1, String word2) {
        int dp[][] = new int[word1.length()+1][word2.length()+1];
        for(int i = 0; i <= word1.length(); i++) {
            for(int j = 0; j <= word2.length(); j++) {
                if (i == 0 || j == 0) dp[i][j] = 0;
                else {
                    dp[i][j] = (word1.charAt(i - 1) == word2.charAt(j - 1)) ? dp[i - 1][j - 1] + 1
                            : Math.max(dp[i - 1][j], dp[i][j - 1]);

                System.out.print("dp[i-1][j] = " + dp[i - 1][j]+"\n");
                System.out.print("dp[i][j-1] = " + dp[i][j - 1]+"\n");
            }
            }
        }
        int val =  dp[word1.length()][word2.length()];
        return word1.length() - val + word2.length() - val;
    }


    public static int lcsLenght(String input1, String input2) {

        if (input1.length() == 0 || input2.length() == 0)
            return 0;

        if (input1.substring(input1.length() - 1, input1.length()).equals(input2.substring(input2.length() - 1, input2.length()))) {
            return 1 + lcsLenght(input1.substring(0, input1.length() - 1), input2.substring(0, input2.length() - 1));
        } else {
            return Math.max(lcsLenght(input1.substring(0, input1.length()), input2.substring(0, input2.length() - 1)),
                    lcsLenght(input1.substring(0, input1.length() - 1), input2.substring(0, input2.length())));
        }

    }

    public static int lcsLenghtDP(char[] input1, char[] input2) {

        int[][] lcs = new int[input1.length][input2.length];
        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input2.length; j++) {

                if (i == 0 || j == 0)
                    lcs[i][j] = 0;

                if (input1[i] == input2[j]) {
                    lcs[i][j] = 1 + lcs[i - 1][j - 1];
                } else
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);

            }
        }
        return lcs[input1.length - 1][input2.length - 1];
    }

    public static void main(String[] args) {

        String input1 = "AGGTAB";
        String input2 = "GXTXAYB";

       /* int result = lcsLenght(input1, input2);
        System.out.println("result : " + result);

        int dpResult = lcsLenghtDP(input1.toCharArray(),input2.toCharArray());
        System.out.println("dpResult : " + dpResult);*/

        System.out.println("minDistance : " + minDistance("tea","sea"));

    }
}
