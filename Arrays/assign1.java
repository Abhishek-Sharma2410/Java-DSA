// This is the brute force approach of the question optimal solution can be done by using hashsets
public class assign1{
    public static boolean isUnique(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        System.out.println(isUnique(arr));
    }
}