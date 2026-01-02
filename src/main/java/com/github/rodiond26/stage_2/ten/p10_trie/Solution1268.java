package com.github.rodiond26.stage_2.ten.p10_trie;

import java.util.*;

public class Solution1268 {
    Trie2 trie = new Trie2();

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        for (String product : products) {
            trie.insert(product);
        }

        Node2 node = trie.root;

        List<List<String>> result = new ArrayList<>();
        for (char ch : searchWord.toCharArray()) {
            if (node != null && node.children.containsKey(ch)) {
                node = node.children.get(ch);
                result.add(node.words.stream().limit(3).toList());
            } else {
                node = null;
                result.add(Collections.emptyList());
            }
        }
        return result;
    }
}

class Node2 {
    Map<Character, Node2> children = new HashMap<>();
    Set<String> words = new TreeSet<>();
}

class Trie2 {

    Node2 root;

    public Trie2() {
        root = new Node2();
    }

    public void insert(String word) {
        Node2 node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new Node2());
            node = node.children.get(ch);
            node.words.add(word);
        }
    }

    public List<String> search(String word) {
        Node2 node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.children.containsKey(word.charAt(i))) {
                return Collections.emptyList();
            }
            node = node.children.get(word.charAt(i));
        }
        return node.words.stream().limit(3).toList();
    }
}
