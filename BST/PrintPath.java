import java.util.ArrayList;
public class PrintPath{
    public static void main(String args[]){
            //     BST 

            //     8
            //    / \
            //   5   10
            //  / \    \
            // 3   6    11
            //           \ 
            //            14
        ArrayList<Node> list = new ArrayList<>();
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        BinaryTree tree = new BinaryTree();
        tree.printPath(root, list);
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
    public void printPath(Node root, ArrayList<Node> list){
        if(root==null) return;
        list.add(root);
        if(root.left==null && root.right==null){
            print(list);
        }
        else{
            printPath(root.left, list);
            printPath(root.right, list);
        }
        list.remove(list.size()-1);
    }
    public void print(ArrayList<Node> list){
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i).data + " ");
        }
        System.out.println();
    }
}