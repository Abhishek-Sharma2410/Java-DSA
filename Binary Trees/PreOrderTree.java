public class PreOrderTree{
    public static void main(String args[]){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree newtree = new BinaryTree();
        Node root = newtree.buildBinarytree(nodes);
        System.out.println(root.data);
    }
}

class Node{
    int data;
    Node right;
    Node left;
    
    Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

class BinaryTree{
    int index = -1;
    public Node buildBinarytree(int nodes[]){
        index++;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildBinarytree(nodes);
        newNode.right = buildBinarytree(nodes);
        return newNode;
    }
}