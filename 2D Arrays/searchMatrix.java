import java.util.Scanner;
public class searchMatrix{
    public static boolean searchSortedMatrix(int nums[][], int target){
        int startingRow=nums.length-1, startingCol=0;
        while(startingRow>=0 && startingCol<nums[0].length){
            if(nums[startingRow][startingCol]==target){
                return true;
            }
            else if(nums[startingRow][startingCol]>target){
                startingRow--;
            }
            else{
                startingCol++;
            }
        }
        return false;
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
        Scanner sc = new Scanner(System.in);
        int nums[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int target = sc.nextInt();
        printArray(nums);
        System.out.println(searchSortedMatrix(nums, target));
    }
}