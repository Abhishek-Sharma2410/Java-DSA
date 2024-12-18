import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
public class SlidingWindow{
    public static ArrayList<Integer> slidingWindowMaximum(int arr[], int k, ArrayList<Integer> list){
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            if(!deque.isEmpty() && deque.peek()< i-k){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && arr[deque.getLast()]<arr[i]){
                deque.removeLast();
            }
            deque.add(i);
            if(i>=k-1){
                list.add(arr[deque.getFirst()]);
            }
        }
        return list;
    }
    public static void main(String args[]){
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        ArrayList<Integer> list = new ArrayList<>();
        slidingWindowMaximum(arr, 3, list);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}