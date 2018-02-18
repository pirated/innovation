package com.algo.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sanjay.nayak on 2/13/18.
 */
public class LongeshSubStringKCharacters {

    public static void main(String args[]) {
        String input = "abcbbbbcccbdddadacb";
        int k = 3;
        String output = largestRectangle(input, k);
        System.out.print("Output :: " + output);
    }

    private static String largestRectangle(String input, int k) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int start = 0;
        int end = 0;
        int[] result = new int[2];
        Arrays.fill(result, 0);
        for (int i = 0; i < input.length(); i++) {
            char value = input.charAt(i);

            map.put(value, i);
            if (map.size() > k) {
                if ((end - start) > (result[1] - result[0])) {
                    result[0] = start;
                    result[1] = end;
                }
                map.remove(input.charAt(start));
               start=i;end++;
            }else{end++;}
        }
        return input.substring(result[0], result[1]);
    }
}
