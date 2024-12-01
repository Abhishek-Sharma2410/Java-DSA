import java.util.*;
public class bubbleSorting{
    public static void bubbleSorting(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean isSwapped = false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    isSwapped=true;
                }
            }
            if(isSwapped){
                break;
            }
        }
    }

    public static void selectionSorting(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int smallest=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }

    public static void inbuiltFunction(int arr[]){
        Arrays.sort(arr);
    }

    public static void decreasingOrder(Integer arr[]){
        Arrays.sort(arr,Collections.reverseOrder());
    }

    public static void printArray(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer nums[]={5,4,1,3,2};
        // bubbleSorting(nums);
        // selectionSorting(nums);
        // inbuiltFunction(nums);
        decreasingOrder(nums);
        printArray(nums);
    }
}