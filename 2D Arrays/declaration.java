import java.util.Scanner;
public class declaration{
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
        int matrix[][] = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        printArray(matrix);
    }
}