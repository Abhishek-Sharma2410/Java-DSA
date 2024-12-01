public class question4{
    public static void countSubStrings(String str, int i, int count){
        if(i==str.length()){
            System.out.println(count);
            return;
        }
        for(int j=i; j<str.length(); j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
        }
        countSubStrings(str, i+1, count);
    }
    public static void main(String args[]){
        countSubStrings("abhisheksharma", 0, 0);
    }
}