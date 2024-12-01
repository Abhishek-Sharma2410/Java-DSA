public class summinsubarray{
    // This is the burte force approach which takes cubical time complexity
    public static int maxSum(int arr[]){
        int maxSum=Integer.MIN_VALUE, sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                    maxSum=Math.max(maxSum, sum);
                }
                sum=0;
            } 
        }
        return maxSum;
    }

    // This is the slightly better approach for finding the maximum subarray sum which takes binomial TC.
    public static int maximumSum(int arr[]){
        int sum=0;
        int nums[] = new int[arr.length];
        nums[0]=arr[0];
        for(int i=1; i<nums.length; i++){
            nums[i]=nums[i-1]+arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                sum= (j==0)?nums[j]:(nums[i]+nums[j-1]);
            }
        }
        return sum;
    }

    // This is the optimal approach of finding the maximum subarray sum with the best time complexity
    public static int kadaneAlgo(int arr[]){
        int sum=0, maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum, sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }

    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        // System.out.println(maxSum(arr));
        // System.out.println(maximumSum(arr));
        System.out.println(kadaneAlgo(arr));
    }
}