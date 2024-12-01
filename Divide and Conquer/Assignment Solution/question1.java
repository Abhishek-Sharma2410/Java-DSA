public class question1{
    public static void mergeSort(String str[], int start, int end){
        if(start>=end) return;
        int mid = start + (end-start)/2;
        mergeSort(str, start, mid);
        mergeSort(str, mid+1, end);
        merge(str, start, end, mid);
    }
    public static void merge(String str[], int start, int end, int mid){
        String temp[] = new String[(end-start)+1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(str[i].compareToIgnoreCase(str[j])<0){
                temp[k] = str[i];
                i++;
                k++;
            }
            else{
                temp[k++] = str[j++];
            }
        }
        while(i<=mid) temp[k++] = str[i++];
        while(j<=end) temp[k++] = str[j++];
        for(int l=0, m=start; l<temp.length; l++, m++){
            str[m] = temp[l];
        }
    }
    public static void printString(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str[] = {"sun", "earth", "mars", "mercury"};
        mergeSort(str, 0, str.length-1);
        printString(str);
    }   
}