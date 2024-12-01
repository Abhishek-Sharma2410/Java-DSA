public class declaration{
    public static void main(String args[]){
        int arr[] = new int[6];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        String str[] = new String[3];
        str[0] = "Apple";
        str[1] = "Microsoft";
        str[2] = "Google";
        for(int i=0; i<str.length; i++){
            System.out.print(str[i] +" ");
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}