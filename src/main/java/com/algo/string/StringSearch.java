package com.algo.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanjay.nayak on 1/26/18.
 */
public class StringSearch {

    private static String text = "sky cloud google search sky work blue";
    private static String search = "sky blue";
    private static String SPACE = " ";

    public static void main(String args[]) {

        String SPACE = " ";
        String result = searchText(text.split(SPACE), search.split(SPACE));
        System.out.print("Result ::: "+result);
    }

    private static String searchText(String[] textArray, String[] searchArray) {
        Map<String, Integer> textMap = new HashMap<>();
        for (int i = 0; i < searchArray.length; i++) {
            textMap.put(textArray[i], -1);
        }
        for (int i = 0; i < textArray.length; i++) {
            textMap.put(textArray[i], i);
        }

        String result  = "";
        for (int i = textMap.get(searchArray[0]); i <= textMap.get(searchArray[1]) ; i++) {
            result +=  textArray[i]+SPACE;
        }
        return result;
    }
}
