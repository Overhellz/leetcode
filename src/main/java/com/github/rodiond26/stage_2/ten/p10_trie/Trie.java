package com.github.rodiond26.stage_2.ten.p10_trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.children.containsKey(word.charAt(i))) {
                node.children.put(word.charAt(i), new Node());
            }
            node = node.children.get(word.charAt(i));
        }
        node.isTerminal = true;
    }

    public boolean search(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.children.containsKey(word.charAt(i))) {
                return false;
            }
            node = node.children.get(word.charAt(i));
        }
        return node.isTerminal;
    }

    public boolean startsWith(String prefix) {
        Node node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (!node.children.containsKey(prefix.charAt(i))) {
                return false;
            }
            node = node.children.get(prefix.charAt(i));
        }
        return true;
    }
}

class Node {
    Map<Character, Node> children = new HashMap<>();
    boolean isTerminal = false;
}
