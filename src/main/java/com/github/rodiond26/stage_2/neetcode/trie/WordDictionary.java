package com.github.rodiond26.stage_2.neetcode.trie;

public class WordDictionary {

    private TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (current.children[ch - 'a'] == null) {
                current.children[ch - 'a'] = new TrieNode();
            }
            current = current.children[ch - 'a'];
        }
        current.word = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int j, TrieNode root) {
        TrieNode current = root;

        for (int i = j; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == '.') {
                for (TrieNode child : current.children) {
                    if (child != null && dfs(word, i + 1, child)) {
                        return true;
                    }
                }
                return false;
            } else {
                if (current.children[ch - 'a'] == null) {
                    return false;
                }
                current = current.children[ch - 'a'];
            }
        }
        return current.word;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
