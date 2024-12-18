import java.util.ArrayList;
public class InsertionInHeap{
    public static void main(String args[]){
        Heap pq = new Heap();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(9);

        while(!pq.isEmpty()){
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
        System.out.println();
    }
}

class Heap{
    ArrayList<Integer> list = new ArrayList<>();
    public boolean isEmpty(){
        return list.size()==0;
    }
    public void add(int data){
        list.add(data);

        int idx = list.size()-1;

        while(idx>0){
            int parentIdx = (idx-1)/2;

            if(list.get(parentIdx) > list.get(idx)){
                int temp = list.get(parentIdx);
                list.set(parentIdx, list.get(idx));
                list.set(idx, temp);
                idx = parentIdx;
            }
            else{
                break;
            }
        }
    }
    public int peek(){
        return list.get(0);
    }
    public int remove(){
        int firstElement = list.get(0);

        //Step - 1 (Swapping the first and Last Element)
        int temp = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1, temp);

        //Step - 2 (Deleting the last value)
        list.remove(list.size()-1);

        //Step - 3 (Heapify)
        heapify(0);
        return firstElement;
    }
    private void heapify(int idx){
        int left = 2*idx+1;
        int right = 2*idx+2;
        int minIdx = idx;

        if(left < list.size() && list.get(minIdx) > list.get(left)){
            minIdx = left;
        }
        if(right < list.size() && list.get(minIdx) > list.get(right)){
            minIdx = right;
        }

        if(minIdx != idx){
            int temp = list.get(minIdx);
            list.set(minIdx, list.get(idx));
            list.set(idx, temp);
            heapify(minIdx);
        }
    }
}