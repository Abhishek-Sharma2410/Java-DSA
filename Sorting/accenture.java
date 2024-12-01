import java.util.Arrays;
public class accenture{
    public static int secondLargest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static void main(String args[]){
        int arr[]={1,5,6,7,21};
        System.out.println(secondLargest(arr));
    }
}