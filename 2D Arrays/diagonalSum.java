public class diagonalSum{
    //This is the optimal approach for this probelem and the brute force approach is written in the copy
    public static int diagonalSum(int nums[][]){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i][i];
            if(i!=nums.length-1-i){
                sum+=nums[i][nums.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int nums[][]={{1,2,3}, {4,5,6},{7,8,9}};
        System.out.println(diagonalSum(nums));
    }
}