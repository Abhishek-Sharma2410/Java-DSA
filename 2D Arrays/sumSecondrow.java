public class sumSecondrow{
    public static void main(String args[]){
        int sum=0;
        int arr[][]={{1,4,9}, {11,4,3}, {2,2,3}};
        for(int i=0; i<arr[1].length; i++){
            sum+=arr[1][i];
        }
        System.out.println(sum);
    }
}