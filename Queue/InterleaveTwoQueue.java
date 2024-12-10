import java.util.LinkedList;
import java.util.Queue;
public class InterleaveTwoQueue{
    public static void interleaveTwoQueue(Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();
        int n = q.size()/2;
        for(int i=0; i<n; i++){
            q1.add(q.remove());
        }
        while(!q.isEmpty() && !q1.isEmpty()){
            System.out.print(q1.remove() + " " + q.remove() + " ");
        }
        System.out.println(q1.isEmpty());
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleaveTwoQueue(q);
    }
}