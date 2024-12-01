public class stringsComparison{
    public static void main(String args[]){
        String str = "Abhishek";
        String str2 = "Abhishek";
        String str3 = new String("Abhishek");
        
        if(str==str2)
        System.out.println("equals");
        else
        System.out.println("Not Equals");

        if(str2==str3)
        System.out.println("Equals");
        else
        System.out.println("Not Equals");

        if(str2.equals(str3))
        System.out.println("Equals");
        else
        System.out.println("Not Equals");
    }
}