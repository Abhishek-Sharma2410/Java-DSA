import java.util.PriorityQueue;
public class CreationPQ{
    public static void main(String args[]){
        PriorityQueue<Integer> pq =  new PriorityQueue<>();

        pq.add(3);
        pq.add(9);
        pq.add(4);
        pq.add(10);
        pq.add(6);

        while(!pq.isEmpty()){
            System.out.print(pq.remove() + " ");
        }
        System.out.println();
    }
}