public class rotatearray{
    public static void rotateByOneArray(int nums[]){
        int temp=nums[0];
        for(int i=1; i<nums.length; i++){
            nums[i-1]=nums[i];
            if(i==nums.length-1){
                nums[i]=temp;
            }
        }
    }
    // This is the brute force approach for the problem of rotating the array by n places
    public static void rotateByNArray(int nums[], int n){
        // n=n%(nums.length);
        int temp[]=new int[n+1];
        int j=0;
        for(int i=0; i<n+1; i++){
            temp[i]=nums[i];
        }
        for(int i=n+1; i<nums.length; i++){
            nums[i-(n+1)]=nums[i];
        }
        for(int i=nums.length-(n+1); i<nums.length; i++){
            nums[i]=temp[j];
            j++;
        }
        printArray(temp);
    }
    public static void optimalRotate(int nums[], int k){
        int firstStart=0, firstEnd=k, secondStart=k+1, secondEnd=nums.length-1;
        while(firstStart<firstEnd && secondStart<secondEnd){
            int temp = nums[firstStart];
            nums[firstStart] = nums[firstEnd];
            nums[firstEnd] = temp;
            int temp2=nums[secondStart];
            nums[secondStart]=nums[secondEnd];
            nums[secondEnd]=temp2;
            firstStart++;
            firstEnd--;
            secondStart++;
            secondEnd--;
        }
        int wholeStart=0, wholeEnd=nums.length-1;
        while(wholeStart<wholeEnd){
            int temp=nums[wholeStart];
            nums[wholeStart]=nums[wholeEnd];
            nums[wholeEnd]=temp;
        }
        printArray(nums);
    }
    public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int nums[]={-1,-100,3,99};
        // rotateByOneArray(nums);
        // rotateByNArray(nums, 2);
        optimalRotate(nums, 3);
        printArray(nums);
    }
}