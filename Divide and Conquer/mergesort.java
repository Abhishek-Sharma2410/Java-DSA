public class mergesort{
    public static void mergeSort(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr, start, end, mid);
    }
    public static void merge(int arr[], int start, int end, int mid){
        int temp[] = new int[(end-start)+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(int m=0, n=start; m<temp.length; m++, n++){
            arr[n] = temp[m];
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {6, 7, 2, 4, 1, 3, 5};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}