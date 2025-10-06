public class One {
    static class Node {
        Node[] children;
        boolean eow; // end of word

        public Node() {
            children = new Node[26]; // a to z
            eow = false;
        }
    }

    static Node root = new Node(); // Root node
 
    public static void insert(String word) { // O(L), L = length of the word
        Node node = root; // Use a temporary pointer to traverse

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (node.children[idx] == null) {
                node.children[idx] = new Node(); // Add new node
            }

            node = node.children[idx]; // Move to the next node
        }

        node.eow = true; // Mark end of word
    }

    public static boolean search(String key) { //O(L) L - key length
        Node node = root; // Use a temporary pointer to traverse

        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';

            if (node.children[idx] == null) {
                return false; // If path does not exist, return false
            }

            node = node.children[idx]; // Move to the next node
        }

        return node.eow; // Return true only if it's the end of a valid word
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    public static boolean startWith(String prefix) { //O(L) L - key length
        Node node = root; // Use a temporary pointer to traverse

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if (node.children[idx] == null) {
                return false; // If path does not exist, return false
            }

            node = node.children[idx]; // Move to the next node
        }

        return true;
    }

    //count Unique Substring
    // unique substring is -> all prefix of all suffix or
    // unique substring is -> all suffix of all prefix
    // 1. find all suffix of String
    // 2. create a trie from suffix
    // 3. count nodes of trie
    //  total nodes of trie == count of unique prefix
    
    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any","is","car" };
        
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("there")); // true
        System.out.println(search("at"));  // false
        System.out.println(search("an"));    // false

        System.out.println(wordBreak("theirisacar"));

        String prefix = "the";
        System.out.println(startWith(prefix));
        System.out.println(startWith("abs")); 
    }
}
