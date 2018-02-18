package com.algo.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanjay.nayak on 6/15/17.
 * INCOMPLETE
 */
public class TrieImpl {

    private Map<Character,TrieNode> charMap = new HashMap<>();
    private TrieNode trieNode = null;

    public void insert(String key){

        char[] array= key.toCharArray();

        TrieNode node = search(array);

        if(node!=null){

        }

    }

    private TrieNode search(char[] array) {
        if(charMap!=null && charMap.containsKey(array[0])){
            return charMap.get(array[0]);
        }
        return null;
    }
}
