import java.util.Deque;
import java.util.LinkedList;
public class StackUsingDeque{
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.print(s.pop()+ " ");
        }
    }
}

class Stack{
    Deque<Integer> deque = new LinkedList<>();

    public boolean isEmpty(){
        return deque.isEmpty();
    }
    public void push(int data){
        deque.addLast(data);
    }
    public int pop(){
        return deque.removeLast();
    }
    public int peek(){
        return deque.getLast(); 
    }
}