import java.util.LinkedList;
import java.util.Queue;
public class KthLevel{
    public static void main(String args[]){
        //     1
        //    / \
        //   2   3
        //  / \ / \
        // 4   56  7 
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        BinaryTree tree = new BinaryTree();
        tree.printKthLevel(root, 3);
        System.out.println();
        tree.printKthLevelRecursion(root, 3, 1);
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
    public void printKthLevel(Node root, int k){
        if(root==null){
            return;
        }
        int i=1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currentNode = q.remove();
            if(currentNode==null){
                i++;
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else{
                if(i==k){
                    System.out.print(currentNode.data + " ");
                }
                if(currentNode.left!=null) q.add(currentNode.left);
                if(currentNode.right!=null) q.add(currentNode.right);
            }
            if(i>k){
                break;
            }
        }
    }
    public void printKthLevelRecursion(Node root, int k, int level){
        if(root == null || k==0){
            return;
        }
        if(level==k){
            System.out.print(root.data + " ");
            return;
        }
        printKthLevelRecursion(root.left, k, level+1);
        printKthLevelRecursion(root.right, k, level+1);
    }
}