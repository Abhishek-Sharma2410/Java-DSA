public class restnumber{
    public static int restNumber(int arr[]){
        int sum=0, maxVal=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            maxVal=Math.max(maxVal, arr[i]);
        }
        return ((maxVal*(maxVal+1)/2)-sum);
    }
    public static void main(String args[]){
        int arr[]={8,6,4,5,2,3,1,0};
        System.out.print(restNumber(arr));
    }
}