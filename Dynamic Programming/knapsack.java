public class knapsack{
    public static int maxCapacity(int value[], int weight[], int capacity, int index){
       if(capacity==0 || index==0) return 0;
       if(weight[index-1]<=capacity){
            // Takes
            int answer1 = value[index-1] + maxCapacity(value, weight, capacity-weight[index-1], index-1);
            // Not takes
            int answer2 =  maxCapacity(value, weight, capacity, index-1);
            return Math.max(answer1, answer2);
       } 
       else{
            return maxCapacity(value, weight, capacity, index-1);
       }
    }
    public static int zeroOneKnapsackMemoization(int wt[], int val[], int capacity, int idx, int dp[][]){
        if(capacity==0 || idx==0) return 0;
        if(dp[idx][capacity]!=-1){
            return dp[idx][capacity];
        }
        if(wt[idx-1]<=capacity){
            int ans1 = val[idx-1] + zeroOneKnapsackMemoization(wt, val, capacity-wt[idx-1], idx-1, dp);
            int ans2 = zeroOneKnapsackMemoization(wt, val, capacity, idx-1, dp);
            dp[idx][capacity] = Math.max(ans1, ans2);
            return dp[idx][capacity];
        }
        else{
            return dp[idx][capacity] = zeroOneKnapsackMemoization(wt, val, capacity, idx-1, dp);
        }
    }
    public static void dpinit(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }
    }
    public static void main(String args[]){
        int value[] = {15, 14, 10, 45, 30};
        int weight[] = {2, 5, 1, 3, 4};
        int capacity = 7;
        int dp[][] = new int[value.length+1][capacity+1];
        dpinit(dp);
        // System.out.println(maxCapacity(value, weight, capacity, value.length));
        System.out.println(zeroOneKnapsackMemoization(weight, value, capacity, value.length, dp));
    }
}