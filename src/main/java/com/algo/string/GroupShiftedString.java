package com.algo.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by sanjay.nayak on 2/18/18.
 */
public class GroupShiftedString {

    public static void main(String args[]) {
        String keys[] = {"acd", "dfg", "wyz", "yab", "mop",
                "bdfh", "a", "x", "moqs"};

        new GroupShiftedString().groupShiftedStrings(keys);
    }

    private void groupShiftedStrings(String[] keys) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> map
                = new HashMap<String, ArrayList<String>>();

        for (String key : keys) {


        }
    }


}
