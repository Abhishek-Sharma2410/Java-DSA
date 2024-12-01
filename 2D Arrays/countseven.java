public class countseven{
    public static void main(String args[]){
        int nums[][]={{4,7,8}, {8,8,7}};
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(nums[i][j]==8){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}