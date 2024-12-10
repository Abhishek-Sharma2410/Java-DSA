import java.util.ArrayList;
public class KthAncestor{
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
        root.right.right = new Node(6);
        BinaryTree tree = new BinaryTree();
        System.out.println(tree.kthAncestor(root, 5, 1).data);
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
    public Node kthAncestor(Node root, int n, int k){
        if(root==null){
            return null;
        }
        ArrayList<Node> path = new ArrayList<>();
        getPath(root, n, path);
        return path.get(path.size()-k-1);
    }
    public boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data == n) return true;
        boolean leftPath = getPath(root.left, n, path);
        boolean rightPath = getPath(root.right, n, path);
        if(leftPath || rightPath){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }   
    public int kthAncestorOptimized(Node root, int n, int k){
        if(root == null) return -1;
        if(root.data == n) return 0;
        int distanceLeft = kthAncestorOptimized(root.left, n, k);
        int distanceRight = kthAncestorOptimized(root.right, n, k);
        if(distanceLeft==-1 && distanceRight==-1){
            return -1;
        } 
        int max = Math.max(distanceLeft, distanceRight);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
}