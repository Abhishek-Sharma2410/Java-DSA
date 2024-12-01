public class swapminmax{
    public static void swapMinMax(int arr[]){
        int smallest=Integer.MAX_VALUE, largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            smallest=Math.min(smallest, arr[i]);
            largest=Math.max(largest, arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==smallest){
                arr[i]=largest;
            }
            else if(arr[i]==largest){
                arr[i]=smallest;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,4,10,14,2};
        swapMinMax(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}