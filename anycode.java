import java.util.Stack;
public class anycode{
    private static class Node{
        char data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static Node constructTree(String str){
        Stack<Character> s = new Stack<>();
        char preorder[] = new char[str.length()];
    }   
    public static void main(String args[]){
        String str = "4(2(3)(1))(6(5))";
        Node root = constructTree(str);
    }
}