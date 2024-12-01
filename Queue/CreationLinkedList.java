public class CreationLinkedList{
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.printList();
        q.remove();
        q.printList();
        System.out.println(q.peek());
    }
}

class Queue{
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

    public boolean isEmpty(){
        return head == null;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = null;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty !!");
            return -1;
        }
        int removedElement = head.data;
        head = head.next;
        return removedElement;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty !!");
            return -1;
        }
        return head.data;
    }
    public void printList(){
        if(head==null){
            System.out.println("Queue is Empty !!");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}