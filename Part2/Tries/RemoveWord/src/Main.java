public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("care");

        trie.remove("car");
        System.out.println(trie.contains("car"));
        System.out.println(trie.contains("care"));

    }
}