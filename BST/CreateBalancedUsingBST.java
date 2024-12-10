import java.util.ArrayList;
public class CreateBalancedUsingBST{
    public static void main(String args[]){
        //        BST

        //         8
        //        / \
        //       6   10
        //      /     \
        //     5       11
        //    /         \ 
        //   3           12
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        ArrayList<Integer> list = new ArrayList<>();
        BinaryTree tree = new BinaryTree();
        tree.preOrderTraversal(root);
        System.out.println();
        tree.inorderMaking(root, list);
        Node newRoot = tree.createBalancedBSTUsingBST(list, 0, list.size()-1);
        tree.preOrderTraversal(newRoot);
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
    public Node createBalancedBSTUsingBST(ArrayList<Integer> list, int start, int end){
        if(start>end){
            return null;
        }
        int mid = start + (end-start)/2;
        Node root = new Node(list.get(mid));
        root.left = createBalancedBSTUsingBST(list, start, mid-1);
        root.right = createBalancedBSTUsingBST(list, mid+1, end);
        return root;
    }
    public void inorderMaking(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        inorderMaking(root.left, list);
        list.add(root.data);
        inorderMaking(root.right, list);
    }
    public void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}