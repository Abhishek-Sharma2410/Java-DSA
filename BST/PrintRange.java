public class PrintRange{
    public static void main(String args[]){
        int Nodes[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        BinaryTree tree = new BinaryTree();
        Node root = null;

        for(int i=0; i<Nodes.length; i++){
            root = tree.insert(root, Nodes[i]);
        }
        tree.printRange(root, 5, 12);
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

class BinaryTree{
    public Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        if(root.data > data){
            root.left = insert(root.left, data);
        } else{
            root.right = insert(root.right, data);
        }
        return root;
    }
    public void printRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        else if(root.data>=k1 && root.data<k2){
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.left, k1, k2);
        }
        else if(root.data>k1){
            printRange(root.right, k1, k2);
        }

        else{
            printRange(root.left, k1, k2);
        }
    }
}