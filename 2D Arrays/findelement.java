import java.util.Scanner;
public class findelement{
    public static boolean findElement(int nums[][], int number){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(nums[i][j]==number){
                    return true;
                }
            }
        }
        return false;
    }
    public static void inputValues(int nums[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                nums[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String args[]){
        int nums[][]=new int[3][3];
        inputValues(nums);
        System.out.println(findElement(nums, 20));
    }
}