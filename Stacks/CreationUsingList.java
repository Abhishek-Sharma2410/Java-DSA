public class CreationUsingList{
    public static void main(String args[]){
        Stack newStack = new Stack();
        newStack.push(3);
        newStack.push(2);
        newStack.push(1);

        while(!newStack.isEmpty()){
            System.out.println(newStack.peek());
            newStack.pop();
        }
    }
}

class Stack{
    private class Node{
        int data;
        Node next;

        private Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head = null;
    public boolean isEmpty(){
        return (head==null);
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }   
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    public int peek(){
        if(isEmpty()) return -1;
        return head.data;
    }
}