public class BuildBST{
    public static void main(String args[]){
        int Nodes[] = {5, 1, 3, 4, 2, 7};
        BinaryTree tree = new BinaryTree();
        Node root = null;

        for(int i=0; i<Nodes.length; i++){
            root = tree.insert(root, Nodes[i]);
        }
        System.out.println(root.data);
        tree.inOrderTraversal(root);
        System.out.println(tree.search(root, 7));
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
    public boolean search(Node root, int key){
        if(root==null) return false;
        if(root.data==key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        } else{
            return search(root.right, key);
        }
    }
    public void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
}