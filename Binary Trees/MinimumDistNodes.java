public class MinimumDistNodes{
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
        System.out.println(tree.MinimumDistanceBetweenNodes(root, 5, 6));
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
    public Node LCA2(Node root, int n1, int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLCA = LCA2(root.left, n1, n2);
        Node rightLCA = LCA2(root.right, n1, n2);
        if(leftLCA==null) return rightLCA;
        if(rightLCA==null) return leftLCA;
        return root;
    }
    public int MinimumDistanceBetweenNodes(Node root, int n1, int n2){
        Node lca = LCA2(root, n1, n2);
        int distance1 = distLCA(lca, n1);
        int distance2 = distLCA(lca, n2);

        return distance1+distance2;
    }
    public int distLCA(Node root, int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftSearch = distLCA(root.left, n);
        int rightSearch = distLCA(root.right, n);
        if(leftSearch==-1 && rightSearch==-1){
            return -1;
        } else if(leftSearch==-1){
            return rightSearch+1;
        } else{
            return leftSearch+1;
        }
    }
}