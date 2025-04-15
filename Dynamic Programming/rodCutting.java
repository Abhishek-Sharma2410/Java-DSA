public class rodCutting{
    public static int rodCutting(int len[], int prices[], int capacity){
        int n = len.length;
        int dp[][] = new int[n+1][capacity+1];

        // (i, j) is the maximum profit you can achieve with ith length of rod with jth capacity
        // Making 0th the columns to zero as if the capacity is zero there no profit can be achieved
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        // Making 0th row to zero as there is no profit if length of the rod is zero
        for(int i=0; i<dp[0].length; i++){
            dp[0][i] = 0;
        }

        // Filling the table
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                // Valid
                if(len[i-1] <= j){
                    dp[i][j] = Math.max(prices[i-1] + dp[i-1][j-len[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][capacity];
    }
    public static void main(String args[]){
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int maxLength = 8;
        System.out.println(rodCutting(length, prices, maxLength));
    }
}