public class tcsassignment{
    public static void countingNumbers(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(largest, arr[i]);
        }
        int nums[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            nums[arr[i]]++;
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                System.out.print(i+"-"+"0");
            }
            else{
                System.out.print(i+"-"+nums[i]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={1,1,2,3,1,2,2,3,2,1,5};
        countingNumbers(arr);
    }
}