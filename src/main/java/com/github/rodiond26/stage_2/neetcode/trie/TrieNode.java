package com.github.rodiond26.stage_2.neetcode.trie;

public class TrieNode {
    TrieNode[] children;
    boolean word;

    public TrieNode() {
        children = new TrieNode[26];
        word = false;
    }
}
