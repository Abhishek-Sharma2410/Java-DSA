public class trappingrainwater{
    public static int trappingRainWater(int arr[]){
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];
        int trappedWater=0;
        leftMax[0]=arr[0];
        rightMax[rightMax.length-1]=arr[arr.length-1];
        for(int i=1; i<leftMax.length; i++){
            leftMax[i]=Math.max(leftMax[i-1], arr[i]);
        }
        for(int i=rightMax.length-2; i>=0; i--){
            rightMax[i]=Math.max(rightMax[i+1], arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            trappedWater+=((Math.min(leftMax[i], rightMax[i]))-arr[i]);
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int nums[]={4,3,0,6,3,2,5};
        System.out.println(trappingRainWater(nums));
    }
}