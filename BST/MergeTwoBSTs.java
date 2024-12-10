import java.util.ArrayList;
public class MergeTwoBSTs{
    public static void main(String args[]){
            // BST 1

            //   2
            //  / \
            // 1   4 
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

            // BST 2

            //   9
            //  / \
            // 3   12

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        BinaryTree tree = new BinaryTree();
        Node finalRoot = tree.mergeBST(root1, root2);
        tree.preOrderTraversal(finalRoot);
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
    public Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        inorderTraversal(root1, list1);
        inorderTraversal(root2, list2);
        ArrayList<Integer> finalList = new ArrayList<>();
        int i=0, j=0; 
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i) <= list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            }
            else{
                finalList.add(list2.get(j));
                j++;
            }
        }
        while(i<list1.size()){
            finalList.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            finalList.add(list2.get(j));
            j++;
        }
        Node root = createBalancedBST(finalList, 0, finalList.size()-1);
        return root;
    }
    public void inorderTraversal(Node root, ArrayList<Integer> list){
        if(root==null) return;
        inorderTraversal(root.left, list);
        list.add(root.data);
        inorderTraversal(root.right, list);
    }
    public Node createBalancedBST(ArrayList<Integer> list, int start, int end){
        if(start>end) return null;
        int mid = start + (end-start)/2;
        Node root = new Node(list.get(mid));
        root.left = createBalancedBST(list, start, mid-1);
        root.right = createBalancedBST(list, mid+1, end);
        return root;
    }
    public void preOrderTraversal(Node root){
        if(root==null) return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}