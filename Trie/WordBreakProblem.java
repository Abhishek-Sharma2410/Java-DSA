public class WordBreakProblem{
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

    public static boolean search(String word){
        Node current = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(current.children[idx]==null){
                return false;
            }
            current = current.children[idx];
        }
        return current.endOfWord==true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0, i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        String words[] = {"leet", "code"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        String key = "leetcod";
        System.out.println(wordBreak(key));
    }
}