public class passbyref{
    public static void update(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i]+=1;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,4,12};
        update(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}