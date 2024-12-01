public class minimumsum{
    public static int minimumSum(int arr[], int nums[]){
        int small1=Integer.MAX_VALUE, small2=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            small1=Math.min(small1, arr[i]);
            small2=Math.min(small2, nums[i]);
        }
        return (small1+small2);
    }
    public static void main(String args[]){
        int arr[]={5,6,10,4,9};
        int nums[]={1,2,3,4,5};
        System.out.println(minimumSum(arr, nums));
    }
}