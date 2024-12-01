public class printpairs{
    public static void main(String args[]){
        int totalPairs=0;
        int arr[]={2,4,6,8,10};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println(totalPairs);
    }
}