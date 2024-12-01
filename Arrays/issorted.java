public class issorted{
    public static boolean isSorted(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]= {1,2,2,31,41,51};
        System.out.println(isSorted(arr));
    }
}