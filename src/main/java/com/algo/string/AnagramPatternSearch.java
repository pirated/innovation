package com.algo.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanjay.nayak on 1/26/18.
 */
public class AnagramPatternSearch {

    public static void main(String args[]) {
        String text = "ideserve";
        String pattern = "veer";
        boolean result = isPatternPresent(text, pattern);
        System.out.print("Result :: " + result);
    }

    private static boolean isPatternPresent(String text, String pattern) {
        if (text == null || pattern == null || text.length() < pattern.length())
            return false;

        Map<Character, Integer> patternMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            patternMap.put(pattern.charAt(i), i);
        }

        int count = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < text.length(); i++) {
            if (patternMap.containsKey(text.charAt(i))) {
                if (count == 0) {
                    start = i;
                } else {
                    end = i;
                }
                count++;
            } else {
                count = 0;
                start = 0;
                end = 0;
            }
            if (count == pattern.length()) {
                System.out.print(text.substring(start, end));
                return true;
            }
        }
        return false;
    }
}
