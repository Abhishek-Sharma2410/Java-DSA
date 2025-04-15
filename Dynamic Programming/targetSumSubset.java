public class targetSumSubset{
    public static boolean targetSumSubset(int numbers[], int target){
        boolean dp[][] = new boolean[numbers.length+1][target+1];
        for(int i=0; i<dp.length; i++){
            dp[i][0] = true;
        }   
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                int v = numbers[i-1];
                //include
                if(v <= j && dp[i-1][j-v]){
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[numbers.length][target];
    }
    public static void main(String args[]){
        int numbers[] = {4, 2, 7, 1, 3};
        int target = 20;
        System.out.println(targetSumSubset(numbers, target));
    }
}