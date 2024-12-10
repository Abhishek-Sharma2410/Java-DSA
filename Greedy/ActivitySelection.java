import java.util.ArrayList;
public class ActivitySelection{
    public static void main(String args[]){
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        count = 1;
        list.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            if(start[i]>=lastEnd){
                count++;
                list.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Maximum count : "+ count);
        for(int i=0; i<list.size(); i++){
            System.out.print("A" + list.get(i) + " ");
        }
        System.out.println();
    }
}
