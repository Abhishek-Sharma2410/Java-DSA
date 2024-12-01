import java.util.Scanner;
public class largestsmallest{
    public static int findLargest(int nums[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                largest=Math.max(largest, nums[i][j]);
            }
        }
        return largest;
    }
    public static int findSmallest(int nums[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                smallest=Math.min(smallest, nums[i][j]);
            }
        }
        return smallest;
    }
    public static void inputArray(int nums[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                nums[i][j]=sc.nextInt();
            }
        }
    }
    public static void main(String args[]){
        int nums[][]=new int[3][3];
        inputArray(nums);
        System.out.println(findLargest(nums));
        System.out.println(findSmallest(nums));
    }
}