
//Implement a dictionary using trie and implement add, search and delete options
//create a TrieNode class to store a node
import java.util.ArrayList;

class TrieNode {
    char data; // to store data in the Node
    boolean isTerminating;// to check whether the node is a terminating node or not
    TrieNode children[]; // an array to store the reference of the children
    int childCount; // an array to store the number of children

    // a constructor to build a TrieNode
    public TrieNode(char data) {
        this.data = data; // place the data into TrieNode
        this.isTerminating = false; // by default the node should not be a terminating node
        children = new TrieNode[26]; // create a new children array of 26 characters
        childCount = 0; // by default the childCount is Zero
    }

}

public class Trie {
    private TrieNode root;
    public int count;

    public Trie() {
        root = new TrieNode('\0');
    }

    // add a new word
    private void add(TrieNode root, String word) {
        // base case if there is no more character to add,
        // the given character is the last, then make isterminating true
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        // if child is not present, it will be null
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;

        }
        add(child, word.substring(1));
    }

    public void add(String word) {
        add(root, word); // here root
    }

    // search Word
    public boolean search(String word) {
        return search(root, word);
    }

    private boolean search(TrieNode root, String word) {
        // first check the base case if the word exists last character will have
        // isTerminatinf true else false
        // lets check for the last character first
        if (word.length() == 0) {
            return root.isTerminating; // here root is the last character since it changes on every call
        }
        int childIndex = word.charAt(0) - 'a'; // we assume all words to be small
        TrieNode child = root.children[childIndex];
        // if child is not present it will give null, means the word does not exist
        if (child == null) {
            return false;
        }
        return search(child, word.substring(1));
    }

    // delete a word
    public void remove(String word) {
        remove(root, word);
    }

    private void remove(TrieNode root, String word) {
        // base case if it is last word , then set isterminating to false, so that the
        // word stops to exist
        if (word.length() == 0) {
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return; // it means you simply return
        }
        remove(child, word.substring(1));

        // we can remove child node only if it is non terminating and its no of children
        // is 0.
        if (!child.isTerminating && child.childCount == 0) {
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }

    }

    // function to count Words
    public int countWords() {
        return countWords(root); // this root is the root of Trie
    }

    private int countWords(TrieNode root) {
        // variable localized because it is a recursive call
        // also because we add to this variable in the loop
        int count = 0;

        // if condition simplified
        if (root.isTerminating)
            count++;

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null)
                // you need to save the result of the recursive call
                count += countWords(root.children[i]);
        }
        return count;
    }

    // function to find patterns in a given list of strings
    public boolean patternMatching(ArrayList<String> input, String pattern) {

        for (int i = 0; i < input.size(); i++) {

            String string = input.get(i);
            Trie suffixTrie = new Trie();
            for (int j = 0; j < string.length(); j++) {
                suffixTrie.add(string.substring(j));
            }
            if (suffixTrie.search(pattern)) {
                return true;
            }

        }
        return false;

    }

    // program to print the trie
    private void print(TrieNode root, String word) {
        if (root == null) {
            return;
        }

        if (root.isTerminating) {
            System.out.println(word);
        }

        for (TrieNode child : root.children) {
            if (child == null) {
                continue;
            }
            String fwd = word + child.data;
            print(child, fwd);
        }
    }

    public void print() {
        print(this.root, "");
    }

    // pattern matching
    public boolean patternMatching(ArrayList<String> input, String pattern) {

        for (int i = 0; i < input.size(); i++) {

            String string = input.get(i);
            Trie suffixTrie = new Trie();
            for (int j = 0; j < string.length(); j++) {
                suffixTrie.add(string.substring(j));
            }
            if (suffixTrie.search(pattern)) {
                return true;
            }

        }
        return false;

    }

    /* ..................... Palindrome Pair................... */
    public String reverse(String word) {

        String xString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            xString += word.charAt(i);
        }
        return xString;

    }

    public boolean isPalindromePair(ArrayList<String> words) {

        for (int i = 0; i < words.size(); i++) {

            String string = reverse(words.get(i));

            Trie suffixTrie = new Trie();
            for (int j = 0; j < string.length(); j++) {
                suffixTrie.add(string.substring(j));
            }
            for (String word : words) {
                if (suffixTrie.search(word)) {
                    return true;
                }
            }

        }
        return false;

    }
    /// Auto Complete function ////////

    public void autoComplete(ArrayList<String> input, String word) {

        // Write your code here
        int i = 0;
        while (i < input.size()) {
            String a = input.get(i);
            add(root, a);
            i++;
        }
        if (root == null || root.childCount == 0) {
            return;
        }
        TrieNode a = findword(root, word);
        String output = "";
        allwords(a, word, output);

    }

    public void allwords(TrieNode root, String word, String output) {
        if (root == null) {
            return;
        }

        if (root != null && root.childCount == 0) {
            if (output.length() > 0) {
                System.out.println(word + output);
            }
            return;
        }
        if (root != null && root.isTerminating == true) {
            System.out.println(word + output);
        }

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                String ans = output + root.children[i].data;
                allwords(root.children[i], word, ans);
            }
        }
    }

    public TrieNode findword(TrieNode root, String word) {
        if (word.length() == 0) {
            return root;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return null;
        }
        return findword(child, word.substring(1));
    }
}