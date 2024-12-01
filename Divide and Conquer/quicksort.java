public class quicksort{
    public static void quickSort(int arr[], int start, int end){
        if(start>=end) return;
        int pivotIdx = partition(arr, start, end);
        quickSort(arr, start, pivotIdx-1);
        quickSort(arr, pivotIdx+1, end);
    }
    public static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int i = start-1;
        for(int j=start; j<end; j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {6,7,4,2,1,4,5};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}