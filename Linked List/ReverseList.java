public class ReverseList{
    public static void main(String args[]){
        LinkedList newList = new LinkedList();
        newList.addFirst(5);
        newList.addFirst(4);
        newList.addFirst(3);
        newList.addFirst(2);
        newList.addFirst(1);
        newList.printList();

        newList.reverseList();
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
    public int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void reverseList(){
        Node previous = null;
        Node current = head;
        Node next;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
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