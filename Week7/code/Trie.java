package week7;

public class Trie {
    TrieNode trieNode;
    /** Initialize your data structure here. */
    public Trie() {
        trieNode = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = trieNode;
        for(int i=0;i<word.length();i++){
            if(node.links[word.charAt(i)-'a'] == null){
                node.links[word.charAt(i)-'a'] = new TrieNode();
            }
            node = node.links[word.charAt(i)-'a'];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = trieNode;
        for(int i=0;i<word.length();i++){
            if(node.links[word.charAt(i)-'a'] == null){
                return false;
            }
            node = node.links[word.charAt(i)-'a'];
        }
        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = trieNode;
        for(int i=0;i<prefix.length();i++){
            if(node.links[prefix.charAt(i)-'a'] == null){
                return false;
            }
            node = node.links[prefix.charAt(i)-'a'];
        }
        return true;
    }
}
class TrieNode {

    // R links to node children
    public TrieNode[] links;

    public final int R = 26;

    public boolean isEnd;

    public TrieNode() {
        links = new TrieNode[R];
    }
}
