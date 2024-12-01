public class printintersection{
    public static void printIntersection(int arr[], int nums[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<nums.length; j++){
                if(arr[i]==nums[j]){
                    System.out.print(nums[j]+" ");
                }
            }
        }
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,9};
        int arr[]={3,4,5,6,7,8,9};
        printIntersection(arr, nums);
    }
}