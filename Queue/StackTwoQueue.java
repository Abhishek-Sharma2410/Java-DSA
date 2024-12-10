import java.util.LinkedList;
import java.util.Queue;
public class StackTwoQueue{
    public static void main(String args[]){
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        System.out.println("Peeked Element : " + s1.peek());
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}

class Stack{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public boolean isEmpty(){
        return (q1.isEmpty() && q2.isEmpty());
    }
    public void push(int data){
        if(q1.isEmpty() && q2.isEmpty()){
            q1.add(data);
            return;
        }
        if(!q1.isEmpty()){
            q1.add(data);
        }
        else{
            q2.add(data);
        }
    }
    public int pop(){
        if(q1.isEmpty() && q2.isEmpty()){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        int top;
        if(q1.isEmpty()){
            while(q2.size() > 1){
                q1.add(q2.remove());
            }
            top = q2.remove();
        }
        else{
            while(q1.size() > 1){
                q2.add(q1.remove());
            }            
            top = q1.remove();
        }
        return top;
    }
    public int peek(){
        if(q1.isEmpty() && q2.isEmpty()){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        int top;
        if(q1.isEmpty()){
            while(q2.size() > 1){
                q1.add(q2.remove());
            }
            top = q2.peek();
            q1.add(q2.remove());
        }
        else{
            while(q1.size() > 1){
                q2.add(q1.remove());
            }            
            top = q1.peek();
            q2.add(q1.remove());
        }
        return top;
    }
}