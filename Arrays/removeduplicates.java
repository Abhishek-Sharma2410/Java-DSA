public class removeduplicates{
    public static int removeDuplicates(int nums[]){
        int i=0;
        for(int j=0; j<nums.length; i++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
            }
        }
        return i+1;
    }
    public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int nums[]={1,1,2,2,2,2,3,3,3};
        System.out.println(removeDuplicates(nums));
        printArray(nums);
    }
}