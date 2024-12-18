public class PrefixProblem{
    private static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;
        int frequency = 0;

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
            current.frequency++;
        }
        current.endOfWord = true;
    }
    public static String uniquePrefix(String word){
        StringBuilder sb = new StringBuilder("");
        Node current = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            current = current.children[idx];
            sb.append(word.charAt(i));
            if(current.frequency==1){
                break;
            }
        }
        return sb.toString();
    }
    
    public static void printArray(String s[]){
        for(int i=0; i<s.length; i++){
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        String words[] = {"zebra", "dog", "duck", "dove"};
        String ans[] = new String[words.length];
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        for(int i=0; i<words.length; i++){
            ans[i] = uniquePrefix(words[i]);
        }
        printArray(ans);
    }
}