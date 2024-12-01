public class binarySearch{
    public static int binarySearch(int arr[], int tar){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(tar==arr[mid]){
                return mid;
            }
            else if(tar>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14};
        int tar = 20;
        System.out.println(binarySearch(arr, tar));
    }
}