import java.util.Arrays;
import java.util.HashSet;
public class LIS{
    public static int longestIncreasingSubsequence(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        int i=0;
        int sortedArray[] = new int[set.size()];
        for(int number : set){
            sortedArray[i] = number;
            i++;
        }
        Arrays.sort(sortedArray);
        return lcs(arr, sortedArray);
    }
    public static int lcs(int arr[], int nums[]){
        int n = arr.length;
        int m = nums.length;
        int dp[][] = new int[n+1][m+1];
        //Initialzation can be skipped
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(arr[i-1]==nums[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        int arr[] = {50, 10, 2, 3, 1, 10, 11};
        System.out.println(longestIncreasingSubsequence(arr));
    }
}