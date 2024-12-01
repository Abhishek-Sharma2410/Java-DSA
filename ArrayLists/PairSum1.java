import java.util.ArrayList;
public class PairSum1{
    public static boolean pairSum(ArrayList<Integer> list, int tar){
        int start = 0, end = list.size()-1;
        while(start<end){
            if(list.get(start)+list.get(end)==tar){
                return true;
            }
            else if((list.get(start)+list.get(end))>tar) end--;
            else start++;
        }
        return false;
    }
    public static void main(String args[]){
        int target = 5;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairSum(list, target));
    }
}