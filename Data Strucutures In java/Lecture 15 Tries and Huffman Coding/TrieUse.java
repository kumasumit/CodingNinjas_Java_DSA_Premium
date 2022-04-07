public class TrieUse {
    //a class to check the Trie
    public static void main(String[] args) 
    {
        Trie t = new Trie();
        t.add("this");
        t.add("news");
        System.out.println(t.search("word")); //false
        System.out.println(t.search("news")); //true
        System.out.println(t.search("this")); //true
        t.remove("this");
        System.out.println(t.search("this")); //false after removal
        t.remove("news");
        System.out.println(t.search("news")); //false after removal
        System.out.println(t.countWords()); //0 because both words are removed
        t.add("first");
        t.add("second");
        t.add("third");
        System.out.println(t.countWords()); //3 because three words are added
        t.print();
    }
}
