public class firstandlastoccurence{
    public static int firstOccurence(int arr[], int key, int i){
        if(i==arr.length-1) return -1;
        if(arr[i]==key) return i;
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[], int key, int i){
        if(i==0) return -1;
        if(arr[i]==key) return i;
        return lastOccurence(arr, key, i-1);
    }
    public static void main(String args[]){
        int arr[] = {8, 9, 10, 4,5, 7,8 ,2, 4,5, 7};
        System.out.println(firstOccurence(arr, 5, 0));
        System.out.println(lastOccurence(arr, 5, arr.length-1));
    }
}