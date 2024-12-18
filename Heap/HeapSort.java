public class HeapSort{
    public static void heapSort(int arr[]){
        //Step - 1 (convert into max heap)
        for(int i=arr.length/2; i>=0; i--){
            heapify(arr, i, arr.length);
        }

        //Step - 2 (Swapping of the value)
        for(int i=arr.length-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //Step - 3 (call heapify function)
            heapify(arr, 0, i);
        }
    }
    public static void heapify(int arr[], int idx, int size){
        int left = 2*idx + 1;
        int right = 2*idx + 2;
        int maxIdx = idx;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != idx){
            int temp = arr[idx];
            arr[idx] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 4, 5, 3};
        printArray(arr);
        heapSort(arr);
        printArray(arr);
    }
}