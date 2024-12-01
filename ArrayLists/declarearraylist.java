import java.util.ArrayList;
public class declarearraylist{
    public static void main(String args[]){
        ArrayList<Integer> myList = new ArrayList<>();
        //Adding Elements to ArrayList
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList);
        //Getting an Element form the ArrayList
        System.out.println(myList.get(3));
        //Removing an Element on a particular Index
        myList.remove(2);
        System.out.println(myList);
        //Setting an Element at a particular Index
        myList.set(2, 8);
        System.out.println(myList);
        //Checking if an Element is present in our Arraylist or not
        if(myList.contains(3)) System.out.println("Contains the Element");
        else System.out.println("Doesn't Contains the Element");

        //Adding a value at a particular index
        myList.add(2, 10);
        System.out.println(myList);
    }
}