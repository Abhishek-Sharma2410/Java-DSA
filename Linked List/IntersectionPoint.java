public class IntersectionPoint{
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.printList();
        LinkedList newList = new LinkedList();
        newList.addFirst(7);
        newList.addFirst(6);
        newList.addFirst(3);
        newList.addFirst(2);
        newList.addFirst(1);
        newList.printList();
    }
}

class LinkedList{
    private class Node{
        int data;
        Node next;

        private Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}