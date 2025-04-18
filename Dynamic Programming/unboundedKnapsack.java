public class unboundedKnapsack{
    public static int unboundedKnapsack(int value[], int weight[], int capacity){
        int n = value.length;
        int dp[][] = new int[n+1][capacity+1];
        //Making 0th column to 0
        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = 0;
        }
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(weight[i-1]<=j){
                    dp[i][j] = Math.max(value[i-1] + dp[i][j-weight[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][capacity];
    }
    public static void main(String args[]){
        int value[] = {15, 14, 10, 45, 30};
        int weight[] = {2, 5, 1, 3, 4};
        int capacity = 7;
        System.out.println(unboundedKnapsack(value, weight, capacity));
    }
}