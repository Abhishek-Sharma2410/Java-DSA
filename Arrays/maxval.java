public class maxval{
    public static int printSecondLargest(int nums[]){
        int largest = nums[0];
        int secondLargest = -1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
            }
            if(nums[i]<largest && nums[i]>secondLargest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
    public static void maxandminValue(int arr[]){
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            maximum = Math.max(maximum, arr[i]);
            minimum = Math.min(minimum, arr[i]);
        }
        System.out.print(minimum+" ");
        System.out.println(maximum);
    }
    public static void main(String args[]){
        int arr[] = {1,2,6,3,5};
        maxandminValue(arr);
        System.out.println(printSecondLargest(arr));
    }
}