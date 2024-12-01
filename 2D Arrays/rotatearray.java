public class rotatearray{
    public static void inplaceChange(int nums[][]){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                int temp = nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
    }
    public static void printArray(int nums[][]){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int nums[][]={{1,2,3},{4,5,6},{7,8,9}};
        inplaceChange(nums);
        printArray(nums);
    }
}