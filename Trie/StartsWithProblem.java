public class StartsWithProblem{
    private static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;

        Node(){
            for(int i=0; i<children.length; i++){
                children[i] = null;
            }
        }
    }

    private static Node root = new Node();

    public static void insert(String word){
        Node current = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(current.children[idx]==null){
                current.children[idx] = new Node();
            }
            current = current.children[idx];
        }
        current.endOfWord = true;
    }

    public static boolean startsWith(String prefix){
        Node current = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(current.children[idx]==null){
                return false;
            }
            current = current.children[idx];
        }
        return true;
    }

    public static void main(String args[]){
        String words[] = {"apple", "app", "mango", "man", "woman"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(startsWith("a"));
    }
}