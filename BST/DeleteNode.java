public class DeleteNode{
    public static void main(String args[]){
        int Nodes[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        BinaryTree tree = new BinaryTree();
        Node root = null;

        for(int i=0; i<Nodes.length; i++){
            root = tree.insert(root, Nodes[i]);
        }
        tree.inOrderTraversal(root);
        System.out.println();
        tree.inOrderTraversal(tree.delete(root, 14));
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
    public void inOrderTraversal(Node root){
        if(root==null) return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
    public Node delete(Node root, int key){
        if(root==null){
            return null;
        }
        if(root.data < key){
            root.right = delete(root.right, key);
        }
        else if(root.data > key){
            root.left = delete(root.left, key);
        }
        else{
            // case 1 - No Child (Leaf Node)
            if(root.left==null && root.right==null){
                return null;
            }

            // case - 2 One Child
            if(root.left==null){
                return root.right;
            } else if(root.right==null){
                return root.left;
            }

            // case - 3 Two Child
            else{
                Node IS = inorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
        }
        return root;
    }
    public Node inorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
}