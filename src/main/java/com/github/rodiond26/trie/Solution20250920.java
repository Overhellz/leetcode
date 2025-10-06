package com.github.rodiond26.trie;

import java.util.*;

public class Solution20250920 {
}

class Solution208 {
}

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isTerminal;
}

class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.children.containsKey(word.charAt(i))) {
                node.children.put(word.charAt(i), new TrieNode());
            }
            node = node.children.get(word.charAt(i));
        }
        node.isTerminal = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.children.containsKey(word.charAt(i))) {
                return false;
            }
            node = node.children.get(word.charAt(i));
        }
        return node.isTerminal;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (!node.children.containsKey(prefix.charAt(i))) {
                return false;
            }
            node = node.children.get(prefix.charAt(i));
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */


class Solution1268 {
    Trie2 trie = new Trie2();

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        for (String product : products) {
            trie.insert(product);
        }

        TrieNode2 node = trie.root;

        List<List<String>> resultList = new ArrayList<>();
        for (char ch : searchWord.toCharArray()) {
            if (node!=null && node.children.containsKey(ch)){
                node = node.children.get(ch);
                resultList.add(node.words.stream().limit(3).toList());
            } else {
                node = null;
                resultList.add(Collections.emptyList());
            }
        }

        return resultList;
    }
}

class TrieNode2 {
    Map<Character, TrieNode2> children = new HashMap<>();
    Set<String> words = new TreeSet<>();
}

class Trie2 {

    TrieNode2 root;

    public Trie2() {
        root = new TrieNode2();
    }

    public void insert(String word) {
        TrieNode2 node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode2());
            node = node.children.get(ch);
            node.words.add(word);
        }
    }

    public List<String> search(String word) {
        TrieNode2 node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.children.containsKey(word.charAt(i))) {
                return Collections.emptyList();
            }
            node = node.children.get(word.charAt(i));
        }
        return node.words.stream().limit(3).toList();
    }
}
