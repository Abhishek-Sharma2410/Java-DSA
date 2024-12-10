import java.util.ArrayList;
public class ValidBST{
    public static void main(String args[]){
            //     A Valid BST 

            //     8
            //    / \
            //   5   10
            //  / \    \
            // 3   6    11
            //           \ 
            //            14
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        BinaryTree tree = new BinaryTree();   
        ArrayList<Integer> list = new ArrayList<>(); 
        tree.printInorder(root);
        System.out.println(tree.isValidBST(root, list));
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    public boolean isValidBST(Node root, ArrayList<Integer> list){
        if(root==null) return true;
        inorderTraversal(root, list);
        boolean result = true;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1)){
                result = false;
                break;
            }
        }
        return result;
    }
    public void printInorder(Node root){
        if(root==null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }
    public void inorderTraversal(Node root, ArrayList<Integer> list){
        if(root==null) return;
        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
    }
}