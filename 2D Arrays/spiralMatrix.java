public class spiralMatrix{
    public static void printSpiralMatrix(int nums[][]){
        int startingrow=0;
        int endingrow=nums.length-1;
        int startingcol=0;
        int endingcol=nums[0].length-1;
        while(startingrow<=endingrow && startingcol<=endingcol){
            for(int i=startingcol; i<=endingcol; i++){
                System.out.print(nums[startingrow][i]+" ");
            }
            for(int i=startingrow+1; i<=endingrow; i++){
                System.out.print(nums[i][endingcol]+" ");
            }
            for(int i=endingcol-1; i>=startingcol; i--){
                System.out.print(nums[endingrow][i]+" ");
            }
            for(int i=endingrow-1; i>=startingrow+1; i--){
                System.out.print(nums[i][startingcol]+" ");
            }
            startingrow++;
            startingcol++;
            endingrow--;
            endingcol--;
        }
        System.out.println();
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
        int nums[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};
        // printArray(nums);
        printSpiralMatrix(nums);
    }
}