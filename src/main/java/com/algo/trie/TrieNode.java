package com.algo.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sanjay.nayak on 6/15/17.
 */
public class TrieNode {

    private char c;
    private Map<Character,TrieNode> link  = new HashMap<>();




    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public Map<Character, TrieNode> getLink() {
        return link;
    }

    public void setLink(Map<Character, TrieNode> link) {
        this.link = link;
    }
}
