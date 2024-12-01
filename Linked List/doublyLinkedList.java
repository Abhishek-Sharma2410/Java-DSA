public class doublyLinkedList{
    public static void main(String args[]){
        DoublyLinkedList  newList = new DoublyLinkedList();
        newList.addFirst(5);
        newList.addFirst(4);
        newList.addFirst(3);
        newList.addFirst(2);
        newList.addFirst(1);
        newList.addLast(6);
        newList.printList();
    }
}

class DoublyLinkedList{
    private class Node{
        int data;
        Node next;
        Node previous;

        private Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    private Node head;
    private Node tail;
    public int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        newNode.next = null;
        tail = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        System.out.print("null");
        while(temp!=null){
            System.out.print(temp.data + " -> <-");
            temp = temp.next;
        }
        System.out.println("null");
    }
}