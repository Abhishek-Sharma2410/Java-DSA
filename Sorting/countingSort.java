public class countingSort{
    public static void countingSort(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            largest= Math.max(largest, nums[i]);
        }
        int arr[] = new int[largest+1];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]]++;
        }
        int j=0; 
        for(int i=0; i<arr.length; i++){
            while(arr[i]>0){
                nums[j]=i;
                j++;
                arr[i]--;
            }
        }
    }
    public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArray(arr);
    }
}