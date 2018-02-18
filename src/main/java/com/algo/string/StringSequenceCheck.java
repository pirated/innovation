package com.algo.string;

/**
 * Created by sanjay.nayak on 2/10/18.
 */
public class StringSequenceCheck {

    public static void main(String args[]) {
        String str1 = "gksrek";
        String str2 = "geeksforgeeks";
        System.out.print(new StringSequenceCheck().isSeqPresent(str1, str2));
    }

    private boolean isSeqPresent(String str1, String str2) {
        if (str1 == "" || str2 == "")
            return false;

        int index = 0;
        int[] dp = new int[str1.length()];
        for (int i = 0; i < str2.length() && index < str1.length(); i++) {
            if (str2.charAt(i) == str1.charAt(index)) {
                if (index == 0) {
                    dp[index] = 1;
                } else {
                    dp[index] = dp[index - 1] + 1;
                }
                index++;
            }
        }
        return dp[str1.length() - 1] == str1.length();
    }

}
