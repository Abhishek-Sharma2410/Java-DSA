// Moore's Voting Algorithm Applied with recursive function

public class majorityElement{
    public static int majorityElement(int arr[], int i){
        int frequency = 0, value = arr[0];
        if(i==arr.length-1) return value;
        if(frequency == 0) value = arr[i];
        else if(value == arr[i]) frequency++;
        else frequency--;
        return majorityElement(arr, i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,2,1,1,1,};
        System.out.println(majorityElement(arr, 0));
    }
}