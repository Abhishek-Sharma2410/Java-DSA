public class transpose{
    public static void transposeMatrix(int arr[][]){
        int nums[][]=new int[arr[0].length][arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                nums[j][i]=arr[i][j];
            }
        }
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6}};
        transposeMatrix(arr);
    }
}