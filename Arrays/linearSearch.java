public class linearSearch{
    public static int indexTar(int arr[], int tar){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14,16};
        int tar = 20;
        System.out.println(indexTar(arr, tar));
    }
}