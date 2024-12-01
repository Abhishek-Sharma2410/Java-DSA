import java.util.ArrayList;
public class ReverseList{
    public static ArrayList<Integer> reverseList(ArrayList<Integer> list){
        int start = 0, end = list.size()-1;
        while(start<end){
            int temp = list.get(end);
            list.set(end, list.get(start));
            list.set(start, temp);
            start++;
            end--;
        }
        return list;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        reverseList(list);
        System.out.println(list);
    }
}